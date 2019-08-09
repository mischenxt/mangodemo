package com.example.mangodemo.admin.service.impl;

import java.util.List;

import com.example.mangodemo.admin.mapper.SysUserMapper;
import com.example.mangodemo.admin.model.SysUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mangodemo.admin.service.SysUserService;

@Service
public class SysUserServiceImpl implements SysUserService{

	@Autowired
	private SysUserMapper sysUserMapper;
	
	@Override
	public List<SysUser> findAll() {
		return sysUserMapper.findAll();
	}
	
}
