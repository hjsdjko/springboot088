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


import com.cl.dao.KefangxinxiDao;
import com.cl.entity.KefangxinxiEntity;
import com.cl.service.KefangxinxiService;
import com.cl.entity.view.KefangxinxiView;

@Service("kefangxinxiService")
public class KefangxinxiServiceImpl extends ServiceImpl<KefangxinxiDao, KefangxinxiEntity> implements KefangxinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<KefangxinxiEntity> page = this.selectPage(
                new Query<KefangxinxiEntity>(params).getPage(),
                new EntityWrapper<KefangxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<KefangxinxiEntity> wrapper) {
		  Page<KefangxinxiView> page =new Query<KefangxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<KefangxinxiView> selectListView(Wrapper<KefangxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public KefangxinxiView selectView(Wrapper<KefangxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
