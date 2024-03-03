package com.zfl19.dao;

import com.zfl19.vo.Message;

/**
 * @ClassName:IMessageDAO
 * @Description:
 * @Author:zfl19
 * @CreateDate:2024/3/1 17:45
 */

public interface IMessageDAO {

    /**
     * 消息处理接口
     * @param msg
     * @return
     */
    Message handle(Message msg);

}
