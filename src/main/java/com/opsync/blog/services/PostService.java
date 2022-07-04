package com.opsync.blog.services;

import java.util.List;

import com.opsync.blog.entities.Post;
import com.opsync.blog.payloads.PostDto;

public interface PostService {

	//create
	PostDto createPost(PostDto postDto, Integer userId, Integer categoryId);
	
	//update
	PostDto updatePost(PostDto postDto, Integer postId);
	
	//delete
	void deletePost(Integer postId);
	
	//get all
	List<PostDto> getAllPost();
	
	//get single post
	Post getPostById(Integer postId);
	
	//get all post by category
	List<PostDto> getPostByCategory(Integer categoryId);
	
	
	//get all posts by user
	List<PostDto> getPostByUser(Integer userId);
	
	//search posts
	List<PostDto> searchPost(String keyword);
	
	
}
