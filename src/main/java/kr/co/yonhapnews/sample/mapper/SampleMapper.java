package kr.co.yonhapnews.sample.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import kr.co.yonhapnews.sample.vo.SampleVo;

@Repository
public interface SampleMapper {

    public List<SampleVo> selectArticleList(SampleVo vo);
}
