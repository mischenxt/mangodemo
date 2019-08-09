package com.example.mangodemo.core.page;
import java.util.List;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import utils.ReflectionUtils;

public class MybatisPageHelper {

	public static final String findPage = "findPage";
	
	/**
	 * ��ҳ��ѯ, Լ����ѯ������Ϊ ��findPage�� 
	 * @param pageRequest ��ҳ����
	 * @param mapper Dao����MyBatis�� Mapper	
	 * @param args ��������
	 * @return
	 */
	public static PageResult findPage(PageRequest pageRequest, Object mapper) {
		return findPage(pageRequest, mapper, findPage);
	}
	
	/**
	 * ���÷�ҳ������з�ҳ��ѯ
	 * @param pageRequest ��ҳ����
	 * @param mapper Dao����MyBatis�� Mapper	
	 * @param queryMethodName Ҫ��ҳ�Ĳ�ѯ������
	 * @param args ��������
	 * @return
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static PageResult findPage(PageRequest pageRequest, Object mapper, String queryMethodName, Object... args) {
		// ���÷�ҳ����
		int pageNum = pageRequest.getPageNum();
		int pageSize = pageRequest.getPageSize();
		PageHelper.startPage(pageNum, pageSize);
		// ���÷�����ò�ѯ����
		Object result = ReflectionUtils.invoke(mapper, queryMethodName, args);
		return getPageResult(pageRequest, new PageInfo((List) result));
	}

	/**
	 * ����ҳ��Ϣ��װ��ͳһ�Ľӿ�
	 * @param pageRequest 
	 * @param page
	 * @return
	 */
	private static PageResult getPageResult(PageRequest pageRequest, PageInfo<?> pageInfo) {
		PageResult pageResult = new PageResult();
        pageResult.setPageNum(pageInfo.getPageNum());
        pageResult.setPageSize(pageInfo.getPageSize());
        pageResult.setTotalSize(pageInfo.getTotal());
        pageResult.setTotalPage(pageInfo.getPages());
        pageResult.setContent(pageInfo.getList());
		return pageResult;
	}

}