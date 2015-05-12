package org.test.jms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;

public class GuestServiceProducer {

	@Autowired
    private JmsTemplate jmsTemplate;
	
	 public void convertAndSendTopic() {
		jmsTemplate.convertAndSend("guestTopic", "success");
	 }
}