package com.cl.dao;

import com.cl.entity.KefangruzhuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.KefangruzhuView;


/**
 * 客房入住
 * 
 * @author 
 * @email 
 * @date 2024-04-05 11:34:16
 */
public interface KefangruzhuDao extends BaseMapper<KefangruzhuEntity> {
	
	List<KefangruzhuView> selectListView(@Param("ew") Wrapper<KefangruzhuEntity> wrapper);

	List<KefangruzhuView> selectListView(Pagination page,@Param("ew") Wrapper<KefangruzhuEntity> wrapper);
	
	KefangruzhuView selectView(@Param("ew") Wrapper<KefangruzhuEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<KefangruzhuEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<KefangruzhuEntity> wrapper);

    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<KefangruzhuEntity> wrapper);



}
