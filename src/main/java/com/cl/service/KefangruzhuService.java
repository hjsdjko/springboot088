package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.KefangruzhuEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.KefangruzhuView;


/**
 * 客房入住
 *
 * @author 
 * @email 
 * @date 2024-04-05 11:34:16
 */
public interface KefangruzhuService extends IService<KefangruzhuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<KefangruzhuView> selectListView(Wrapper<KefangruzhuEntity> wrapper);
   	
   	KefangruzhuView selectView(@Param("ew") Wrapper<KefangruzhuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<KefangruzhuEntity> wrapper);
   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<KefangruzhuEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<KefangruzhuEntity> wrapper);

    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<KefangruzhuEntity> wrapper);



}

