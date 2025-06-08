package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.FangwuzixunEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.FangwuzixunVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.FangwuzixunView;


/**
 * 房屋资讯
 *
 * @author 
 * @email 
 * @date 2021-02-22 15:20:48
 */
public interface FangwuzixunService extends IService<FangwuzixunEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<FangwuzixunVO> selectListVO(Wrapper<FangwuzixunEntity> wrapper);
   	
   	FangwuzixunVO selectVO(@Param("ew") Wrapper<FangwuzixunEntity> wrapper);
   	
   	List<FangwuzixunView> selectListView(Wrapper<FangwuzixunEntity> wrapper);
   	
   	FangwuzixunView selectView(@Param("ew") Wrapper<FangwuzixunEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<FangwuzixunEntity> wrapper);
   	
}

