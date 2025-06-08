package com.dao;

import com.entity.FangwuchushouEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.FangwuchushouVO;
import com.entity.view.FangwuchushouView;


/**
 * 房屋出售
 * 
 * @author 
 * @email 
 * @date 2021-02-22 15:20:48
 */
public interface FangwuchushouDao extends BaseMapper<FangwuchushouEntity> {
	
	List<FangwuchushouVO> selectListVO(@Param("ew") Wrapper<FangwuchushouEntity> wrapper);
	
	FangwuchushouVO selectVO(@Param("ew") Wrapper<FangwuchushouEntity> wrapper);
	
	List<FangwuchushouView> selectListView(@Param("ew") Wrapper<FangwuchushouEntity> wrapper);

	List<FangwuchushouView> selectListView(Pagination page,@Param("ew") Wrapper<FangwuchushouEntity> wrapper);
	
	FangwuchushouView selectView(@Param("ew") Wrapper<FangwuchushouEntity> wrapper);
	
}
