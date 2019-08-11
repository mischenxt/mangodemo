package com.example.mangodemo.admin.service;

import java.util.List;

import com.example.mangodemo.admin.model.SysDict;
import com.example.mangodemo.core.service.CurdService;

/**
 * 字典管理
 * @author n
 *
 */
public interface SysDictService extends CurdService<SysDict>{
	List<SysDict> findByLabel(String label);
	
}
