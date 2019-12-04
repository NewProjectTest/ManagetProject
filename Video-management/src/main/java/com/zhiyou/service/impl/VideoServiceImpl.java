package com.zhiyou.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhiyou.mapper.VideoMapper;
import com.zhiyou.model.Video;
import com.zhiyou.service.VideoService;
@Service
public class VideoServiceImpl implements VideoService {

	@Autowired
	VideoMapper mapper;
	public List<Video> videoShow(Integer page) {
		// TODO Auto-generated method stub
		return mapper.videoShow(page);
	}
	public int count() {
		// TODO Auto-generated method stub
		return mapper.count();
	}
	public void Dvideo(Integer id) {
		mapper.Dvideo(id);
		
	}

}
