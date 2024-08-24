package com.cl.controller;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.cl.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.cl.annotation.IgnoreAuth;

import com.cl.entity.KefangxinxiEntity;
import com.cl.entity.view.KefangxinxiView;

import com.cl.service.KefangxinxiService;
import com.cl.service.TokenService;
import com.cl.utils.PageUtils;
import com.cl.utils.R;
import com.cl.utils.MPUtil;
import com.cl.utils.CommonUtil;
import java.io.IOException;

/**
 * 客房信息
 * 后端接口
 * @author 
 * @email 
 * @date 2024-04-05 11:34:15
 */
@RestController
@RequestMapping("/kefangxinxi")
public class KefangxinxiController {
    @Autowired
    private KefangxinxiService kefangxinxiService;



    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,KefangxinxiEntity kefangxinxi,
		HttpServletRequest request){
        EntityWrapper<KefangxinxiEntity> ew = new EntityWrapper<KefangxinxiEntity>();

		PageUtils page = kefangxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, kefangxinxi), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,KefangxinxiEntity kefangxinxi, 
		HttpServletRequest request){
        EntityWrapper<KefangxinxiEntity> ew = new EntityWrapper<KefangxinxiEntity>();

		PageUtils page = kefangxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, kefangxinxi), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( KefangxinxiEntity kefangxinxi){
       	EntityWrapper<KefangxinxiEntity> ew = new EntityWrapper<KefangxinxiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( kefangxinxi, "kefangxinxi")); 
        return R.ok().put("data", kefangxinxiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(KefangxinxiEntity kefangxinxi){
        EntityWrapper< KefangxinxiEntity> ew = new EntityWrapper< KefangxinxiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( kefangxinxi, "kefangxinxi")); 
		KefangxinxiView kefangxinxiView =  kefangxinxiService.selectView(ew);
		return R.ok("查询客房信息成功").put("data", kefangxinxiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        KefangxinxiEntity kefangxinxi = kefangxinxiService.selectById(id);
		kefangxinxi = kefangxinxiService.selectView(new EntityWrapper<KefangxinxiEntity>().eq("id", id));
        return R.ok().put("data", kefangxinxi);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        KefangxinxiEntity kefangxinxi = kefangxinxiService.selectById(id);
		kefangxinxi = kefangxinxiService.selectView(new EntityWrapper<KefangxinxiEntity>().eq("id", id));
        return R.ok().put("data", kefangxinxi);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody KefangxinxiEntity kefangxinxi, HttpServletRequest request){
    	kefangxinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(kefangxinxi);
        kefangxinxiService.insert(kefangxinxi);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody KefangxinxiEntity kefangxinxi, HttpServletRequest request){
    	kefangxinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(kefangxinxi);
        kefangxinxiService.insert(kefangxinxi);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody KefangxinxiEntity kefangxinxi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(kefangxinxi);
        kefangxinxiService.updateById(kefangxinxi);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        kefangxinxiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	






    /**
     * 总数量
     */
    @RequestMapping("/count")
    public R count(@RequestParam Map<String, Object> params,KefangxinxiEntity kefangxinxi, HttpServletRequest request){
        EntityWrapper<KefangxinxiEntity> ew = new EntityWrapper<KefangxinxiEntity>();
        int count = kefangxinxiService.selectCount(MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, kefangxinxi), params), params));
        return R.ok().put("data", count);
    }


}
