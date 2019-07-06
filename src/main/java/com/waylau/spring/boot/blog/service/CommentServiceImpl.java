package com.waylau.spring.boot.blog.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.waylau.spring.boot.blog.domain.Comment;
import com.waylau.spring.boot.blog.repository.CommentRepository;

@Service
public class CommentServiceImpl implements CommentService {

	@Autowired
	private CommentRepository commentRepository;
	
	@Override
	public Comment getCommentById(Long id) {
		// TODO Auto-generated method stub
		return commentRepository.findOne(id);
	}

	@Override
	public void removeComment(Long id) {
		// TODO Auto-generated method stub
		commentRepository.delete(id);
	}

	
	
}
