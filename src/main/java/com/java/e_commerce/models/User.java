package com.java.e_commerce.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.ReactiveMongoTemplate;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

@Document(collection = "customer")
public class User {

	@Transient
	public static final String shortCode = "USR";

	@Id
	private String id;
	// unique
	private String username;
	private String email;
	private String password;
	private String role;
	private String address;

	public Boolean checkUserExists(String username, ReactiveMongoTemplate mongoTemplate) {
		Query query = new Query();
		query.addCriteria(Criteria.where("userName").is(username));
		return mongoTemplate.exists(query, User.class).block();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
