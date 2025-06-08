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


import com.dao.FangwuchuzuDao;
import com.entity.FangwuchuzuEntity;
import com.service.FangwuchuzuService;
import com.entity.vo.FangwuchuzuVO;
import com.entity.view.FangwuchuzuView;

@Service("fangwuchuzuService")
public class FangwuchuzuServiceImpl extends ServiceImpl<FangwuchuzuDao, FangwuchuzuEntity> implements FangwuchuzuService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<FangwuchuzuEntity> page = this.selectPage(
                new Query<FangwuchuzuEntity>(params).getPage(),
                new EntityWrapper<FangwuchuzuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<FangwuchuzuEntity> wrapper) {
		  Page<FangwuchuzuView> page =new Query<FangwuchuzuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<FangwuchuzuVO> selectListVO(Wrapper<FangwuchuzuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public FangwuchuzuVO selectVO(Wrapper<FangwuchuzuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<FangwuchuzuView> selectListView(Wrapper<FangwuchuzuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public FangwuchuzuView selectView(Wrapper<FangwuchuzuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
