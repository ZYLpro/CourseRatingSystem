package com.courseratingsystem.web.vo;

import java.util.List;
import com.courseratingsystem.web.domain.Comment;

public class CommentPage {
	private int pageSize;//每页显示数量
	private int currentPage;//当前页
	private int totalCount;//总条数
	private int totalPage;
	//总页数：totalCount % pageSize == 0 ? 
	//totalCount / pageSize : totalCount / pageSize + 1
	private List<Comment> commentList;
	
	
	public CommentPage(){}
	public CommentPage(int pageSize, int currentPage, int totalCount,
			int totalPage, List<Comment> commentList) {
		super();
		this.pageSize = pageSize;
		this.currentPage = currentPage;
		this.totalCount = totalCount;
		this.totalPage = totalPage;
		this.commentList = commentList;
	}
	
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public int getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}
	public int getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}
	public int getTotalPage() {
		return totalPage;
	}
	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}
	public List<Comment> getCommentList() {
		return commentList;
	}
	public void setCommentList(List<Comment> commentList) {
		this.commentList = commentList;
	}
}
