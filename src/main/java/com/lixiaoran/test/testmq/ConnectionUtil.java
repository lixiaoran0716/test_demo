package com.lixiaoran.test.testmq;

import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import java.io.IOException;
import java.util.concurrent.TimeoutException;

public class ConnectionUtil {
    private static final String RABBIT_HOST = "172.16.1.4";

    private static final String RABBIT_USERNAME = "admin";

    private static final String RABBIT_PASSWORD = "admin";

    private static Connection connection = null;

    public static Connection getConnection() {
        if(connection == null) {
            ConnectionFactory connectionFactory = new ConnectionFactory();
            connectionFactory.setHost(RABBIT_HOST);
            connectionFactory.setUsername(RABBIT_USERNAME);
            connectionFactory.setPassword(RABBIT_PASSWORD);
            try {
                connection = connectionFactory.newConnection();
            } catch (IOException e) {
                e.printStackTrace();
            } catch (TimeoutException e) {
                e.printStackTrace();
            }
        }
        return connection;
    }

}
