package kr.co.yonhapnews.biz.article.svc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.BeanUtils;

import kr.co.yonhapnews.biz.article.vo.ArticleBVO;
import kr.co.yonhapnews.domain.article.svc.ArticleSVC;
import kr.co.yonhapnews.domain.article.vo.ArticleDVO;

public class ArticleBIZImpl implements ArticleBIZ {

	@Resource 
	ArticleSVC articleSVC;
	
	
	
	@Override
	public void ArticleList() {
		// TODO Auto-generated method stub

	}

	/**
	 * 기사 리스트를 가져온다.
	 * 여러가지 서비스를 
	 */
	@Override
	public List<ArticleBVO> selListArticle() {
		List  list = new ArrayList();
		/*
		
		ArticleBVO articleBVO = new ArticleBVO();
		List<ArticleDVO> listArticle= articleSVC.selListArticle();
		
		Collections.copy(list, listArticle);
		*/
		//BeanUtils.copyProperties(ISvo, crsCrashDVO);
		
		/*
		for(int i=0; i<fromBeanList.size(); i++){
			  BeanUtils.copyProperties(toBeanList.get(i) , fromBeanList.get(i) );
		}
		*/
		return list;
	}

}
