package com.example.mangodemo.admin.controller;

import com.example.mangodemo.admin.model.SysUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.mangodemo.admin.service.SysUserService;

import java.util.List;

@RestController
@RequestMapping("user")
public class SysUserController {
	
	@Autowired
	private SysUserService sysUserService;
	
	@GetMapping("find")
	public List<SysUser> findAll() {
		return sysUserService.findAll();
	}
	
}
