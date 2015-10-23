package kr.co.yonhapnews.biz.article.svc;

import java.util.List;

import kr.co.yonhapnews.biz.article.vo.ArticleBVO;

public interface ArticleBIZ {

	
	public void ArticleList();
	
	public List<ArticleBVO> selListArticle();
	
}
