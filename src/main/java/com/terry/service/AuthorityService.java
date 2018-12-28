package com.terry.service;

import java.util.Optional;

import com.terry.entity.Authority;


public interface AuthorityService {

	/**
	 * 根据id查询Authority
	 * @param id
	 * @return
	 */
	Optional<Authority> getAuthorityById(Long id);

}
