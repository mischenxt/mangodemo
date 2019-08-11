package com.example.mangodemo.admin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mangodemo.admin.mapper.SysDictMapper;
import com.example.mangodemo.admin.model.SysDict;
import com.example.mangodemo.admin.service.SysDictService;
import com.example.mangodemo.core.page.MybatisPageHelper;
import com.example.mangodemo.core.page.PageRequest;
import com.example.mangodemo.core.page.PageResult;

@Service
public class SysDictServiceImpl implements SysDictService{
	@Autowired
	SysDictMapper mapper;
	
	
	
	@Override
	public int save(SysDict record) {
		if(record.getId()==null||record.getId()==0) {
			return mapper.insertSelective(record);
		}
		return mapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int delede(SysDict record) {
		return mapper.deleteByPrimaryKey(record.getId());
	}

	@Override
	public int delete(List<SysDict> record) {
		for(SysDict dict : record) {
			mapper.deleteByPrimaryKey(dict.getId());
		}
		return 1;
	}

	@Override
	public SysDict findById(Long id) {
		return mapper.selectByPrimaryKey(id);
	}

	@Override
	public PageResult findPage(PageRequest pageRequest) {
		Object label = pageRequest.getParam("label");
		if(label!=null) {
			return MybatisPageHelper.findPage(pageRequest, mapper,"findPageByLabel",label);
		}
		return MybatisPageHelper.findPage(pageRequest, mapper);
	}
	
	@Override
	public List<SysDict> findByLabel(String label) {
		return mapper.findByLabel(label);
	}



}
