package com.guestservice.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.guestservice.webservices.Guest;

public class GuestRowMapper implements RowMapper<Object>{

	@Override
	public Guest mapRow(ResultSet rs, int arg1) throws SQLException {
		return new GuestResultSetExtractor().extractData(rs);
	}

}
