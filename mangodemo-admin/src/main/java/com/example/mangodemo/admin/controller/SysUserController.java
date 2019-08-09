package com.example.mangodemo.admin.controller;

import com.example.mangodemo.admin.model.SysUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.mangodemo.admin.service.SysUserService;
import com.example.mangodemo.core.http.HttpResult;
import com.example.mangodemo.core.page.PageRequest;

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
	
	public HttpResult findPage(@RequestBody PageRequest pageRequest) {
		return HttpResult.ok(sysUserService.findPage(pageRequest));
		
	}
	
	
}
