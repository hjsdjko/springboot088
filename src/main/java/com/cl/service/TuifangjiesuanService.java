package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.TuifangjiesuanEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.TuifangjiesuanView;


/**
 * 退房结算
 *
 * @author 
 * @email 
 * @date 2024-04-05 11:34:16
 */
public interface TuifangjiesuanService extends IService<TuifangjiesuanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<TuifangjiesuanView> selectListView(Wrapper<TuifangjiesuanEntity> wrapper);
   	
   	TuifangjiesuanView selectView(@Param("ew") Wrapper<TuifangjiesuanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<TuifangjiesuanEntity> wrapper);
   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<TuifangjiesuanEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<TuifangjiesuanEntity> wrapper);

    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<TuifangjiesuanEntity> wrapper);



}

