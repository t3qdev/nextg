package kr.co.yonhapnews.domain.article.svc;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import kr.co.yonhapnews.domain.article.vo.ArticleDVO;

@Repository
public interface ArticleDAO {

	public List<ArticleDVO> selListArticle(Map map);
	
	public int insArticle(ArticleDVO articleDVO);
	
	public ArticleDVO selArticle(int IDX);
	
	public int selArticleCnt(Map map);
	
}
