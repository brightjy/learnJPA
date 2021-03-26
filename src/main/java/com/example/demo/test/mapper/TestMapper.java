package com.example.demo.test.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.example.demo.test.vo.TestVO;

@Repository
@Mapper
public interface TestMapper {
	List<TestVO> selectTest();
}
