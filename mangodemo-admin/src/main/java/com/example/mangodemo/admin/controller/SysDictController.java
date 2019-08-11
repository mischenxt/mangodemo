package com.example.mangodemo.admin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.mangodemo.admin.model.SysDict;
import com.example.mangodemo.admin.service.SysDictService;
import com.example.mangodemo.core.http.HttpResult;
import com.example.mangodemo.core.page.PageRequest;

@RestController
@RequestMapping("dict")
public class SysDictController {
	@Autowired
	private SysDictService service;
	
	@PreAuthorize("hasAuthority('sys:dict:add') AND hasAthority('sys:dict:edit')") 
	@PostMapping("/save")
	public HttpResult save(@RequestBody SysDict record) {
		return HttpResult.ok(service.save(record));
	}
	@PreAuthorize("hasAuthority('sys:dict:delete')") 
	@PostMapping("/delete")
	public HttpResult delete(@RequestBody SysDict record) {
		return HttpResult.ok(service.delede(record));
	}
	@PreAuthorize("hasAuthority('sys:dict:view')") 
	@PostMapping("/findPage")
	public HttpResult findPage(@RequestBody PageRequest pageRequest) {
		return HttpResult.ok(service.findPage(pageRequest));
	}
	@PreAuthorize("hasAuthority('sys:dict:view')") 
	@GetMapping("/findByLabel")
	public HttpResult findByLabel(@RequestParam String label) {
		return HttpResult.ok(service.findByLabel(label));
	}
	
	
}
