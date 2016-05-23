package kr.co.yonhapnews.domain.article.svc;

import static org.junit.Assert.assertNotNull;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import kr.co.yonhapnews.domain.article.vo.ArticleSVO;

@ContextConfiguration(locations = "classpath:META-INF/spring/app-context.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class ArticleSVCImplTest {
    
    @Resource
    ArticleSVC articleSVC;
    
    @Test
    public void selArticle() {
        ArticleSVO vo = articleSVC.selArticle(4);
        assertNotNull(vo);
    }
}
