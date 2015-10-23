package kr.co.yonhapnews.domain.article.svc;

import java.util.List;

import kr.co.yonhapnews.domain.article.vo.ArticleDVO;

public interface ArticleSVC {
	
	/**
	 * 기사 쓰기
	 * @param articleDVO
	 * @return
	 */
	public int writeArticle(ArticleDVO  articleDVO);
	
	/**
	 * 기사 리스트 가져오기
	 * @return
	 */
	public List<ArticleDVO> selListArticle();
	
	
	/**
	 * 기사 하나 보기
	 * @param articleDVO
	 * @return
	 */
	public ArticleDVO selArticle(ArticleDVO  articleDVO);
	
	
}
