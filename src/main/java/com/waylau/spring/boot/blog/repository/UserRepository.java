package com.waylau.spring.boot.blog.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.waylau.spring.boot.blog.domain.User;

/**
 * User Repository 接口.
 * 
 * @since 1.0.0 2017年4月29日
 * @author <a href="https://waylau.com">Way Lau</a> 
 */
public interface UserRepository extends JpaRepository<User, Long>{
	Page<User> findByNameLike(String name, Pageable  pageable);
	User findByUsername(String username);
	List<User> findByUsernameIn(List<String> usernames);
}
