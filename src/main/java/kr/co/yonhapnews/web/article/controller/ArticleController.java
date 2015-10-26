package kr.co.yonhapnews.web.article.controller;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
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
 	
 
 	/**
 	 * 기사리스트
 	 * @param model
 	 * @param map
 	 * @return
 	 */
	@RequestMapping(value={"","/","/list"})
	public String articleList(Model model, @RequestParam Map<String, Object> map){
		
		List<ArticleBVO> articleList = articleBIZ.selListArticle();
		model.addAttribute("articleList", articleList);
		
		logger.debug("SVO to BVO");
		return "article/list";
	}

	/**
	 * 기사 쓰기화면
	 * @param model
	 * @return
	 */
	@RequestMapping(value={"/write"})
	public String articleWrite(Model model){
		
		return "article/write";
	}
	
	/**
	 * 기사 쓰기 액션
	 * @param model
	 * @param articleBVO
	 * @return
	 */
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
 
	/**
	 * 기사 읽기
	 * @param mid
	 * @param model
	 * @return
	 */
	@RequestMapping(value={"/view/{articleNum}"})
	public String articleView(@PathVariable("articleNum") int articleNum , Model model){
		
		ArticleBVO articleBVO = articleBIZ.viewArticle(articleNum);
		model.addAttribute("articleBVO", articleBVO);
		return "article/view";
		
	}
	
}
