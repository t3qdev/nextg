package kr.co.yonhapnews.sample.service;

import java.util.List;

import kr.co.yonhapnews.sample.vo.SampleVo;

public interface SampleService {
	
    public List<SampleVo> selectArticleList(SampleVo vo);
}
