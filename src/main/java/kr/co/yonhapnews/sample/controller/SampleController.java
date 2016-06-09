package kr.co.yonhapnews.sample.controller;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.codehaus.jackson.map.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import kr.co.yonhapnews.biz.article.svc.ArticleBIZ;
import kr.co.yonhapnews.biz.article.vo.ArticleBVO;
import kr.co.yonhapnews.web.article.controller.ArticleValidator;
import kr.co.yonhapnews.web.common.UserUtils;


@Controller
@RequestMapping("/sample")
public class SampleController {
	
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
	public String articleList(Model model, @RequestParam Map<String, Object> map) throws Exception{
		
		
		/*페이징 처리*/
		map.put("ROW_PER_PAGE", 5); //페이지당 리스트수
		int page = (map.get("PAGE") != null )?  Integer.parseInt((String) map.get("PAGE")):1;
		map.put("PAGE", page);
		int total = articleBIZ.selArticleCnt(map);
		map.put("TOTAL", total);
		Map<String,Object> temp = UserUtils.paging(page, total, (int) map.get("ROW_PER_PAGE"), "DESC");
		map.putAll(temp);
		model.addAttribute("paging", map);
		
	    ObjectMapper mapper = new ObjectMapper();
	    String mapJson = mapper.writeValueAsString(map);  
	    model.addAttribute("POST_DATA", mapJson);	
		
		List<ArticleBVO> articleList = articleBIZ.selListArticle(map);
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
	@RequestMapping(value={"/writing"},method={RequestMethod.POST})
	public String articleWrite(Model model , @ModelAttribute("ArticleBVO") ArticleBVO articleBVO , BindingResult result, RedirectAttributes redirectAttr){
 		
		// Validator 
		new ArticleValidator().validate(articleBVO, result); 
		if(result.hasErrors()){
			//result.getModel();
			redirectAttr.addFlashAttribute("error", result.getAllErrors() );
			return "redirect:/article/write";
		}
		
		int writeRes = 0;	
		//TODO 엠바고처리 필요.
		articleBVO.setSTATE("S");
		
		writeRes = articleBIZ.writeArticle(articleBVO);
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
