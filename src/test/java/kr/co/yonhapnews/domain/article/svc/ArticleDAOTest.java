package kr.co.yonhapnews.domain.article.svc;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import kr.co.yonhapnews.domain.article.vo.ArticleDVO;

@ContextConfiguration(locations = "classpath:META-INF/spring/app-context.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class ArticleDAOTest {
    
    @Autowired
    ArticleDAO articleDAO;
    
    @Test
    public void selArticle() {
        ArticleDVO vo = articleDAO.selArticle(4);
        assertNotNull(vo);
    }
}
