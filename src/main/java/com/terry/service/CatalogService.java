package com.terry.service;

import java.util.List;
import java.util.Optional;

import com.terry.entity.Catalog;
import com.terry.entity.User;

public interface CatalogService {
	/**
	 * 保存Catalog
	 * 
	 * @param catalog
	 * @return
	 */
	Catalog saveCatalog(Catalog catalog);

	/**
	 * 删除Catalog
	 * 
	 * @param id
	 * @return
	 */
	void removeCatalog(Long id);

	/**
	 * 根据id获取Catalog
	 * 
	 * @param id
	 * @return
	 */
	Optional<Catalog> getCatalogById(Long id);

	/**
	 * 获取Catalog列表
	 * 
	 * @return
	 */
	List<Catalog> listCatalogs(User user);
}
