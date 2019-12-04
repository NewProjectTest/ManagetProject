package com.zhiyou.mapper;

import java.util.List;

import com.zhiyou.model.Video;

public interface VideoMapper {

	List<Video> videoShow(Integer page);

	int count();

	void Dvideo(Integer id);

}
