package com.opsync.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.opsync.blog.entities.User;

public interface UserRepo extends JpaRepository<User, Integer>{

}
