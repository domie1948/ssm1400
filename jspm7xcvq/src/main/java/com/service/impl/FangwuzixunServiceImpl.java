package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.FangwuzixunDao;
import com.entity.FangwuzixunEntity;
import com.service.FangwuzixunService;
import com.entity.vo.FangwuzixunVO;
import com.entity.view.FangwuzixunView;

@Service("fangwuzixunService")
public class FangwuzixunServiceImpl extends ServiceImpl<FangwuzixunDao, FangwuzixunEntity> implements FangwuzixunService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<FangwuzixunEntity> page = this.selectPage(
                new Query<FangwuzixunEntity>(params).getPage(),
                new EntityWrapper<FangwuzixunEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<FangwuzixunEntity> wrapper) {
		  Page<FangwuzixunView> page =new Query<FangwuzixunView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<FangwuzixunVO> selectListVO(Wrapper<FangwuzixunEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public FangwuzixunVO selectVO(Wrapper<FangwuzixunEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<FangwuzixunView> selectListView(Wrapper<FangwuzixunEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public FangwuzixunView selectView(Wrapper<FangwuzixunEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
