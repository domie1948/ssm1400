package com.dao;

import com.entity.FangwuzixunEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.FangwuzixunVO;
import com.entity.view.FangwuzixunView;


/**
 * 房屋资讯
 * 
 * @author 
 * @email 
 * @date 2021-02-22 15:20:48
 */
public interface FangwuzixunDao extends BaseMapper<FangwuzixunEntity> {
	
	List<FangwuzixunVO> selectListVO(@Param("ew") Wrapper<FangwuzixunEntity> wrapper);
	
	FangwuzixunVO selectVO(@Param("ew") Wrapper<FangwuzixunEntity> wrapper);
	
	List<FangwuzixunView> selectListView(@Param("ew") Wrapper<FangwuzixunEntity> wrapper);

	List<FangwuzixunView> selectListView(Pagination page,@Param("ew") Wrapper<FangwuzixunEntity> wrapper);
	
	FangwuzixunView selectView(@Param("ew") Wrapper<FangwuzixunEntity> wrapper);
	
}
