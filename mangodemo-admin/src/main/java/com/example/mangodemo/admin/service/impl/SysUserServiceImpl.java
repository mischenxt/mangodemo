package com.example.mangodemo.admin.service.impl;

import java.util.List;

import com.example.mangodemo.admin.mapper.SysUserMapper;
import com.example.mangodemo.admin.model.SysUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mangodemo.admin.service.SysUserService;
import com.example.mangodemo.core.page.PageRequest;
import com.example.mangodemo.core.page.PageResult;

@Service
public class SysUserServiceImpl implements SysUserService{

	@Autowired
	private SysUserMapper sysUserMapper;
	
	@Override
	public List<SysUser> findAll() {
		return sysUserMapper.findAll();
	}

	@Override
	public int save(SysUser record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delede(SysUser record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(List<SysUser> record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public SysUser findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PageResult findPage(PageRequest pageRequest) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	
}
