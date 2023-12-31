package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.entity.ShangpinfenleiEntity;
import com.entity.view.ShangpinfenleiView;
import com.entity.vo.ShangpinfenleiVO;
import com.utils.PageUtils;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;


/**
 * 商品分类
 *
 * @author 
 * @email 
 * @date 2021-01-16 09:02:05
 */
public interface ShangpinfenleiService extends IService<ShangpinfenleiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShangpinfenleiVO> selectListVO(Wrapper<ShangpinfenleiEntity> wrapper);
   	
   	ShangpinfenleiVO selectVO(@Param("ew") Wrapper<ShangpinfenleiEntity> wrapper);
   	
   	List<ShangpinfenleiView> selectListView(Wrapper<ShangpinfenleiEntity> wrapper);
   	
   	ShangpinfenleiView selectView(@Param("ew") Wrapper<ShangpinfenleiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params, Wrapper<ShangpinfenleiEntity> wrapper);
   	
}

