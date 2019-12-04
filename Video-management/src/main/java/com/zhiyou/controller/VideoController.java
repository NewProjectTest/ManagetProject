package com.zhiyou.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.zhiyou.model.Video;
import com.zhiyou.service.VideoService;

@Controller
public class VideoController {
	@Autowired
	VideoService Service;
	@RequestMapping("voidShow")
	public ModelAndView voidShow(Integer page,HttpServletRequest req,HttpServletResponse resp) {
		
		if (page==null) {
			page=1;
		}
		
		
		int num = Service.count();
		
		List<Video> list = Service.videoShow(((page-1)*2));
		ModelAndView model = new ModelAndView();
		model.addObject("list",list);
		model.addObject("count", num);
		model.addObject("pagee", page);
		model.setViewName("backstage/void/videoShow");
		return model;

	}
	@RequestMapping("Dvideo")
	public ModelAndView Dvideo(Integer id,HttpServletRequest req,HttpServletResponse resp) {
		ModelAndView model = new ModelAndView();
		
		Service.Dvideo(id);
		model.setViewName("forward:voidShow");
		return model;
		
	}
	
}
