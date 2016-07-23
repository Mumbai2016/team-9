package org.dreamadream.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
//import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "user_details")
@SuppressWarnings("serial")
public class UserDetails implements Serializable{
	
	@Id
	@Column(name = "user_id" )
	private int userId;
	
	@Column(name = "first_name" )
	private String firstName;
	
	@Column(name = "last_name" )
	private String lastName;
	
	@Column(name = "date_of_birth" )
	private String dob;
	
	@Column(name = "gender" )
	private Date gender;
	
	@Column(name = "email" )
	private String email;

	
	@Column(name = "mobile_no" )
	private String mobile;
	
	@Column(name = "father_mobile" )
	private Date fatherMobile;
	
	@Column(name = "mother_mobile" )
	private String motherMobile;
	
	@Column(name = "current_status" )
	private String currentStatus;
	
	@Column(name = "current_level" )
	private String currentLevel;
	
	@Column(name = "current_location" )
	private String currentLocation;
	
	@Column(name = "centre" )
	private String centre;
	
	@Column(name = "school_or_college" )
	private String school_or_college;
	
	@Column(name = "medium_of_education" )
	private String medium_of_education;

	public int getUserId() {
		return userId;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getDob() {
		return dob;
	}

	public Date getGender() {
		return gender;
	}

	public String getEmail() {
		return email;
	}

	public String getMobile() {
		return mobile;
	}

	public Date getFatherMobile() {
		return fatherMobile;
	}

	public String getMotherMobile() {
		return motherMobile;
	}

	public String getCurrentStatus() {
		return currentStatus;
	}

	public String getCurrentLevel() {
		return currentLevel;
	}

	public String getCurrentLocation() {
		return currentLocation;
	}

	public String getCentre() {
		return centre;
	}

	public String getSchool_or_college() {
		return school_or_college;
	}

	public String getMedium_of_education() {
		return medium_of_education;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public void setGender(Date gender) {
		this.gender = gender;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public void setFatherMobile(Date fatherMobile) {
		this.fatherMobile = fatherMobile;
	}

	public void setMotherMobile(String motherMobile) {
		this.motherMobile = motherMobile;
	}

	public void setCurrentStatus(String currentStatus) {
		this.currentStatus = currentStatus;
	}

	public void setCurrentLevel(String currentLevel) {
		this.currentLevel = currentLevel;
	}

	public void setCurrentLocation(String currentLocation) {
		this.currentLocation = currentLocation;
	}

	public void setCentre(String centre) {
		this.centre = centre;
	}

	public void setSchool_or_college(String school_or_college) {
		this.school_or_college = school_or_college;
	}

	public void setMedium_of_education(String medium_of_education) {
		this.medium_of_education = medium_of_education;
	}

}
