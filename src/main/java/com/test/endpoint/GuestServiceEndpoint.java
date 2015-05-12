package com.test.endpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.test.services.GuestService;
import com.test.webservices.guestservice.ChangeGuestLastNameResponse;
import com.test.webservices.guestservice.GuestDetailsRequest;
import com.test.webservices.guestservice.GuestDetailsResponse;

@Endpoint
public class GuestServiceEndpoint {
	
	private static final String TARGET_NAMESPACE = "http://com/test/webservices/guestservice";
	
	@Autowired
	private GuestService guestService;

	public void setGuestService(GuestService guestService) {
		this.guestService = guestService;
	}
	
	/**
	 * @param request
	 * @return the guest details
	 */
	@PayloadRoot(localPart = "GuestDetailsRequest", namespace = TARGET_NAMESPACE)  
	public @ResponsePayload GuestDetailsResponse getGuestDetails(@RequestPayload GuestDetailsRequest request){
		GuestDetailsResponse response = new GuestDetailsResponse();
		response.setGuestDetails(guestService.getGuestDetails(request.getGuestId()));
		return response;
	}
	
	@PayloadRoot(localPart = "ChangeGuestLastNameRequest", namespace = TARGET_NAMESPACE)  
	public @ResponsePayload ChangeGuestLastNameResponse ChangeGuestLastNameRequest(@RequestPayload com.test.webservices.guestservice.ChangeGuestLastNameRequest request){
		ChangeGuestLastNameResponse response = new ChangeGuestLastNameResponse();
		response.setStatus(guestService.changeGuestLastName(request.getGuestId(), request.getNewLastName()));;
		return response;
	}

	
	
}
