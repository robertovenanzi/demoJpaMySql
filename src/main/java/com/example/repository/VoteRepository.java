package com.example.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.example.domain.Vote;

public interface VoteRepository extends CrudRepository<Vote, Long> {
	
	@Query(value="select v.* from OptionEntity o, Vote v where o.POLL_ID = ?1 and v.OPTION_ID = o.OPTION_ID", nativeQuery = true)
	public Iterable<Vote> findByPoll(Long pollId);

}
