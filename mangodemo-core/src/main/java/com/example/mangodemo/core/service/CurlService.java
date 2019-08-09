package com.example.mangodemo.core.service;

import java.util.List;

import com.example.mangodemo.core.page.PageRequest;
import com.example.mangodemo.core.page.PageResult;

/**
 * 通用curd接口
 * @author n
 *
 * @param <T>
 */
public interface CurlService<T> {
	
	int save( T record);
	
	int delede(T record);
	
	int delete(List<T> record);
	
	T findById(Long id);
	/**
	 * 分页查询
	 * 
	 * 统一封装了分页请求和结果，避免直接引入具体框架的分页对象
	 *如mybatis或jpa的分页对象，从而避免了因为替换ORM框架和导致服务层、控制层的分页接口也需要变动的情况 
	 * 
	 * 起到了解耦的作用
	 * @param pageRequest
	 * @return
	 */
	PageResult findPage(PageRequest pageRequest );
	
}
