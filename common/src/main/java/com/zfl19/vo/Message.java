package com.zfl19.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @ClassName:Message
 * @Description: 用于消息保存
 * @Author:zfl19
 * @CreateDate:2024/3/1 17:40
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Message {

    /**
     * 消息标题
     */
    private String title;

    /**
     * 消息内容
     */
    private String content;

    /**
     * 消息处理时间
     */
    private Date date;

}
