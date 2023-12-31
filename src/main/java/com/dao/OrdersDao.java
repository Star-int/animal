package com.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import com.entity.OrdersEntity;
import com.entity.view.OrdersView;
import com.entity.vo.OrdersVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;


/**
 * 订单
 * 
 * @author 
 * @email 
 * @date 2021-01-16 09:02:06
 */
@Mapper
public interface OrdersDao extends BaseMapper<OrdersEntity> {
	
	List<OrdersVO> selectListVO(@Param("ew") Wrapper<OrdersEntity> wrapper);
	
	OrdersVO selectVO(@Param("ew") Wrapper<OrdersEntity> wrapper);
	
	List<OrdersView> selectListView(@Param("ew") Wrapper<OrdersEntity> wrapper);

	List<OrdersView> selectListView(Pagination page, @Param("ew") Wrapper<OrdersEntity> wrapper);
	
	OrdersView selectView(@Param("ew") Wrapper<OrdersEntity> wrapper);
	
}
