package com.zfl19.service;

import com.zfl19.vo.Message;

import java.util.List;

/**
 * @ClassName:IMessageService
 * @Description: 业务接口
 * @Author:zfl19
 * @CreateDate:2024/3/1 17:55
 */

public interface IMessageService {

    Message echo(Message message);

    List<Message> getYootkMessage();

}
