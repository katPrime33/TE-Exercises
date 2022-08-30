package com.techelevator.message_board.dao;

import com.techelevator.message_board.model.Message;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class JdbcMessageDao implements MessageDao{

    private JdbcTemplate jdbcTemplate;

    public JdbcMessageDao(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }


    @Override
    public List<Message> listAllMessages() {
        List<Message> messages = new ArrayList<>();
        String sql = "SELECT message_id, message_type_id, sender_name, receiver_name, message_text, create_date FROM message;";
        SqlRowSet results = jdbcTemplate.queryForRowSet(sql);
        while(results.next()){
            Message message = mapRowToMessage(results);
            messages.add(message);
        }
        return messages;
    }

    @Override
    public Message findMessagesByUsername(String username) {
        return null;
    }

    @Override
    public Message findMessageById(int messageId) {
        return null;
    }

    @Override
    public Message addNewMessage(Message newMessage) {
        String sql = "INSERT INTO message (message_type_id, sender_name, receiver_name, message_text) VALUES (?, ?, ?, ?) RETURNING message_id;";
        newMessage = jdbcTemplate.queryForObject(sql, Message.class);

    return newMessage;

}

    private Message mapRowToMessage(SqlRowSet rowSet){
        Message message = new Message();
        message.setId(rowSet.getInt("id"));
        message.setMessageTypeId(rowSet.getInt("message_type_id"));
        message.setSenderName(rowSet.getString("sender_name"));
        message.setReceiverName(rowSet.getString("receiver_name"));
        message.setMessageText(rowSet.getString("message_text"));
        return message;
    }

}
