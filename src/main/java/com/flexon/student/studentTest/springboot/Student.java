package com.flexon.student.studentTest.springboot;


public class Student {
	private String name;
	private String lastName;
	private String major;
	private String studentID;
	private String contactNumber;
	private String address;
	private enum Gender{
		male,female
	}
	private Gender gender;
	public Student()
	{
	}
	public Student(String name, String lastName, String major, String studentID, String contactNumber, String address,
			Gender gender) {
		super();
		this.name = name;
		this.lastName = lastName;
		this.major = major;
		this.studentID = studentID;
		this.contactNumber = contactNumber;
		this.address = address;
		this.gender = gender;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public String getStudentID() {
		return studentID;
	}
	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	
	
	

}
