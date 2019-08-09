package com.example.mangodemo.core.page;

public class MybatisPageHelper {
	public static final String findPage = "findPage";
	
	/**
	 * 分页查询，约定查询名为“findPage”
	 * @param pageRequest 分页请求
	 * @param mapper Dao对象 mybatis的mapper
	 * @return 
	 */
	public static PageResult findPage(PageRequest pageRequest , Object mapper) {
		return findPage(pageRequest,mapper,findPage);
	}


	private static PageResult findPage(PageRequest pageRequest, Object mapper, String queryMethodName, Object...args) {
		// TODO Auto-generated method stub
		return null;
	}
}
