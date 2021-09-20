package com.htc.vaccination_centre_service.entity;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Centre")
public class Centre implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -4079612012692090400L;
	@Id
	private long centreId;
	@Column
	private String centreAddress;
	@Column
	private String pincode;
	public Centre() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Centre(long centreId, String centreAddress, String pincode) {
		super();
		this.centreId = centreId;
		this.centreAddress = centreAddress;
		this.pincode = pincode;
	}
	public long getCentreId() {
		return centreId;
	}
	public void setCentreId(long centreId) {
		this.centreId = centreId;
	}
	public String getCentreAddress() {
		return centreAddress;
	}
	public void setCentreAddress(String centreAddress) {
		this.centreAddress = centreAddress;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	@Override
	public int hashCode() {
		return Objects.hash(centreAddress, centreId, pincode);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Centre other = (Centre) obj;
		return Objects.equals(centreAddress, other.centreAddress) && centreId == other.centreId
				&& Objects.equals(pincode, other.pincode);
	}
	@Override
	public String toString() {
		return "Centre [centreId=" + centreId + ", centreAddress=" + centreAddress + ", pincode=" + pincode + "]";
	}
	
	
	
}
