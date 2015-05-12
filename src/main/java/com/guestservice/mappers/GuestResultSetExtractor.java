package com.guestservice.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.guestservice.webservices.Guest;

public class GuestResultSetExtractor implements ResultSetExtractor<Guest>{

	@Override
	public Guest extractData(ResultSet rs) throws SQLException,
			DataAccessException {
		Guest guest = new Guest();
		guest.setGuestId(rs.getString("guestId"));
		guest.setFirstName(rs.getString("firstName"));
		guest.setLastName(rs.getString("lastName"));
		return guest;
	}

}
