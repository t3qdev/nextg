package kr.co.yonhapnews.web.article.controller;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import kr.co.yonhapnews.biz.article.svc.ArticleBIZ;
import kr.co.yonhapnews.biz.article.vo.ArticleBVO;


@Controller
@RequestMapping("/article")
public class ArticleController {
	
	private final Logger logger = LoggerFactory.getLogger( this.getClass() );
	
 	@Resource 
	ArticleBIZ	articleBIZ;
 	
 
	@RequestMapping(value={"","/","/list"})
	public String articleList(Model model, @RequestParam Map<String, Object> map){
		
		List<ArticleBVO> articleList = articleBIZ.selListArticle();
		model.addAttribute("articleList", articleList);
		
		logger.debug("SVO to BVO");
		return "article/list";
	}

	@RequestMapping(value={"/write"})
	public String articleWrite(Model model){
		
		return "article/write";
	}
	
	@RequestMapping(value={"/writing"})
	public String articleWrite(Model model , @ModelAttribute("ArticleBVO") ArticleBVO articleBVO){
 		
		int result = 0;	
		//TODO 엠바고처리 필요.
		articleBVO.setSTATE("S");
		
		result = articleBIZ.writeArticle(articleBVO);
		//TODO 오류에 대한 처리 필요 
		
		//TODO 정상 처리후 리턴
		return "redirect:/article/";
	}
	
	
}
