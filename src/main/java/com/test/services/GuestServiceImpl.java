package com.test.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.test.jms.GuestServiceListener;
import org.test.jms.GuestServiceProducer;

import com.guestservice.webservices.Guest;
import com.test.dao.GuestDao;

@Service
public class GuestServiceImpl implements GuestService{
	
	@Autowired
	private GuestDao guestDao;
	
	@Autowired
	private GuestServiceProducer guestServiceProducer;

	public Guest getGuestDetails(String guestId) {
		return guestDao.findGuest(guestId);
	}

	@Override
	public boolean changeGuestLastName(String guestId, String newLastName) {
		 boolean status = guestDao.updateGuest(guestId,newLastName);
		 if(status){
			 guestServiceProducer.convertAndSendTopic();
		 }
		 return status;
		 
	}

}
