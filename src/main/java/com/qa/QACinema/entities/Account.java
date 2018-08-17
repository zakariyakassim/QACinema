package com.qa.QACinema.entities;

import com.qa.QACinema.Constants;

import javax.persistence.*;

@Entity
@Table(name = Constants.account_table)
public class Account {
	
	@Id
	@GeneratedValue
	@Column(name = Constants.account_id, unique = true)
	private long accountId;

	@Column(name = Constants.account_firstName)
	private String firstName;

	@Column(name = Constants.account_lastName)
	private String lastName;

	@Column(name = Constants.account_email)
	private String email;

	@Column(name = Constants.account_password)
	private String password;




	public Account() {
	}

	public Account(String firstName, String lastName, String email, String password) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
	}

	public void setAccountId(long accountId) {
		this.accountId = accountId;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public long getAccountId() {
		return accountId;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getEmail() {
		return email;
	}


}
