package com.entity.model;

import java.io.Serializable;


/**
 * 宠物商店
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-01-16 09:02:05
 */
public class ChongwushangdianModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 商店名称
	 */
	
	private String shangdianmingcheng;
		
	/**
	 * 图片
	 */
	
	private String tupian;
		
	/**
	 * 经营范围
	 */
	
	private String jingyingfanwei;
		
	/**
	 * 联系人
	 */
	
	private String lianxiren;
		
	/**
	 * 联系电话
	 */
	
	private String lianxidianhua;
		
	/**
	 * 商店地址
	 */
	
	private String shangdiandizhi;
		
	/**
	 * 商店介绍
	 */
	
	private String shangdianjieshao;
				
	
	/**
	 * 设置：商店名称
	 */
	 
	public void setShangdianmingcheng(String shangdianmingcheng) {
		this.shangdianmingcheng = shangdianmingcheng;
	}
	
	/**
	 * 获取：商店名称
	 */
	public String getShangdianmingcheng() {
		return shangdianmingcheng;
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
	 * 设置：经营范围
	 */
	 
	public void setJingyingfanwei(String jingyingfanwei) {
		this.jingyingfanwei = jingyingfanwei;
	}
	
	/**
	 * 获取：经营范围
	 */
	public String getJingyingfanwei() {
		return jingyingfanwei;
	}
				
	
	/**
	 * 设置：联系人
	 */
	 
	public void setLianxiren(String lianxiren) {
		this.lianxiren = lianxiren;
	}
	
	/**
	 * 获取：联系人
	 */
	public String getLianxiren() {
		return lianxiren;
	}
				
	
	/**
	 * 设置：联系电话
	 */
	 
	public void setLianxidianhua(String lianxidianhua) {
		this.lianxidianhua = lianxidianhua;
	}
	
	/**
	 * 获取：联系电话
	 */
	public String getLianxidianhua() {
		return lianxidianhua;
	}
				
	
	/**
	 * 设置：商店地址
	 */
	 
	public void setShangdiandizhi(String shangdiandizhi) {
		this.shangdiandizhi = shangdiandizhi;
	}
	
	/**
	 * 获取：商店地址
	 */
	public String getShangdiandizhi() {
		return shangdiandizhi;
	}
				
	
	/**
	 * 设置：商店介绍
	 */
	 
	public void setShangdianjieshao(String shangdianjieshao) {
		this.shangdianjieshao = shangdianjieshao;
	}
	
	/**
	 * 获取：商店介绍
	 */
	public String getShangdianjieshao() {
		return shangdianjieshao;
	}
			
}
