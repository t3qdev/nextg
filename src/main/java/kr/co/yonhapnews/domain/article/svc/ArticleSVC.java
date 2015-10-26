package kr.co.yonhapnews.domain.article.svc;

import java.util.List;
import java.util.Map;

import kr.co.yonhapnews.domain.article.vo.ArticleSVO;

public interface ArticleSVC {
	
	/**
	 * 기사 쓰기
	 * @param articleDVO
	 * @return
	 */
	public int writeArticle(ArticleSVO articleSVO);
	
	/**
	 * 기사 리스트 가져오기
	 * @return
	 */
	public List<ArticleSVO> selListArticle();
	
	
	/**
	 * 기사 하나 보기
	 * @param articleDVO
	 * @return
	 */
	public ArticleSVO selArticle(int articleNum);

 
	
	
}
