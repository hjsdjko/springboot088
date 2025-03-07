package com.cl.entity.view;

import com.cl.entity.FangjianleixingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.cl.utils.EncryptUtil;
 

/**
 * 房间类型
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-04-05 11:34:15
 */
@TableName("fangjianleixing")
public class FangjianleixingView  extends FangjianleixingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public FangjianleixingView(){
	}
 
 	public FangjianleixingView(FangjianleixingEntity fangjianleixingEntity){
 	try {
			BeanUtils.copyProperties(this, fangjianleixingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
