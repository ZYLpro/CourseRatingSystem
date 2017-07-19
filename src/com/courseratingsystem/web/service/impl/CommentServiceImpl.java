package com.courseratingsystem.web.service.impl;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.springframework.transaction.annotation.Transactional;
import com.courseratingsystem.web.dao.CommentDao;
import com.courseratingsystem.web.domain.Comment;
import com.courseratingsystem.web.service.CommentService;

@Transactional
public class CommentServiceImpl implements CommentService{
	private CommentDao commentDao;

	public CommentDao getCommentDao() {
		return commentDao;
	}

	public void setCommentDao(CommentDao commentDao) {
		this.commentDao = commentDao;
	}
	
	@Override
	public void add(Comment comment) {
		commentDao.add(comment);		
	}
	
	@Override
	public void update(Comment comment) {
		commentDao.update(comment);		
	}

	@Override
	public void delete(Comment comment) {
		commentDao.delete(comment);
		
	}

	@Override
	public List<Comment> findCommentByCommentID(int commentid) {
		return commentDao.findCommentByCommentID(commentid);
	}

	@Override
	public List<Comment> findCommentByUserID(int userid) {
		return commentDao.findCommentByUserID(userid);
	}

	@Override
	public List<Comment> findCommentByCourseID(int courseid) {
		return commentDao.findCommentByCourseID(courseid);
	}
	
	@Override
	public List<Comment> findCommentByTeacherID(int teacherid) {
		return commentDao.findCommentByTeacherID(teacherid);
	}

	@Override
	public int getTotalCount() {
		return commentDao.getTotalCount();
	}

	@Override
	public void addLikeCount(Comment comment) {
		commentDao.addLikeCount(comment);
		
	}

	@Override
	public void sorting(List<Comment> commentList,final String sortmethod) {
		Collections.sort(commentList,new Comparator<Comment>(){

			@Override
			public int compare(Comment c1, Comment c2) {
				if(sortmethod.equals("bylikeCount")){
					int i = c2.getLikeCount() - c1.getLikeCount();
					if(i==0){
						return c2.getTimestamp().compareTo(c1.getTimestamp());
					}
					return i;
				}
				return c2.getTimestamp().compareTo(c1.getTimestamp());
			}
		});
	}
}
