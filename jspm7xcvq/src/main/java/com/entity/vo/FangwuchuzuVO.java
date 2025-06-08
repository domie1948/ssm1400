package com.entity.vo;

import com.entity.FangwuchuzuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 房屋出租
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-02-22 15:20:48
 */
public class FangwuchuzuVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 房屋类型
	 */
	
	private String fangwuleixing;
		
	/**
	 * 图片
	 */
	
	private String tupian;
		
	/**
	 * 城市
	 */
	
	private String chengshi;
		
	/**
	 * 面积
	 */
	
	private String mianji;
		
	/**
	 * 地址
	 */
	
	private String dizhi;
		
	/**
	 * 朝向
	 */
	
	private String chaoxiang;
		
	/**
	 * 楼层
	 */
	
	private String louceng;
		
	/**
	 * 楼号
	 */
	
	private String louhao;
		
	/**
	 * 房屋设施
	 */
	
	private String fangwusheshi;
		
	/**
	 * 房屋介绍
	 */
	
	private String fangwujieshao;
		
	/**
	 * 出租价格
	 */
	
	private Integer chuzujiage;
		
	/**
	 * 房东号
	 */
	
	private String fangdonghao;
		
	/**
	 * 房东姓名
	 */
	
	private String fangdongxingming;
		
	/**
	 * 房东手机
	 */
	
	private String fangdongshouji;
				
	
	/**
	 * 设置：房屋类型
	 */
	 
	public void setFangwuleixing(String fangwuleixing) {
		this.fangwuleixing = fangwuleixing;
	}
	
	/**
	 * 获取：房屋类型
	 */
	public String getFangwuleixing() {
		return fangwuleixing;
	}
				
	
	/**
	 * 设置：图片
	 */
	 
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
				
	
	/**
	 * 设置：城市
	 */
	 
	public void setChengshi(String chengshi) {
		this.chengshi = chengshi;
	}
	
	/**
	 * 获取：城市
	 */
	public String getChengshi() {
		return chengshi;
	}
				
	
	/**
	 * 设置：面积
	 */
	 
	public void setMianji(String mianji) {
		this.mianji = mianji;
	}
	
	/**
	 * 获取：面积
	 */
	public String getMianji() {
		return mianji;
	}
				
	
	/**
	 * 设置：地址
	 */
	 
	public void setDizhi(String dizhi) {
		this.dizhi = dizhi;
	}
	
	/**
	 * 获取：地址
	 */
	public String getDizhi() {
		return dizhi;
	}
				
	
	/**
	 * 设置：朝向
	 */
	 
	public void setChaoxiang(String chaoxiang) {
		this.chaoxiang = chaoxiang;
	}
	
	/**
	 * 获取：朝向
	 */
	public String getChaoxiang() {
		return chaoxiang;
	}
				
	
	/**
	 * 设置：楼层
	 */
	 
	public void setLouceng(String louceng) {
		this.louceng = louceng;
	}
	
	/**
	 * 获取：楼层
	 */
	public String getLouceng() {
		return louceng;
	}
				
	
	/**
	 * 设置：楼号
	 */
	 
	public void setLouhao(String louhao) {
		this.louhao = louhao;
	}
	
	/**
	 * 获取：楼号
	 */
	public String getLouhao() {
		return louhao;
	}
				
	
	/**
	 * 设置：房屋设施
	 */
	 
	public void setFangwusheshi(String fangwusheshi) {
		this.fangwusheshi = fangwusheshi;
	}
	
	/**
	 * 获取：房屋设施
	 */
	public String getFangwusheshi() {
		return fangwusheshi;
	}
				
	
	/**
	 * 设置：房屋介绍
	 */
	 
	public void setFangwujieshao(String fangwujieshao) {
		this.fangwujieshao = fangwujieshao;
	}
	
	/**
	 * 获取：房屋介绍
	 */
	public String getFangwujieshao() {
		return fangwujieshao;
	}
				
	
	/**
	 * 设置：出租价格
	 */
	 
	public void setChuzujiage(Integer chuzujiage) {
		this.chuzujiage = chuzujiage;
	}
	
	/**
	 * 获取：出租价格
	 */
	public Integer getChuzujiage() {
		return chuzujiage;
	}
				
	
	/**
	 * 设置：房东号
	 */
	 
	public void setFangdonghao(String fangdonghao) {
		this.fangdonghao = fangdonghao;
	}
	
	/**
	 * 获取：房东号
	 */
	public String getFangdonghao() {
		return fangdonghao;
	}
				
	
	/**
	 * 设置：房东姓名
	 */
	 
	public void setFangdongxingming(String fangdongxingming) {
		this.fangdongxingming = fangdongxingming;
	}
	
	/**
	 * 获取：房东姓名
	 */
	public String getFangdongxingming() {
		return fangdongxingming;
	}
				
	
	/**
	 * 设置：房东手机
	 */
	 
	public void setFangdongshouji(String fangdongshouji) {
		this.fangdongshouji = fangdongshouji;
	}
	
	/**
	 * 获取：房东手机
	 */
	public String getFangdongshouji() {
		return fangdongshouji;
	}
			
}
