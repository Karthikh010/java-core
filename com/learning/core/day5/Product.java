package com.learning.core.day5;

import java.util.Objects;

public class Product 
{
	private String pID, pName;

	public Product() {
		super();
	}

	public Product(String pID, String pName) 
	{
		super();
		this.pID = pID;
		this.pName = pName;
	}

	public String getpID() {
		return pID;
	}

	public void setpID(String pID) {
		this.pID = pID;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	@Override
	public String toString() {
		return "Product [pID=" + pID + ", pName=" + pName + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(pID, pName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return Objects.equals(pID, other.pID) && Objects.equals(pName, other.pName);
	}
	
}
