package cn.e3mall.service;

import cn.e3mall.domain.TbItem;
import cn.e3mall.util.EasyUIResult;

public interface ItemService {
	public TbItem findItemByID(Long itemId);
	/**
	 * 通过分页查询商品信息列表
	 * @param page
	 * @param rows
	 * @return
	 */
	public EasyUIResult findItemByPage(Integer page, Integer rows);
}
