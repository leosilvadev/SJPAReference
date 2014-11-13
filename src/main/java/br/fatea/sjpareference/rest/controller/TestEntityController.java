package br.fatea.sjpareference.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sun.xml.internal.bind.v2.model.annotation.AnnotationReader;

import br.fatea.sjpareference.model.responses.TestEntities;
import br.fatea.sjpareference.model.services.TestEntityService;

@RestController
@RequestMapping("/api/tests")
public class TestEntityController {

	@Autowired private TestEntityService testEntityService;
	
	@RequestMapping(method=RequestMethod.GET, produces={"application/xml", "application/json"})
	public TestEntities findAll(){
		return new TestEntities(testEntityService.findAll());
	}
	
}
