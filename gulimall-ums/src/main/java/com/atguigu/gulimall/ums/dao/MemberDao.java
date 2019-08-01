package com.atguigu.gulimall.ums.dao;

import com.atguigu.gulimall.ums.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author bzh
 * @email 1023487452@qq.com
 * @date 2019-08-01 19:08:18
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
