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


import com.cl.dao.TuifangjiesuanDao;
import com.cl.entity.TuifangjiesuanEntity;
import com.cl.service.TuifangjiesuanService;
import com.cl.entity.view.TuifangjiesuanView;

@Service("tuifangjiesuanService")
public class TuifangjiesuanServiceImpl extends ServiceImpl<TuifangjiesuanDao, TuifangjiesuanEntity> implements TuifangjiesuanService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<TuifangjiesuanEntity> page = this.selectPage(
                new Query<TuifangjiesuanEntity>(params).getPage(),
                new EntityWrapper<TuifangjiesuanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<TuifangjiesuanEntity> wrapper) {
		  Page<TuifangjiesuanView> page =new Query<TuifangjiesuanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<TuifangjiesuanView> selectListView(Wrapper<TuifangjiesuanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public TuifangjiesuanView selectView(Wrapper<TuifangjiesuanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

    @Override
    public List<Map<String, Object>> selectValue(Map<String, Object> params, Wrapper<TuifangjiesuanEntity> wrapper) {
        return baseMapper.selectValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params, Wrapper<TuifangjiesuanEntity> wrapper) {
        return baseMapper.selectTimeStatValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectGroup(Map<String, Object> params, Wrapper<TuifangjiesuanEntity> wrapper) {
        return baseMapper.selectGroup(params, wrapper);
    }




}
