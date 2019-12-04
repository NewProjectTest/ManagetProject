package com.zhiyou.service;

import java.util.List;

import com.zhiyou.model.Video;

public interface VideoService {

	List<Video> videoShow(Integer page);

	int count();

	void Dvideo(Integer id);

}
