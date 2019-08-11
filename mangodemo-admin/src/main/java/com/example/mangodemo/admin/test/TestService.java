package com.example.mangodemo.admin.test;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.mangodemo.admin.mapper.SysDictMapper;
import com.example.mangodemo.admin.mapper.SysUserMapper;
import com.example.mangodemo.admin.service.SysDictService;
import com.example.mangodemo.core.page.MybatisPageHelper;
import com.example.mangodemo.core.page.PageRequest;
import com.example.mangodemo.core.page.PageResult;

@RunWith(SpringRunner.class)   
@SpringBootTest
public class TestService {

	@Autowired
	SysUserMapper userMapper;
	
	@Autowired
	SysDictMapper dictMapper;
	
	@Autowired
	SysDictService dictService;
	
	
	@Test
	public void testDictS() {
		System.out.println(dictService.findById((long) 1));;
	}
	
	
	@Test
	public void testDict() {
		PageRequest request = new PageRequest();
		request.setPageNum(0);
		request.setPageSize(1);
		PageResult result = MybatisPageHelper.findPage(request, dictMapper);
		System.out.println(result);
	}
	
	@Test
	public void testUser() {
		PageRequest request = new PageRequest();
		request.setPageNum(0);
		request.setPageSize(1);
		PageResult result = MybatisPageHelper.findPage(request, userMapper);
		System.out.println(result);
	}

}
