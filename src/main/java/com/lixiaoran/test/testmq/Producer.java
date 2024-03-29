package com.lixiaoran.test.testmq;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

public class Producer {
//    private static final String QUEUE_NAME = "classStandardizedResult";
    private static final String QUEUE_NAME = "outComeCppResult";
//    private static final String QUEUE_NAME = "largeResult";

    public static void main(String[] args) throws IOException, InterruptedException, TimeoutException {
        //获取连接
        Connection connection = ConnectionUtil.getConnection();
        System.out.println(connection);
        //创建通道
        Channel channel = connection.createChannel(1);
        /*
         * 声明（创建）队列
         * 参数1：队列名称
         * 参数2：为true时server重启队列不会消失
         * 参数3：队列是否是独占的，如果为true只能被一个connection使用，其他连接建立时会抛出异常
         * 参数4：队列不再使用时是否自动删除（没有连接，并且没有未处理的消息)
         * 参数5：建立队列时的其他参数
         */
        channel.queueDeclare(QUEUE_NAME,true,false,false,null);
        for (int i = 0; i < 1; i++) {
            String message = "Hello MQ!";
            message = QUEUE_NAME + message;
            channel.basicPublish("",QUEUE_NAME,null,message.getBytes());
            Thread.sleep(1000);
            System.out.println("生产者 send ："+message);
        }

        channel.close();
        connection.close();
    }
}
