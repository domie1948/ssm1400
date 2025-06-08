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


import com.dao.FangwuchushouDao;
import com.entity.FangwuchushouEntity;
import com.service.FangwuchushouService;
import com.entity.vo.FangwuchushouVO;
import com.entity.view.FangwuchushouView;

@Service("fangwuchushouService")
public class FangwuchushouServiceImpl extends ServiceImpl<FangwuchushouDao, FangwuchushouEntity> implements FangwuchushouService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<FangwuchushouEntity> page = this.selectPage(
                new Query<FangwuchushouEntity>(params).getPage(),
                new EntityWrapper<FangwuchushouEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<FangwuchushouEntity> wrapper) {
		  Page<FangwuchushouView> page =new Query<FangwuchushouView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<FangwuchushouVO> selectListVO(Wrapper<FangwuchushouEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public FangwuchushouVO selectVO(Wrapper<FangwuchushouEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<FangwuchushouView> selectListView(Wrapper<FangwuchushouEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public FangwuchushouView selectView(Wrapper<FangwuchushouEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
