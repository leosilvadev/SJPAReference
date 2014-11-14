package br.fatea.sjpareference.model.services;

import java.util.Collection;

import br.fatea.sjpareference.model.vo.Message;

public interface ChatService {
	
	void sendMessage(Message message);
	
	Collection<Message> findAll();

}
