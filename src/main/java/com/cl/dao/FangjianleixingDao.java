package com.cl.dao;

import com.cl.entity.FangjianleixingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.FangjianleixingView;


/**
 * 房间类型
 * 
 * @author 
 * @email 
 * @date 2024-04-05 11:34:15
 */
public interface FangjianleixingDao extends BaseMapper<FangjianleixingEntity> {
	
	List<FangjianleixingView> selectListView(@Param("ew") Wrapper<FangjianleixingEntity> wrapper);

	List<FangjianleixingView> selectListView(Pagination page,@Param("ew") Wrapper<FangjianleixingEntity> wrapper);
	
	FangjianleixingView selectView(@Param("ew") Wrapper<FangjianleixingEntity> wrapper);
	

}
