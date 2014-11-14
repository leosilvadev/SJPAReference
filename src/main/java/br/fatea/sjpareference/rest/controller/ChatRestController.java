package br.fatea.sjpareference.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.fatea.sjpareference.model.services.ChatService;
import br.fatea.sjpareference.model.vo.Message;

@RestController
@RequestMapping("/chat")
public class ChatRestController {
	
	@Autowired private ChatService chatService;

	@RequestMapping(method=RequestMethod.POST, value="/{message}")
	@ResponseStatus(HttpStatus.CREATED)
	public void send(@PathVariable String message){
		chatService.sendMessage(new Message("Sender", message));
	}
	
}
