package br.fatea.sjpareference.model.services.impl;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Service;

import br.fatea.sjpareference.model.services.ChatService;
import br.fatea.sjpareference.model.services.ParserService;
import br.fatea.sjpareference.model.vo.Message;

@Service
public class ChatServiceImpl implements ChatService {

	@Autowired private JmsTemplate jmsTemplate;
	@Autowired private ParserService parserService;
	
	@Override
	public void sendMessage(Message message) {
//		JAVA 7-..
//		MessageCreator messageCreator = new MessageCreator() {
//			@Override
//			public javax.jms.Message createMessage(Session arg0) throws JMSException {
//				return null;
//			}
//		};
		
//		JAVA 8
		MessageCreator messageCreator = (session) -> session.createTextMessage(parserService.toJson(message));
		jmsTemplate.send(messageCreator);
	}

	@Override
	public Collection<Message> findAll() {
		return null;
	}

}
