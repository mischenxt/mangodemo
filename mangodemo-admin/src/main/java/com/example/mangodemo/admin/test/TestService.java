package com.example.mangodemo.admin.test;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.mangodemo.admin.mapper.SysUserMapper;
import com.example.mangodemo.core.page.MybatisPageHelper;
import com.example.mangodemo.core.page.PageRequest;
import com.example.mangodemo.core.page.PageResult;

@RunWith(SpringRunner.class)   
@SpringBootTest
public class TestService {

	@Autowired
	SysUserMapper mapper;
	
	
	@Test
	public void test() {
		PageRequest request = new PageRequest();
		request.setPageNum(0);
		request.setPageSize(1);
		PageResult result = MybatisPageHelper.findPage(request, mapper);
		System.out.println(result);
	}

}
