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


import com.cl.dao.KefangruzhuDao;
import com.cl.entity.KefangruzhuEntity;
import com.cl.service.KefangruzhuService;
import com.cl.entity.view.KefangruzhuView;

@Service("kefangruzhuService")
public class KefangruzhuServiceImpl extends ServiceImpl<KefangruzhuDao, KefangruzhuEntity> implements KefangruzhuService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<KefangruzhuEntity> page = this.selectPage(
                new Query<KefangruzhuEntity>(params).getPage(),
                new EntityWrapper<KefangruzhuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<KefangruzhuEntity> wrapper) {
		  Page<KefangruzhuView> page =new Query<KefangruzhuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<KefangruzhuView> selectListView(Wrapper<KefangruzhuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public KefangruzhuView selectView(Wrapper<KefangruzhuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

    @Override
    public List<Map<String, Object>> selectValue(Map<String, Object> params, Wrapper<KefangruzhuEntity> wrapper) {
        return baseMapper.selectValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params, Wrapper<KefangruzhuEntity> wrapper) {
        return baseMapper.selectTimeStatValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectGroup(Map<String, Object> params, Wrapper<KefangruzhuEntity> wrapper) {
        return baseMapper.selectGroup(params, wrapper);
    }




}
