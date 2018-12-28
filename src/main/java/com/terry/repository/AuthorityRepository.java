package com.terry.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.terry.entity.Authority;
/**
 * AuthorityRepository用户库
 * @author pengfei.liu
 *
 */
public interface AuthorityRepository extends JpaRepository<Authority, Long>{

}
