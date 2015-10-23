package kr.co.yonhapnews.domain.article.svc;

import java.util.List;

import javax.annotation.Resource;

import kr.co.yonhapnews.domain.article.vo.ArticleDVO;

public class ArticleSVCImpl implements ArticleSVC {

	@Resource
	ArticleDAO  aticleDAO;
	
	@Override
	public int writeArticle(ArticleDVO articleDVO) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ArticleDVO selArticle(ArticleDVO articleDVO) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ArticleDVO> selListArticle() {
		// TODO Auto-generated method stub
		return null;
	}

}
