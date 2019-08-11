package com.example.mangodemo.admin.service;

import java.io.File;
import java.util.List;

import com.example.mangodemo.admin.model.SysUser;
import com.example.mangodemo.core.page.PageRequest;
import com.example.mangodemo.core.service.CurdService;

public interface SysUserService extends CurdService<SysUser>{

	List<SysUser> findAll();
	
	/**
	 * 生成用户信息的excel表
	 */
	File createUserExcelFile(PageRequest pageRequest);

}
