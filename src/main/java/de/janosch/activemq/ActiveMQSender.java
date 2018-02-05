package de.janosch.activemq;

import javax.annotation.Resource;
import javax.enterprise.context.ApplicationScoped;
import javax.jms.*;

@ApplicationScoped
public class ActiveMQSender {

    @Resource(lookup = "java:/ConnectionFactoryActiveMQ")
    private ConnectionFactory connectionFactory;

    public void sendMessage(String message) throws JMSException {
        Connection connection = connectionFactory.createConnection();

        Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);

        Destination destination = session.createQueue("testQueue");

        MessageProducer messageProducer = session.createProducer(destination);

        TextMessage textMessage = session.createTextMessage(message);

        messageProducer.send(textMessage);

        connection.close();
    }

}