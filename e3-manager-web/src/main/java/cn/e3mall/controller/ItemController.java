package cn.e3mall.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.e3mall.domain.TbItem;
import cn.e3mall.service.ItemService;
@Controller
public class ItemController {
	@Autowired
	private ItemService itemServiceImpl;
	@RequestMapping("/index/{id}")
	@ResponseBody
	public TbItem    findById(@PathVariable Long id){
		TbItem findItemByID = itemServiceImpl.findItemByID(id);
		return findItemByID;
	}
}
