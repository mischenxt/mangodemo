package com.example.mangodemo.admin.mapper;

import java.util.List;

import com.example.mangodemo.admin.model.SysUser;

/**
 * SysUserDAO继承基类
 */
public interface SysUserMapper extends MyBatisBaseMapper<SysUser, Long> {

	List<SysUser> findAll();

	@Override
	 int deleteByPrimaryKey(Long id);

	@Override
	int insert(SysUser record);

	@Override
	int insertSelective(SysUser record);

	@Override
	SysUser selectByPrimaryKey(Long id);

	@Override
	int updateByPrimaryKeySelective(SysUser record);

	@Override
	int updateByPrimaryKey(SysUser record);

	
	
	
}