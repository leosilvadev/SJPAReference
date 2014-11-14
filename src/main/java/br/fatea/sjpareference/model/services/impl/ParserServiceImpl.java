package br.fatea.sjpareference.model.services.impl;

import org.springframework.stereotype.Service;

import br.fatea.sjpareference.model.services.ParserService;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class ParserServiceImpl implements ParserService {

	@Override
	public String toJson(Object object) {
		ObjectMapper mapper = new ObjectMapper();
		try {
			return mapper.writeValueAsString(object);
			
		} catch (JsonProcessingException e) {
			e.printStackTrace();
			return "";
			
		}
	}	
	
}
