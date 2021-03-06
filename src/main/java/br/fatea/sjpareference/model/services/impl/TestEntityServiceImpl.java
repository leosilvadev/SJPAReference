package br.fatea.sjpareference.model.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.fatea.sjpareference.model.entities.TestEntity;
import br.fatea.sjpareference.model.repositories.TestEntityRepository;
import br.fatea.sjpareference.model.services.TestEntityService;

@Service
public class TestEntityServiceImpl implements TestEntityService {

	@Autowired private TestEntityRepository repository;
	
	public List<TestEntity> findAll(){
		return (List<TestEntity>) repository.findAll();
	}
	
}
