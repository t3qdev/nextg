package kr.co.yonhapnews.common.authentication;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;

import kr.co.yonhapnews.login.controller.LoginController;

public class CustomAuthenticationProvider implements AuthenticationProvider {

    private static final Logger logger = LoggerFactory.getLogger(LoginController.class);

    @Resource
    CustomUserDetailsService customUserDetailsService;

    @Resource
    private PasswordEncoder passwordEncoder;

    @Override
    public boolean supports(Class<?> authentication) {
        return authentication.equals(UsernamePasswordAuthenticationToken.class);
    }

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {

        String userId = (String) authentication.getPrincipal();
        String userPw = (String) authentication.getCredentials();

        logger.info("사용자가 입력한 로그인정보입니다. {}", userId + "/" + userPw);

        UserDetails userDetails = customUserDetailsService.loadUserByUsername(userId);

        if (!passwordEncoder.matches(userPw, userDetails.getPassword())) {
            throw new BadCredentialsException("비밀번호가 일치하지 않습니다.");
        }

        List<GrantedAuthority> roles = new ArrayList<>();
        roles.add(new SimpleGrantedAuthority("ROLE_USER"));

        UsernamePasswordAuthenticationToken result = new UsernamePasswordAuthenticationToken(userId, userPw, roles);
        result.setDetails(userDetails);

        return result;
    }
}