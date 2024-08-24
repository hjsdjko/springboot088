package com.cl.entity.view;

import com.cl.entity.KefangruzhuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.cl.utils.EncryptUtil;
 

/**
 * 客房入住
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-04-05 11:34:16
 */
@TableName("kefangruzhu")
public class KefangruzhuView  extends KefangruzhuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public KefangruzhuView(){
	}
 
 	public KefangruzhuView(KefangruzhuEntity kefangruzhuEntity){
 	try {
			BeanUtils.copyProperties(this, kefangruzhuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
