package kr.co.yonhapnews.sample.service;

import static org.junit.Assert.assertNotNull;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import kr.co.yonhapnews.sample.vo.SampleVo;

@ContextConfiguration(locations = "classpath:META-INF/spring/app-context-test.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class SampleServiceTest {
    
    @Resource
    SampleService service;
    
    @Test
    public void selectArticleList() {
        SampleVo vo = new SampleVo();
        List<SampleVo> list = service.selectArticleList(vo);
        System.out.println(list);
        assertNotNull(list);

        //test cache
        list = service.selectArticleList(vo);
        System.out.println(list);
        assertNotNull(list);
    }
}
