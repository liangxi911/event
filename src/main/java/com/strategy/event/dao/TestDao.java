package com.strategy.event.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
@Mapper
public interface TestDao {
	@Select("SELECT COUNT(1) FROM t_english")
	public String getDataCount();
}
