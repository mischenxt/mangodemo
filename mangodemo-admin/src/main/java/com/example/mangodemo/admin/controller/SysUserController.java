package com.example.mangodemo.admin.controller;

import java.io.File;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.mangodemo.admin.model.SysUser;
import com.example.mangodemo.admin.service.SysUserService;
import com.example.mangodemo.core.http.HttpResult;
import com.example.mangodemo.core.page.PageRequest;

import utils.FileUtils;
import utils.PoiUtils;

@RestController
@RequestMapping("user")
public class SysUserController {
	
	@Autowired
	private SysUserService sysUserService;
	
	@GetMapping("findAll")
	public List<SysUser> findAll() {
		return sysUserService.findAll();
	}
	
	@PostMapping("findPage")
	public HttpResult findPage(@RequestBody PageRequest pageRequest) {
		return HttpResult.ok(sysUserService.findPage(pageRequest));
	}
	
	@PostMapping("exportExcelUser")
	public void exportExcelUser(@RequestBody PageRequest pageRequest,
			HttpServletResponse res) {
		File file = sysUserService.createUserExcelFile(pageRequest);
		FileUtils.downloadFile(res, file, file.getName());
		
	}
	
	
	
	
	
	
	
	
	
}
