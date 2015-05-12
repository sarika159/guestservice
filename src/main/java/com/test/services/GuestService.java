package com.test.services;

import com.guestservice.webservices.Guest;

public interface GuestService {
	
	/**
	 * Gets the guest detals
	 * 
	 * @param guestId
	 * @return guest details
	 */
	public Guest getGuestDetails(String guestId);
	
	public boolean changeGuestLastName(String guestId, String newLastName);

}
