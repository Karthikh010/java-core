package com.learning.core.day5;

import java.util.Objects;

public class Employee 
{
	private String name;
	private long phoneNo;
	private int employeeId;
	private String passportNo;
	private int licenseNo;
	private String panCardNo;
	private int voterId;
	
	
	public Employee() {
		super();
	}
	public Employee(String name, long phoneNo, int employeeId, String passportNo) {
		super();
		this.name = name;
		this.phoneNo = phoneNo;
		this.employeeId = employeeId;
		this.passportNo = passportNo;
	}
	public Employee(String name, long phoneNo, int employeeId, int licenseNo, String panCardNo) {
		super();
		this.name = name;
		this.phoneNo = phoneNo;
		this.employeeId = employeeId;
		this.licenseNo = licenseNo;
		this.panCardNo = panCardNo;
	}
	public Employee(String name, long phoneNo, int employeeId, int voterId, int licenseNo) {
		super();
		this.name = name;
		this.phoneNo = phoneNo;
		this.employeeId = employeeId;
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
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
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
		return Objects.hash(employeeId, licenseNo, name, panCardNo, passportNo, phoneNo, voterId);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return employeeId == other.employeeId && licenseNo == other.licenseNo && Objects.equals(name, other.name)
				&& Objects.equals(panCardNo, other.panCardNo) && Objects.equals(passportNo, other.passportNo)
				&& phoneNo == other.phoneNo && voterId == other.voterId;
	}
	@Override
	public String toString() {
		return name + " " + phoneNo + " " + employeeId + " "
				+ passportNo + " " + licenseNo + " " + panCardNo + " " + voterId;
	}
}
