package kr.co.yonhapnews.sample.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import kr.co.yonhapnews.sample.mapper.SampleMapper;
import kr.co.yonhapnews.sample.service.SampleService;
import kr.co.yonhapnews.sample.vo.SampleVo;

@Service
public class SampleServiceImpl implements SampleService {

	private final Logger logger = LoggerFactory.getLogger( this.getClass() );
	
	@Resource
    SampleMapper exampleMapper;
	
    @Cacheable(value = "sampleCache")
	@Override
    public List<SampleVo> selectArticleList(SampleVo vo) {
		
        return exampleMapper.selectArticleList(vo);
	}
}
