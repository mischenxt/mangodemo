package com.example.mangodemo.admin.mapper;

import java.util.List;
import java.util.Set;

import com.example.mangodemo.admin.model.SysUser;

/**
 * SysUserDAO继承基类
 */
public interface SysUserMapper extends MyBatisBaseMapper<SysUser, Long> {

	List<SysUser> findAll();
	
	/**
	 * 分页查询
	 * @return
	 */
	List<SysUser> findPage();
	

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

	SysUser findByName(String username);

	Set<String> findPermissions(String name);


	
	
	
}