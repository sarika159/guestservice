package com.test.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.guestservice.mappers.GuestRowMapper;
import com.guestservice.webservices.Guest;

@Repository
public class GuestDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public Guest findGuest(String guestId) {
		return (Guest) jdbcTemplate.queryForObject(
				"SELECT * FROM guestservice.guest WHERE guestId = ?",
				new Object[] { guestId }, new GuestRowMapper());
	}

	public boolean updateGuest(String guestId, String newLastName) {

		int numberOfrowsAffected = jdbcTemplate.update(
				"update guestservice.guest set lastName=? where guestId=?",
				new Object[] { newLastName, guestId });
		if (numberOfrowsAffected == 1) {
			return true;
		}
		return false;
	}

}
