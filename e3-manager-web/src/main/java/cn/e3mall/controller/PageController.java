package cn.e3mall.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class PageController {
	/**
	 * 展示页面
	 * @param page
	 * @return
	 */
	@RequestMapping("{page}")
	public String page(@PathVariable  String page){
		return page;
	}
}
