package br.fatea.sjpareference.config;

import javax.annotation.Resource;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.activemq.command.ActiveMQTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jms.core.JmsTemplate;

@Configuration
@PropertySource("classpath:application.properties")
public class JMSContext {

    @Resource private Environment environment;
    
	@Bean
    public JmsTemplate jmsTemplate() {
        JmsTemplate jmsTemplate = new JmsTemplate();
        jmsTemplate.setDefaultDestination(new ActiveMQTopic(environment.getProperty("jms.topic.chat")));
        jmsTemplate.setConnectionFactory(connectionFactory());
        return jmsTemplate;
    }
	
	@Bean
    public ActiveMQConnectionFactory connectionFactory() {
        ActiveMQConnectionFactory activeMQConnectionFactory = new ActiveMQConnectionFactory();
        activeMQConnectionFactory.setBrokerURL(environment.getProperty("jms.broker.url"));
        return activeMQConnectionFactory;
    }
	
	
//	@Bean
//    public DefaultMessageListenerContainer messageListenerContainer() {
//        DefaultMessageListenerContainer messageListenerContainer = new DefaultMessageListenerContainer();
//        messageListenerContainer.setConnectionFactory(connectionFactory());
//        messageListenerContainer.setDestinationName("jms.queue");
////        messageListenerContainer.setMessageListener(jmsReceiver());
//        return messageListenerContainer;
//    }
//	
//	@Bean
//    public MessageListener chatReceiver() {
//        return (message) -> {  };
//    }
	
}
