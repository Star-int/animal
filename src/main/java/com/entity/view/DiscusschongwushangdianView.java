package com.entity.view;

import com.baomidou.mybatisplus.annotations.TableName;
import com.entity.DiscusschongwushangdianEntity;
import org.apache.commons.beanutils.BeanUtils;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;


/**
 * 宠物商店评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-01-16 09:02:06
 */
@TableName("discusschongwushangdian")
public class DiscusschongwushangdianView  extends DiscusschongwushangdianEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscusschongwushangdianView(){
	}
 
 	public DiscusschongwushangdianView(DiscusschongwushangdianEntity discusschongwushangdianEntity){
 	try {
			BeanUtils.copyProperties(this, discusschongwushangdianEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
