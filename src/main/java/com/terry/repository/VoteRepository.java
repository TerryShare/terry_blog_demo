package com.terry.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.terry.entity.Vote;


public interface VoteRepository  extends JpaRepository<Vote, Long>{

}
