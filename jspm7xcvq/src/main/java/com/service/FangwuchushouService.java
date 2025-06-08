package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.FangwuchushouEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.FangwuchushouVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.FangwuchushouView;


/**
 * 房屋出售
 *
 * @author 
 * @email 
 * @date 2021-02-22 15:20:48
 */
public interface FangwuchushouService extends IService<FangwuchushouEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<FangwuchushouVO> selectListVO(Wrapper<FangwuchushouEntity> wrapper);
   	
   	FangwuchushouVO selectVO(@Param("ew") Wrapper<FangwuchushouEntity> wrapper);
   	
   	List<FangwuchushouView> selectListView(Wrapper<FangwuchushouEntity> wrapper);
   	
   	FangwuchushouView selectView(@Param("ew") Wrapper<FangwuchushouEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<FangwuchushouEntity> wrapper);
   	
}

