package com.atguigu.gulimall.sms.dao;

import com.atguigu.gulimall.sms.entity.SeckillSessionEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 秒杀活动场次
 * 
 * @author bzh
 * @email 1023487452@qq.com
 * @date 2019-08-01 19:05:09
 */
@Mapper
public interface SeckillSessionDao extends BaseMapper<SeckillSessionEntity> {
	
}
