package kr.co.yonhapnews.biz.article.svc;

import java.util.List;
import java.util.Map;

import kr.co.yonhapnews.biz.article.vo.ArticleBVO;
import kr.co.yonhapnews.domain.article.vo.ArticleSVO;

public interface ArticleBIZ {
	
 
	public List<ArticleBVO> selListArticle();
	
	public int writeArticle(ArticleBVO articleBVO);
	
}
