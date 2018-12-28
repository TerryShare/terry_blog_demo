package com.terry.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.terry.entity.Authority;
import com.terry.repository.AuthorityRepository;

@Service
public class AuthorityServiceImpl  implements AuthorityService{
	

	@Autowired
	private AuthorityRepository authorityRepository;

	@Override
	public Optional<Authority> getAuthorityById(Long id) {
		return authorityRepository.findById(id);
	}

}
