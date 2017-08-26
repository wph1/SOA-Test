package cn.e3mall.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import cn.e3mall.domain.TbItem;
import cn.e3mall.domain.TbItemExample;
import cn.e3mall.mapper.TbItemMapper;
import cn.e3mall.service.ItemService;
import cn.e3mall.util.EasyUIResult;
@Service
public class ItemServiceImpl implements ItemService{
	@Autowired
	private TbItemMapper itemMapper;
	@Override
	public TbItem findItemByID(Long itemId) {
		TbItem item = itemMapper.selectByPrimaryKey(itemId);
		return item;
	}
	
	@Override//商品列表分页显示
	public EasyUIResult findItemByPage(Integer page, Integer rows) {
		TbItemExample example = new TbItemExample();
		//设置分页信息，紧跟着的第一个 select 方法会被分页
		PageHelper.startPage(page, rows);
		//分页查询信息商品列表
		List<TbItem> list = itemMapper.selectByExample(example );
		//创建pageInfo对象获取分页信息
		PageInfo<TbItem>  pageInfo = new PageInfo<>(list);
		//创建一个EasyUi对象
		EasyUIResult result = new EasyUIResult();
		//设置商品总记录数
		result.setTotal(pageInfo.getTotal());
		//设置分页信息
		result.setRows(list);
		return result;
	}

}
