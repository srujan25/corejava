package jms;

import org.apache.activemq.ActiveMQConnectionFactory;

import javax.jms.*;

/**
 * Created by SG0221519 on 6/18/2017.
 */
public class JMSSender {

    public static void main(String[] args) {

        ActiveMQConnectionFactory factory;
        Connection connection;
        try {
            factory = new ActiveMQConnectionFactory("tcp://localhost:61616");
            connection = factory.createConnection();
            Session session = connection.createSession(false,Session.AUTO_ACKNOWLEDGE);
            Destination destination = session.createQueue("First_Queue");
            TextMessage textMsg = session.createTextMessage();
            textMsg.setText("Hello Srujan");
            MessageProducer producer = session.createProducer(destination);
            producer.send(textMsg);
            session.close();
            connection.close();
        } catch (JMSException e) {
            e.printStackTrace();
        }


    }


}
