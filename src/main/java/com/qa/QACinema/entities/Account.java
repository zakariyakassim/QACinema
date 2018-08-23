package com.qa.QACinema.entities;

import com.qa.QACinema.Constants;

import javax.persistence.*;
import java.util.List;

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

//	private List<Order> orders;
//
//    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "account")
//	public List<Order> getOrders(){
//        return orders;
//    }

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
