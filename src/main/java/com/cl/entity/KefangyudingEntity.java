package com.cl.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 客房预订
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2024-04-05 11:34:16
 */
@TableName("kefangyuding")
public class KefangyudingEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public KefangyudingEntity() {
		
	}
	
	public KefangyudingEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 订单编号
	 */
					
	private String dingdanbianhao;
	
	/**
	 * 房间名称
	 */
					
	private String fangjianmingcheng;
	
	/**
	 * 房间类型
	 */
					
	private String fangjianleixing;
	
	/**
	 * 价格
	 */
					
	private Double jiage;
	
	/**
	 * 入住时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date ruzhushijian;
	
	/**
	 * 退房时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date tuifangshijian;
	
	/**
	 * 住房时长
	 */
					
	private String zhufangshizhang;
	
	/**
	 * 预订间数
	 */
					
	private Integer yudingjianshu;
	
	/**
	 * 用户账号
	 */
					
	private String yonghuzhanghao;
	
	/**
	 * 用户姓名
	 */
					
	private String yonghuxingming;
	
	/**
	 * 电话号码
	 */
					
	private String dianhuahaoma;
	
	/**
	 * 预订状态
	 */
					
	private String yudingzhuangtai;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：订单编号
	 */
	public void setDingdanbianhao(String dingdanbianhao) {
		this.dingdanbianhao = dingdanbianhao;
	}
	/**
	 * 获取：订单编号
	 */
	public String getDingdanbianhao() {
		return dingdanbianhao;
	}
	/**
	 * 设置：房间名称
	 */
	public void setFangjianmingcheng(String fangjianmingcheng) {
		this.fangjianmingcheng = fangjianmingcheng;
	}
	/**
	 * 获取：房间名称
	 */
	public String getFangjianmingcheng() {
		return fangjianmingcheng;
	}
	/**
	 * 设置：房间类型
	 */
	public void setFangjianleixing(String fangjianleixing) {
		this.fangjianleixing = fangjianleixing;
	}
	/**
	 * 获取：房间类型
	 */
	public String getFangjianleixing() {
		return fangjianleixing;
	}
	/**
	 * 设置：价格
	 */
	public void setJiage(Double jiage) {
		this.jiage = jiage;
	}
	/**
	 * 获取：价格
	 */
	public Double getJiage() {
		return jiage;
	}
	/**
	 * 设置：入住时间
	 */
	public void setRuzhushijian(Date ruzhushijian) {
		this.ruzhushijian = ruzhushijian;
	}
	/**
	 * 获取：入住时间
	 */
	public Date getRuzhushijian() {
		return ruzhushijian;
	}
	/**
	 * 设置：退房时间
	 */
	public void setTuifangshijian(Date tuifangshijian) {
		this.tuifangshijian = tuifangshijian;
	}
	/**
	 * 获取：退房时间
	 */
	public Date getTuifangshijian() {
		return tuifangshijian;
	}
	/**
	 * 设置：住房时长
	 */
	public void setZhufangshizhang(String zhufangshizhang) {
		this.zhufangshizhang = zhufangshizhang;
	}
	/**
	 * 获取：住房时长
	 */
	public String getZhufangshizhang() {
		return zhufangshizhang;
	}
	/**
	 * 设置：预订间数
	 */
	public void setYudingjianshu(Integer yudingjianshu) {
		this.yudingjianshu = yudingjianshu;
	}
	/**
	 * 获取：预订间数
	 */
	public Integer getYudingjianshu() {
		return yudingjianshu;
	}
	/**
	 * 设置：用户账号
	 */
	public void setYonghuzhanghao(String yonghuzhanghao) {
		this.yonghuzhanghao = yonghuzhanghao;
	}
	/**
	 * 获取：用户账号
	 */
	public String getYonghuzhanghao() {
		return yonghuzhanghao;
	}
	/**
	 * 设置：用户姓名
	 */
	public void setYonghuxingming(String yonghuxingming) {
		this.yonghuxingming = yonghuxingming;
	}
	/**
	 * 获取：用户姓名
	 */
	public String getYonghuxingming() {
		return yonghuxingming;
	}
	/**
	 * 设置：电话号码
	 */
	public void setDianhuahaoma(String dianhuahaoma) {
		this.dianhuahaoma = dianhuahaoma;
	}
	/**
	 * 获取：电话号码
	 */
	public String getDianhuahaoma() {
		return dianhuahaoma;
	}
	/**
	 * 设置：预订状态
	 */
	public void setYudingzhuangtai(String yudingzhuangtai) {
		this.yudingzhuangtai = yudingzhuangtai;
	}
	/**
	 * 获取：预订状态
	 */
	public String getYudingzhuangtai() {
		return yudingzhuangtai;
	}

}
