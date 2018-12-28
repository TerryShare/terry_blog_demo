package com.terry.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.terry.entity.Catalog;
import com.terry.entity.User;

public interface CatalogRepository extends JpaRepository<Catalog, Long> {
	 /**
     * 根据用户查询
     * @param user
     * @return
     */
    List<Catalog> findByUser(User user);

    /**
     * 根据用户、分类名称查询
     * @param user
     * @param name
     * @return
     */
    List<Catalog> findByUserAndName(User user,String name);
}
