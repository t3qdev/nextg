package kr.co.yonhapnews.web.main.controller;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.co.yonhapnews.biz.main.svc.LoginBIZ;


@Controller
public class LoginController {
	
	private final Logger logger = LoggerFactory.getLogger( this.getClass() );
	
/*	@Resource
	LoginBIZ  loginSVC;*/
	

	@RequestMapping(value={"","/login"})
	public String login(Model model){
		
		return "main/login";
	}
	
	
	public String loginExe(){
		
		return "loginExe";
	}
	
}
