package com.zfl19.action;

import com.zfl19.service.IMessageService;
import com.zfl19.vo.Message;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName:MessageAction
 * @Description: 请求控制层
 * @Author:zfl19
 * @CreateDate:2024/3/1 18:01
 */

@RestController
@RequestMapping("/pages/message")
public class MessageAction {

    @Resource
    private IMessageService iMessageService;

    @RequestMapping("/message_echo")
    public Object MessageEcho(Message msg) {
        return iMessageService.echo(msg);
    }

    @RequestMapping("/message_list")
    public Object MessageList() {
        return iMessageService.getYootkMessage();
    }

}
