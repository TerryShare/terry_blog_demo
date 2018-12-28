package com.terry.service;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.terry.entity.Blog;
import com.terry.entity.Catalog;
import com.terry.entity.User;

public interface BlogService {
	/**
	 * 保存blog
	 * 
	 * @param blog
	 * @return
	 */
	Blog saveBlog(Blog blog);

	/**
	 * 删除blog
	 * 
	 * @param id
	 */
	void removeBlog(Long id);

	/**
	 * 根据id获取blog
	 * 
	 * @param id
	 * @return
	 */
	Optional<Blog> getBlogById(Long id);

	/**
	 * 根据用户进行博客名称分页模糊查询（最新）
	 * 
	 * @param user
	 * @return
	 */
	Page<Blog> listBlogsByTitleVote(User user, String title, Pageable pageable);

	/**
	 * 根据用户进行博客名称分页模糊查询（最热）
	 * 
	 * @param user
	 * @return
	 */
	Page<Blog> listBlogsByTitleVoteAndSort(User user, String title, Pageable pageable);
	/**
	 * 阅读量递增
	 * @param id
	 */
	void readingIncrease(Long id);
	
	/**
	 * 发表评论
	 * @param bolgId
	 * @param commentContent
	 * @return
	 */
	Blog createComment(Long bolgId,String commentContent);
	/**
	 * 删除评论
	 * @param bolgId
	 * @param commentId
	 */
	void removeComment(Long bolgId,Long commentId);

	/**
	 * 点赞
	 * @param blogId
	 * @return
	 */
	Blog createVote(Long blogId);

	/**
	 * 取消点赞
	 * @param blogId
	 * @param voteId
	 * @return
	 */
	void removeVote(Long blogId, Long voteId);
	/**
	 * 根据分类进行查询
	 * @param catalog
	 * @param pageable
	 * @return
	 */
	Page<Blog> listBlogsByCatalog(Catalog catalog, Pageable pageable); 
}
