package com.terry.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.terry.entity.Vote;
import com.terry.repository.VoteRepository;

@Service
public class VoteServiceImpl implements VoteService {

	@Autowired
	private VoteRepository voteRepository;

	@Override
	public Optional<Vote> getVoteById(Long id) {
		return voteRepository.findById(id);
	}

	@Override
	public void removeVote(Long id) {
		voteRepository.deleteById(id);
	}

}
