package com.example.mangodemo.core.page;

import java.util.List;

public class PageResult {
	/**
	 * ��ǰҳ��
	 */
	private int pageNum = 1;
	/**
	 * ÿҳ����
	 */
	private int pageSize = 0 ;
	/**
	 * ��¼����
	 */
	private long totalSize ;
	
	/**
	 * ҳ������
	 */
	private int totalPage ;
	
	/**
	 * ��ҳ����
	 */
	private List<?> content;

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

	public long getTotalSize() {
		return totalSize;
	}

	public void setTotalSize(long totalSize) {
		this.totalSize = totalSize;
	}

	public int getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}

	public List<?> getContent() {
		return content;
	}

	public void setContent(List<?> content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return "PageResult [��ǰҳ��=" + pageNum + ", ÿҳ����=" + pageSize + ", totalSize=" + totalSize + ", totalPage="
				+ totalPage + ", content=" + content + "]";
	}
	
	
	
	
	
	
	
	
	
	
}
