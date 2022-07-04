package com.opsync.blog.payloads;

import java.util.Date;

import javax.persistence.Transient;

import com.opsync.blog.entities.Category;
import com.opsync.blog.entities.User;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
public class PostDto {

	private Integer postId;
	
	private String title;

	private String content;

	private String imageName;

	private Date addedDate;

	private CategoryDto category;

	private UserDto user;

	@Override
	public String toString() {
		return "PostDto [title=" + title + ", content=" + content + ", imageName=" + imageName + ", addedDate="
				+ addedDate + ", category=" + category + ", user=" + user + "]";
	}
	
	

}
