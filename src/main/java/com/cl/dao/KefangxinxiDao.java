package com.cl.dao;

import com.cl.entity.KefangxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.KefangxinxiView;


/**
 * 客房信息
 * 
 * @author 
 * @email 
 * @date 2024-04-05 11:34:15
 */
public interface KefangxinxiDao extends BaseMapper<KefangxinxiEntity> {
	
	List<KefangxinxiView> selectListView(@Param("ew") Wrapper<KefangxinxiEntity> wrapper);

	List<KefangxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<KefangxinxiEntity> wrapper);
	
	KefangxinxiView selectView(@Param("ew") Wrapper<KefangxinxiEntity> wrapper);
	

}
