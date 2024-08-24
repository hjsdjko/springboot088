package com.cl.dao;

import com.cl.entity.KefangyudingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.KefangyudingView;


/**
 * 客房预订
 * 
 * @author 
 * @email 
 * @date 2024-04-05 11:34:16
 */
public interface KefangyudingDao extends BaseMapper<KefangyudingEntity> {
	
	List<KefangyudingView> selectListView(@Param("ew") Wrapper<KefangyudingEntity> wrapper);

	List<KefangyudingView> selectListView(Pagination page,@Param("ew") Wrapper<KefangyudingEntity> wrapper);
	
	KefangyudingView selectView(@Param("ew") Wrapper<KefangyudingEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<KefangyudingEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<KefangyudingEntity> wrapper);

    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<KefangyudingEntity> wrapper);


    List<Map<String, Object>> yudingzhuangtaiTypeStat(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<KefangyudingEntity> wrapper);

}
