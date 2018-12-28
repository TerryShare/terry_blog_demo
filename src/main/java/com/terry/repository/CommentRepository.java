package com.terry.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.terry.entity.Comment;

public interface CommentRepository extends JpaRepository<Comment, Long>{

}
