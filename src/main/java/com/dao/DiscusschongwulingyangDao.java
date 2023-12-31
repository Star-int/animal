package com.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import com.entity.DiscusschongwulingyangEntity;
import com.entity.view.DiscusschongwulingyangView;
import com.entity.vo.DiscusschongwulingyangVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;


/**
 * 宠物领养评论表
 * 
 * @author 
 * @email 
 * @date 2021-01-16 09:02:06
 */
@Mapper
public interface DiscusschongwulingyangDao extends BaseMapper<DiscusschongwulingyangEntity> {
	
	List<DiscusschongwulingyangVO> selectListVO(@Param("ew") Wrapper<DiscusschongwulingyangEntity> wrapper);
	
	DiscusschongwulingyangVO selectVO(@Param("ew") Wrapper<DiscusschongwulingyangEntity> wrapper);
	
	List<DiscusschongwulingyangView> selectListView(@Param("ew") Wrapper<DiscusschongwulingyangEntity> wrapper);

	List<DiscusschongwulingyangView> selectListView(Pagination page, @Param("ew") Wrapper<DiscusschongwulingyangEntity> wrapper);
	
	DiscusschongwulingyangView selectView(@Param("ew") Wrapper<DiscusschongwulingyangEntity> wrapper);
	
}
