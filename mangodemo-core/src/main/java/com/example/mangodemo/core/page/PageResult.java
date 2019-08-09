package com.example.mangodemo.core.page;

import java.util.List;

public class PageResult {
	/**
	 * 当前页码
	 */
	private int pageNum = 1;
	/**
	 * 每页数量
	 */
	private int pageSize = 0 ;
	/**
	 * 记录总数
	 */
	private long totalSize ;
	
	/**
	 * 页码总数
	 */
	private int totalPage ;
	
	/**
	 * 分页数据
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
		return "PageResult [当前页码=" + pageNum + ", 每页数量=" + pageSize + ", totalSize=" + totalSize + ", totalPage="
				+ totalPage + ", content=" + content + "]";
	}
	
	
	
	
	
	
	
	
	
	
}
