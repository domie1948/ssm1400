package com.entity.view;

import com.entity.FangwuchushouEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 房屋出售
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-02-22 15:20:48
 */
@TableName("fangwuchushou")
public class FangwuchushouView  extends FangwuchushouEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public FangwuchushouView(){
	}
 
 	public FangwuchushouView(FangwuchushouEntity fangwuchushouEntity){
 	try {
			BeanUtils.copyProperties(this, fangwuchushouEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
