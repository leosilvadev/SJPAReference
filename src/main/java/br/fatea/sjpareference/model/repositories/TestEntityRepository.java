package br.fatea.sjpareference.model.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.fatea.sjpareference.model.entities.TestEntity;

@Repository
public interface TestEntityRepository extends CrudRepository<TestEntity, Long> {

}
