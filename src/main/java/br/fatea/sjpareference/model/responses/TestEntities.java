package br.fatea.sjpareference.model.responses;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

import br.fatea.sjpareference.model.entities.TestEntity;

@XmlRootElement(name="test-entities")
public class TestEntities {

	@XmlElementWrapper(name="entities")
	@XmlElement(name="entity")
	private List<TestEntity> testEntities;

	public TestEntities() {}
	
	public TestEntities(List<TestEntity> testEntities){
		this.testEntities = testEntities;
	}
	
	public List<TestEntity> getTestEntities() {
		return testEntities;
	}
	
}
