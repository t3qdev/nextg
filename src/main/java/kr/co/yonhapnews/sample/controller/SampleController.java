package kr.co.yonhapnews.sample.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.co.yonhapnews.sample.service.SampleService;
import kr.co.yonhapnews.sample.vo.SampleVo;

@Controller
@RequestMapping("/sample")
public class SampleController {
	
 	@Resource 
    SampleService sampleService;
 	
 	/**
 	 * 기사리스트
 	 * @param model
 	 * @param map
 	 * @return
 	 */
	@RequestMapping(value={"","/","/list"})
    public String articleList(Model model, SampleVo vo) throws Exception {
		
        List<SampleVo> articleList = sampleService.selectArticleList(vo);
		model.addAttribute("articleList", articleList);
		
        return "sample/list";
	}
}
