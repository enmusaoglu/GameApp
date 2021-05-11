package entities;

import java.util.Date;

public class User {
	private int Id;
	private String firstName;
	private String lastName;
	private Date dateOfBirth;
	private String nationallyId;
	
	public User() {}

	public User(int id, String firstName, String lastName, Date dateOfBirth, String nationallyId) {
		super();
		Id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.nationallyId = nationallyId;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getNationallyId() {
		return nationallyId;
	}

	public void setNationallyId(String nationallyId) {
		this.nationallyId = nationallyId;
	}
	
}
