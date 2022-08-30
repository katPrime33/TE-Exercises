package com.techelevator.message_board.controller;

import com.techelevator.message_board.dao.MessageDao;
import com.techelevator.message_board.model.Message;
import com.techelevator.message_board.security.jwt.TokenProvider;
import org.springframework.http.HttpStatus;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/message")
public class MessageController {

    private MessageDao dao;

    private final TokenProvider tokenProvider;
    private final AuthenticationManagerBuilder authenticationManagerBuilder;
    private MessageDao messageDao;

    public MessageController(TokenProvider tokenProvider, AuthenticationManagerBuilder authenticationManagerBuilder, MessageDao messageDao){
        this.tokenProvider = tokenProvider;
        this.authenticationManagerBuilder = authenticationManagerBuilder;
        this.messageDao = messageDao;
    }


    @ResponseStatus(HttpStatus.CREATED)
    @RequestMapping(path = "/message", method = RequestMethod.POST)
    public Message addNewMessage(@Valid @RequestBody Message newMessage){
        return dao.addNewMessage(newMessage);
    }

    @RequestMapping(path = "/message", method = RequestMethod.GET)
    public List<Message> listAllMessages(){
        return messageDao.listAllMessages();
    }
}
