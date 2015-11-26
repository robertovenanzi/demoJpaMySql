package com.example.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.example.domain.Vote;

public interface VoteRepository extends CrudRepository<Vote, Long> {
	
	@Query(value="select v.* from Optione o, Vote v where o.POLL_ID = ?1 and v.OPTION_ID = o.ID", nativeQuery = true)
	public Iterable<Vote> findByPoll(Long pollId);

}
