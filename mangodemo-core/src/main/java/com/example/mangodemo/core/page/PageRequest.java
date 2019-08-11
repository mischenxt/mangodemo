package com.example.mangodemo.core.page;

import java.util.ArrayList;
import java.util.List;


public class PageRequest {
	/**
	 * ��ǰҳ��
	 */
	private int pageNum = 1;
	/**
	 * ÿҳ����
	 */
	private int pageSize = 10;
	/**
	 * ��ѯ����
	 */
	private List<Param> params = new ArrayList<>();

	public void setParams(List<Param> params) {
		this.params = params;
	}
	
	/**
	 * ��ѯ��������
	 * @param name ��������
	 * @return
	 */
	public Param getParam(String name) {
		for(Param param:this.params) {
			if(name != null && name.equals(param.getName())) {
				return param;
			}
		}
		return null;
	}
	/**
	 * ��ѯ����ֵ
	 * @param name ��������
	 * @return
	 */
	public String getParamValue(String name) {
		Param param = getParam(name);
		if(param != null) {
			return param.getValue();
		}
		return null;
	}

	public int getPageNum() {
		return pageNum;
	}
	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public List<Param> getParams() {
		return params;
	}

	
}
