package com.learning.core.day5;

import java.util.Objects;

public class Student 
{
	private String name;
	private long phoneNo;
	private String passportNo;
	private int licenseNo;
	private String panCardNo;
	private int voterId;
	
	public Student() {
		super();
	}

	public Student(String name, long phoneNo, String passportNo) {
		super();
		this.name = name;
		this.phoneNo = phoneNo;
		this.passportNo = passportNo;
	}

	public Student(String name, long phoneNo, int licenseNo, String panCardNo) {
		super();
		this.name = name;
		this.phoneNo = phoneNo;
		this.licenseNo = licenseNo;
		this.panCardNo = panCardNo;
	}

	public Student(String name, long phoneNo, int voterId, int licenseNo) {
		super();
		this.name = name;
		this.phoneNo = phoneNo;
		this.licenseNo = licenseNo;
		this.voterId = voterId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getPassportNo() {
		return passportNo;
	}

	public void setPassportNo(String passportNo) {
		this.passportNo = passportNo;
	}

	public int getLicenseNo() {
		return licenseNo;
	}

	public void setLicenseNo(int licenseNo) {
		this.licenseNo = licenseNo;
	}

	public String getPanCardNo() {
		return panCardNo;
	}

	public void setPanCardNo(String panCardNo) {
		this.panCardNo = panCardNo;
	}

	public int getVoterId() {
		return voterId;
	}

	public void setVoterId(int voterId) {
		this.voterId = voterId;
	}

	@Override
	public int hashCode() {
		return Objects.hash(licenseNo, name, panCardNo, passportNo, phoneNo, voterId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return licenseNo == other.licenseNo && Objects.equals(name, other.name)
				&& Objects.equals(panCardNo, other.panCardNo) && Objects.equals(passportNo, other.passportNo)
				&& phoneNo == other.phoneNo && voterId == other.voterId;
	}

	@Override
	public String toString() {
		return name + " " + phoneNo + " " + passportNo + " "
				+ licenseNo + " " + panCardNo + " " + voterId;
	}
}
