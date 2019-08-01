package com.atguigu.gulimall.pms.dao;

import com.atguigu.gulimall.pms.entity.CommentReplayEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品评价回复关系
 * 
 * @author bzh
 * @email 1023487452@qq.com
 * @date 2019-08-01 19:01:58
 */
@Mapper
public interface CommentReplayDao extends BaseMapper<CommentReplayEntity> {
	
}
