package kr.co.yonhapnews.biz.article.svc;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import kr.co.yonhapnews.biz.article.vo.ArticleBVO;
import kr.co.yonhapnews.domain.article.svc.ArticleSVC;
import kr.co.yonhapnews.domain.article.vo.ArticleDVO;
import kr.co.yonhapnews.domain.article.vo.ArticleSVO;

@Service("ArticleBIZ")
public class ArticleBIZImpl implements ArticleBIZ {

	private final Logger logger = LoggerFactory.getLogger( this.getClass() );
	
	@Resource 
	ArticleSVC articleSVC;
 
	
	/**
	 * 기사 리스트를 가져온다.
	 * 여러가지 서비스를 
	 */
	@Override
	public List<ArticleBVO> selListArticle() {
		
		
		List<ArticleBVO>  list = new ArrayList<ArticleBVO>();
		
		List<ArticleSVO>  listArticle = articleSVC.selListArticle();
 
		for(int i=0; i<listArticle.size(); i++){
			ArticleBVO articleBVO = new ArticleBVO();
			BeanUtils.copyProperties(listArticle.get(i) ,articleBVO );	
			list.add(articleBVO);			  
		}
 
		return list;
	}

	/**
	 * 기사 작성
	 * 
	 */
	@Override
	public int writeArticle(ArticleBVO articleBVO) {

		ArticleSVO  articleSVO = new ArticleSVO();
		BeanUtils.copyProperties(articleBVO, articleSVO);
		
		articleSVC.writeArticle(articleSVO);
		
		return 0;
	}

}
