package com.example.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.domain.OptionEntity;

public interface OptionRepository extends CrudRepository<OptionEntity, Long> {

}
