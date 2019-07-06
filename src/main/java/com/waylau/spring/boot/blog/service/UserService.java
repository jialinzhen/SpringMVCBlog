package com.waylau.spring.boot.blog.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.waylau.spring.boot.blog.domain.User;

public interface UserService {
	User saveOrUpdateUser(User user);
	User registerUser(User user);
	void removeUser(Long id);
	User getUserById(Long id);
	Page<User> listUserByNameLike(String name, Pageable pageable);
	List<User> listUsersByUsernames(List<String> usernamelist);
}
