package org.dreamadream.beans;


import java.io.Serializable;
import java.util.Date;


@SuppressWarnings("serial")
public class UserDetailsBean implements Serializable{
	
	
	private String userId;
	
	private String firstName;

	private String lastName;

	private String dob;

	private Date gender;

	private String email;

	private String mobile;

	private Date fatherMobile;

	private String motherMobile;

	private String currentStatus;

	private String currentLevel;

	private String currentLocation;

	private String centre;

	private String school_or_college;

	private String medium_of_education;

	public String getUserId() {
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

	public void setUserId(String userId) {
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
