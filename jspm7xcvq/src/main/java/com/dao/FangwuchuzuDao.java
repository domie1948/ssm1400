package com.dao;

import com.entity.FangwuchuzuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.FangwuchuzuVO;
import com.entity.view.FangwuchuzuView;


/**
 * 房屋出租
 * 
 * @author 
 * @email 
 * @date 2021-02-22 15:20:48
 */
public interface FangwuchuzuDao extends BaseMapper<FangwuchuzuEntity> {
	
	List<FangwuchuzuVO> selectListVO(@Param("ew") Wrapper<FangwuchuzuEntity> wrapper);
	
	FangwuchuzuVO selectVO(@Param("ew") Wrapper<FangwuchuzuEntity> wrapper);
	
	List<FangwuchuzuView> selectListView(@Param("ew") Wrapper<FangwuchuzuEntity> wrapper);

	List<FangwuchuzuView> selectListView(Pagination page,@Param("ew") Wrapper<FangwuchuzuEntity> wrapper);
	
	FangwuchuzuView selectView(@Param("ew") Wrapper<FangwuchuzuEntity> wrapper);
	
}
