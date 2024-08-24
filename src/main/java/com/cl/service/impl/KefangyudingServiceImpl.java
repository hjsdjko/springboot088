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


import com.cl.dao.KefangyudingDao;
import com.cl.entity.KefangyudingEntity;
import com.cl.service.KefangyudingService;
import com.cl.entity.view.KefangyudingView;

@Service("kefangyudingService")
public class KefangyudingServiceImpl extends ServiceImpl<KefangyudingDao, KefangyudingEntity> implements KefangyudingService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<KefangyudingEntity> page = this.selectPage(
                new Query<KefangyudingEntity>(params).getPage(),
                new EntityWrapper<KefangyudingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<KefangyudingEntity> wrapper) {
		  Page<KefangyudingView> page =new Query<KefangyudingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<KefangyudingView> selectListView(Wrapper<KefangyudingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public KefangyudingView selectView(Wrapper<KefangyudingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

    @Override
    public List<Map<String, Object>> selectValue(Map<String, Object> params, Wrapper<KefangyudingEntity> wrapper) {
        return baseMapper.selectValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params, Wrapper<KefangyudingEntity> wrapper) {
        return baseMapper.selectTimeStatValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectGroup(Map<String, Object> params, Wrapper<KefangyudingEntity> wrapper) {
        return baseMapper.selectGroup(params, wrapper);
    }


    @Override
    public List<Map<String, Object>> yudingzhuangtaiTypeStat(Map<String, Object> params, Wrapper<KefangyudingEntity> wrapper) {
        return baseMapper.yudingzhuangtaiTypeStat(params, wrapper);
    }


}
