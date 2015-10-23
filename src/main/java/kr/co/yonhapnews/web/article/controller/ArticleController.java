package kr.co.yonhapnews.web.article.controller;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import kr.co.yonhapnews.biz.article.svc.ArticleBIZ;


@Controller
@RequestMapping("/article")
public class ArticleController {
	
 
	
/*	@Resource 
	ArticleBIZ	articleBIZ;
	*/
	
	@RequestMapping(value={"","/","/list"})
	public String articleList(Model model,@RequestParam Map<String, Object> map){
		
		return "article/list";
	}

	@RequestMapping(value={"/write"})
	public String articleWrite(Model model){
		
		return "article/write";
	}
}
