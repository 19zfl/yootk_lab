package com.zfl19.service.impl;

import com.zfl19.dao.IMessageDAO;
import com.zfl19.service.IMessageService;
import com.zfl19.vo.Message;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName:MessageServiceImpl
 * @Description: 实现类
 * @Author:zfl19
 * @CreateDate:2024/3/1 17:57
 */

@Service
public class MessageServiceImpl implements IMessageService {

    private static final List<Message> YOOTK_MESSAGE_LIST = new ArrayList<>();

    @Resource
    private IMessageDAO iMessageDAO;

    @Override
    public Message echo(Message message) {
        if (message != null) {
            if (message.getTitle().toLowerCase().contains("yootk")) {
                YOOTK_MESSAGE_LIST.add(message);
            }
            return iMessageDAO.handle(message);
        }
        return null;
    }

    @Override
    public List<Message> getYootkMessage() {
        return YOOTK_MESSAGE_LIST;
    }

}
