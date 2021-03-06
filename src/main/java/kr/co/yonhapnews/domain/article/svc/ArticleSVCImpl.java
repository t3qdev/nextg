package kr.co.yonhapnews.domain.article.svc;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import kr.co.yonhapnews.domain.article.vo.ArticleDVO;
import kr.co.yonhapnews.domain.article.vo.ArticleSVO;


@Service("ArticleSVC")
public class ArticleSVCImpl implements ArticleSVC {

	private final Logger logger = LoggerFactory.getLogger( this.getClass() );
	
	@Resource
	ArticleDAO  articleDAO;
	
	@Override
	public int writeArticle(ArticleSVO articleSVO) {

		ArticleDVO  articleDVO = new ArticleDVO();
		BeanUtils.copyProperties(articleSVO, articleDVO);	
		return articleDAO.insArticle(articleDVO);	
	}

 
	@Override
	public List<ArticleSVO> selListArticle(Map map) {
		
		List<ArticleSVO>  list = new ArrayList<ArticleSVO>();
		List<ArticleDVO> listArticle = articleDAO.selListArticle(map);
		for(int i=0; i < listArticle.size() ; i++){
			ArticleSVO articleSVO = new ArticleSVO();
			BeanUtils.copyProperties(listArticle.get(i) , articleSVO );
			list.add(articleSVO);
		} 
		return list;
	}

	@Override
	public ArticleSVO selArticle(int articleNum) {
		ArticleSVO articleSVO = new ArticleSVO();
		ArticleDVO articleDVO = articleDAO.selArticle(articleNum);
		BeanUtils.copyProperties(articleDVO , articleSVO );
		return articleSVO;
	}


	@Override
	public int selArticleCnt(Map map) {

		return articleDAO.selArticleCnt(map);
	}

 

}
