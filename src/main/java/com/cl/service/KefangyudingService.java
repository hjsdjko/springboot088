package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.KefangyudingEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.KefangyudingView;


/**
 * 客房预订
 *
 * @author 
 * @email 
 * @date 2024-04-05 11:34:16
 */
public interface KefangyudingService extends IService<KefangyudingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<KefangyudingView> selectListView(Wrapper<KefangyudingEntity> wrapper);
   	
   	KefangyudingView selectView(@Param("ew") Wrapper<KefangyudingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<KefangyudingEntity> wrapper);
   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<KefangyudingEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<KefangyudingEntity> wrapper);

    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<KefangyudingEntity> wrapper);


    List<Map<String, Object>> yudingzhuangtaiTypeStat(Map<String, Object> params,Wrapper<KefangyudingEntity> wrapper);

}

