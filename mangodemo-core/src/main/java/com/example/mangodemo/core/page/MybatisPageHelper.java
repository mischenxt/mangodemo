package com.example.mangodemo.core.page;

public class MybatisPageHelper {
	public static final String findPage = "findPage";
	
	/**
	 * ��ҳ��ѯ��Լ����ѯ��Ϊ��findPage��
	 * @param pageRequest ��ҳ����
	 * @param mapper Dao���� mybatis��mapper
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
