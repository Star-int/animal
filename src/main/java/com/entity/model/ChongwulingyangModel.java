package com.entity.model;

import java.io.Serializable;


/**
 * 宠物领养
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-01-16 09:02:05
 */
public class ChongwulingyangModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 分类
	 */
	
	private String fenlei;
		
	/**
	 * 图片
	 */
	
	private String tupian;
		
	/**
	 * 种类
	 */
	
	private String zhonglei;
		
	/**
	 * 年龄
	 */
	
	private String nianling;
		
	/**
	 * 性别
	 */
	
	private String xingbie;
		
	/**
	 * 性情
	 */
	
	private String xingqing;
		
	/**
	 * 宠物状态
	 */
	
	private String chongwuzhuangtai;
		
	/**
	 * 疫苗情况
	 */
	
	private String yimiaoqingkuang;
		
	/**
	 * 领养费用
	 */
	
	private Integer lingyangfeiyong;
		
	/**
	 * 领养说明
	 */
	
	private String lingyangshuoming;
				
	
	/**
	 * 设置：分类
	 */
	 
	public void setFenlei(String fenlei) {
		this.fenlei = fenlei;
	}
	
	/**
	 * 获取：分类
	 */
	public String getFenlei() {
		return fenlei;
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
	 * 设置：种类
	 */
	 
	public void setZhonglei(String zhonglei) {
		this.zhonglei = zhonglei;
	}
	
	/**
	 * 获取：种类
	 */
	public String getZhonglei() {
		return zhonglei;
	}
				
	
	/**
	 * 设置：年龄
	 */
	 
	public void setNianling(String nianling) {
		this.nianling = nianling;
	}
	
	/**
	 * 获取：年龄
	 */
	public String getNianling() {
		return nianling;
	}
				
	
	/**
	 * 设置：性别
	 */
	 
	public void setXingbie(String xingbie) {
		this.xingbie = xingbie;
	}
	
	/**
	 * 获取：性别
	 */
	public String getXingbie() {
		return xingbie;
	}
				
	
	/**
	 * 设置：性情
	 */
	 
	public void setXingqing(String xingqing) {
		this.xingqing = xingqing;
	}
	
	/**
	 * 获取：性情
	 */
	public String getXingqing() {
		return xingqing;
	}
				
	
	/**
	 * 设置：宠物状态
	 */
	 
	public void setChongwuzhuangtai(String chongwuzhuangtai) {
		this.chongwuzhuangtai = chongwuzhuangtai;
	}
	
	/**
	 * 获取：宠物状态
	 */
	public String getChongwuzhuangtai() {
		return chongwuzhuangtai;
	}
				
	
	/**
	 * 设置：疫苗情况
	 */
	 
	public void setYimiaoqingkuang(String yimiaoqingkuang) {
		this.yimiaoqingkuang = yimiaoqingkuang;
	}
	
	/**
	 * 获取：疫苗情况
	 */
	public String getYimiaoqingkuang() {
		return yimiaoqingkuang;
	}
				
	
	/**
	 * 设置：领养费用
	 */
	 
	public void setLingyangfeiyong(Integer lingyangfeiyong) {
		this.lingyangfeiyong = lingyangfeiyong;
	}
	
	/**
	 * 获取：领养费用
	 */
	public Integer getLingyangfeiyong() {
		return lingyangfeiyong;
	}
				
	
	/**
	 * 设置：领养说明
	 */
	 
	public void setLingyangshuoming(String lingyangshuoming) {
		this.lingyangshuoming = lingyangshuoming;
	}
	
	/**
	 * 获取：领养说明
	 */
	public String getLingyangshuoming() {
		return lingyangshuoming;
	}
			
}
