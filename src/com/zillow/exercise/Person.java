package com.zillow.exercise;

 

import java.util.Date;

public class Person {

    private String ssn;
    private Date dateOfBirth;
    private String firstName;
    private String lastName;
    private Double heightIn;
    private Double weightLb;

    public String getSsn() {
        return ssn;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Double getHeightIn() {
        return heightIn;
    }

    public Double getWeightLb() {
        return weightLb;
    }

     
    


    public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setHeightIn(Double heightIn) {
		this.heightIn = heightIn;
	}

	public void setWeightLb(Double weightLb) {
		this.weightLb = weightLb;
	}

	
	
	
	@Override
	public String toString() {
		return "Person [ssn=" + ssn + ", dateOfBirth=" + dateOfBirth + ", firstName=" + firstName + ", lastName="
				+ lastName + ", heightIn=" + heightIn + ", weightLb=" + weightLb + "]";
	}

 

    @Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dateOfBirth == null) ? 0 : dateOfBirth.hashCode());
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((heightIn == null) ? 0 : heightIn.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + ((ssn == null) ? 0 : ssn.hashCode());
		result = prime * result + ((weightLb == null) ? 0 : weightLb.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (dateOfBirth == null) {
			if (other.dateOfBirth != null)
				return false;
		} else if (!dateOfBirth.equals(other.dateOfBirth))
			return false;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (heightIn == null) {
			if (other.heightIn != null)
				return false;
		} else if (!heightIn.equals(other.heightIn))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		if (ssn == null) {
			if (other.ssn != null)
				return false;
		} else if (!ssn.equals(other.ssn))
			return false;
		if (weightLb == null) {
			if (other.weightLb != null)
				return false;
		} else if (!weightLb.equals(other.weightLb))
			return false;
		return true;
	}
}