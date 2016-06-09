package kr.co.yonhapnews.sample.mapper;

import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import kr.co.yonhapnews.sample.mapper.SampleMapper;
import kr.co.yonhapnews.sample.vo.SampleVo;

@ContextConfiguration(locations = "classpath:META-INF/spring/app-context.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class SampleMapperTest {
    
    @Autowired
    SampleMapper mapper;
    
    @Test
    public void selectArticleList() {
        SampleVo vo = new SampleVo();
        List<SampleVo> list = mapper.selectArticleList(vo);
        assertNotNull(list);
    }
}
