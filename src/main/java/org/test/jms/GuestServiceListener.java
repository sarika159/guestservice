package org.test.jms;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

import org.apache.log4j.Logger;

public class GuestServiceListener implements MessageListener {
	private Logger logger = Logger.getLogger(GuestServiceListener.class);
			
	@Override
	public void onMessage(Message message) {
		
		try {
			TextMessage txtMessage = (TextMessage)message;
			String text = txtMessage.getText();
			logger.info(text);
		} catch (JMSException e) {
			e.printStackTrace();
		}
	}

}
