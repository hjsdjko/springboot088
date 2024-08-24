package com.cl.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.cl.utils.PageUtils;
import com.cl.utils.Query;


import com.cl.dao.FangjianleixingDao;
import com.cl.entity.FangjianleixingEntity;
import com.cl.service.FangjianleixingService;
import com.cl.entity.view.FangjianleixingView;

@Service("fangjianleixingService")
public class FangjianleixingServiceImpl extends ServiceImpl<FangjianleixingDao, FangjianleixingEntity> implements FangjianleixingService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<FangjianleixingEntity> page = this.selectPage(
                new Query<FangjianleixingEntity>(params).getPage(),
                new EntityWrapper<FangjianleixingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<FangjianleixingEntity> wrapper) {
		  Page<FangjianleixingView> page =new Query<FangjianleixingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<FangjianleixingView> selectListView(Wrapper<FangjianleixingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public FangjianleixingView selectView(Wrapper<FangjianleixingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
