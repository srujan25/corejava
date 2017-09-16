package jms;

import org.apache.activemq.ActiveMQConnectionFactory;

import javax.jms.*;
import java.io.IOException;

/**
 * Created by SG0221519 on 7/6/2017.
 */
public class JMSReceiver {//implements MessageListener{

    public static void main(String[] args) {
        ActiveMQConnectionFactory factory;
        Connection connection;
        try
        {
            factory = new ActiveMQConnectionFactory("tcp://localhost:61616");
            connection = factory.createConnection();
            Session session = connection.createSession(false,Session.AUTO_ACKNOWLEDGE);
            Destination destination = session.createQueue("First_Queue");
            MessageConsumer consumer = session.createConsumer(destination);

            Message message = consumer.receive();
            if(message instanceof  TextMessage)
            {
                TextMessage text = (TextMessage)message;
                try {
                    System.out.println(text.getText());
                } catch (JMSException e) {
                    e.printStackTrace();
                }
            }

            session.close();
            connection.close();
        } catch (JMSException e) {
            e.printStackTrace();
        }


    }


    /*@Override
    public void onMessage(Message message) {
        if(message instanceof  TextMessage)
        {
            TextMessage text = (TextMessage)message;
            try {
                System.out.println(text.getText());
            } catch (JMSException e) {
                e.printStackTrace();
            }
        }
    }*/
}
