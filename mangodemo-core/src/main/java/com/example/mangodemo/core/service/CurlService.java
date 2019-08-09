package com.example.mangodemo.core.service;

import java.util.List;

import com.example.mangodemo.core.page.PageRequest;
import com.example.mangodemo.core.page.PageResult;

/**
 * ͨ��curd�ӿ�
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
	 * ��ҳ��ѯ
	 * 
	 * ͳһ��װ�˷�ҳ����ͽ��������ֱ����������ܵķ�ҳ����
	 *��mybatis��jpa�ķ�ҳ���󣬴Ӷ���������Ϊ�滻ORM��ܺ͵��·���㡢���Ʋ�ķ�ҳ�ӿ�Ҳ��Ҫ�䶯����� 
	 * 
	 * ���˽��������
	 * @param pageRequest
	 * @return
	 */
	PageResult findPage(PageRequest pageRequest );
	
}
