package com.java.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.java.springboot.model.Post;

@Repository
public interface PostRepository extends JpaRepository<Post, Long>{
}
