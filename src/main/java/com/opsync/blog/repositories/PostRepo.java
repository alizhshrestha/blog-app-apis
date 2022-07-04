package com.opsync.blog.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.opsync.blog.entities.Category;
import com.opsync.blog.entities.Post;
import com.opsync.blog.entities.User;

public interface PostRepo extends JpaRepository<Post, Integer>{

	List<Post> findByUser(User user);
	List<Post> findByCategory(Category category);
	
}
