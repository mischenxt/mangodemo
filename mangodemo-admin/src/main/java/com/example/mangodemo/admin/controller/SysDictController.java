package com.example.mangodemo.admin.controller;

import org.springframework.beans.factory.annotation.Autowired;
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
	
	@PostMapping("/save")
	public HttpResult save(@RequestBody SysDict record) {
		return HttpResult.ok(service.save(record));
	}
	
	@PostMapping("/delete")
	public HttpResult delete(@RequestBody SysDict record) {
		return HttpResult.ok(service.delede(record));
	}
	@PostMapping("/findPage")
	public HttpResult findPage(@RequestBody PageRequest pageRequest) {
		return HttpResult.ok(service.findPage(pageRequest));
	}
	@GetMapping("/findByLabel")
	public HttpResult findByLabel(@RequestParam String label) {
		return HttpResult.ok(service.findByLabel(label));
	}
	
	
}
