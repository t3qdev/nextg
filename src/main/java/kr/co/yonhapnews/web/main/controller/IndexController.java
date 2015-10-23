package kr.co.yonhapnews.web.main.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
	private final Logger logger = LoggerFactory.getLogger( this.getClass() );
	
	@RequestMapping(value={"/"})
	public String index(Model model){
		
		return "index";
	}
	
	
	@RequestMapping(value={"/intro"})
	public String introx(Model model){
		
		return "intro";
	}
	
}
