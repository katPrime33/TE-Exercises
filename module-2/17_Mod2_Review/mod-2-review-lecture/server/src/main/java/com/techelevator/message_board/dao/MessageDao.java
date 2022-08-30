package com.techelevator.message_board.dao;

import com.techelevator.message_board.model.Message;

import java.util.ArrayList;
import java.util.List;

public interface MessageDao {

    List<Message> listAllMessages();

    Message findMessagesByUsername(String username);

    Message findMessageById(int messageId);

    Message addNewMessage(Message message);
}
