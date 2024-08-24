package com.cl.dao;

import com.cl.entity.TuifangjiesuanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.TuifangjiesuanView;


/**
 * 退房结算
 * 
 * @author 
 * @email 
 * @date 2024-04-05 11:34:16
 */
public interface TuifangjiesuanDao extends BaseMapper<TuifangjiesuanEntity> {
	
	List<TuifangjiesuanView> selectListView(@Param("ew") Wrapper<TuifangjiesuanEntity> wrapper);

	List<TuifangjiesuanView> selectListView(Pagination page,@Param("ew") Wrapper<TuifangjiesuanEntity> wrapper);
	
	TuifangjiesuanView selectView(@Param("ew") Wrapper<TuifangjiesuanEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<TuifangjiesuanEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<TuifangjiesuanEntity> wrapper);

    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<TuifangjiesuanEntity> wrapper);



}
