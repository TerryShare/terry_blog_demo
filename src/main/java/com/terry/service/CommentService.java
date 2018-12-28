package com.terry.service;

import java.util.Optional;

import com.terry.entity.Comment;

public interface CommentService {

	/**
     * 根据id获取 Comment
     * @param id
     * @return
     */
	Optional<Comment> getCommentById(Long id);
    /**
     * 删除评论
     * @param id
     * @return
     */
    void removeComment(Long id);
}
