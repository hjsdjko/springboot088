package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.FangjianleixingEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.FangjianleixingView;


/**
 * 房间类型
 *
 * @author 
 * @email 
 * @date 2024-04-05 11:34:15
 */
public interface FangjianleixingService extends IService<FangjianleixingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<FangjianleixingView> selectListView(Wrapper<FangjianleixingEntity> wrapper);
   	
   	FangjianleixingView selectView(@Param("ew") Wrapper<FangjianleixingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<FangjianleixingEntity> wrapper);
   	

}

