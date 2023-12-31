package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.entity.ChongwuguashiEntity;
import com.entity.view.ChongwuguashiView;
import com.entity.vo.ChongwuguashiVO;
import com.utils.PageUtils;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;


/**
 * 宠物挂失
 *
 * @author 
 * @email 
 * @date 2021-01-16 09:02:06
 */
public interface ChongwuguashiService extends IService<ChongwuguashiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ChongwuguashiVO> selectListVO(Wrapper<ChongwuguashiEntity> wrapper);
   	
   	ChongwuguashiVO selectVO(@Param("ew") Wrapper<ChongwuguashiEntity> wrapper);
   	
   	List<ChongwuguashiView> selectListView(Wrapper<ChongwuguashiEntity> wrapper);
   	
   	ChongwuguashiView selectView(@Param("ew") Wrapper<ChongwuguashiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params, Wrapper<ChongwuguashiEntity> wrapper);
   	
}

