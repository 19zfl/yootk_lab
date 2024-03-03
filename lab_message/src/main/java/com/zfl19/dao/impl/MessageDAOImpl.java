package com.zfl19.dao.impl;

import com.zfl19.dao.IMessageDAO;
import com.zfl19.vo.Message;
import org.springframework.stereotype.Repository;

import java.util.Date;

/**
 * @ClassName:MessageDAOImpl
 * @Description: 实现类
 * @Author:zfl19
 * @CreateDate:2024/3/1 17:45
 */

@Repository
public class MessageDAOImpl implements IMessageDAO {
    @Override
    public Message handle(Message msg) {
        Message message = new Message();
        message.setTitle("【Echo】" + msg.getTitle());
        message.setContent("【Echo】" + msg.getContent());
        message.setDate(new Date());
        return message;
    }
}
