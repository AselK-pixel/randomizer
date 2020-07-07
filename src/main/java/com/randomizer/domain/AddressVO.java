package com.randomizer.domain;

import java.io.Serializable;

public class AddressVO implements Serializable{
	
	private static final long serialVersionUID = -1278837313412130046L;
	
	private String house;
	private String street;
	private String postalCode;
	private String city;
	private String county;
	private String state;
	private String stateCode;
	private String country;
	private String countryCode;
	
	public AddressVO() {
		super();
	}

	public AddressVO(String house, String street, String postalCode, String city, String county, String state,
			String stateCode, String country, String countryCode) {
		super();
		this.house = house;
		this.street = street;
		this.postalCode = postalCode;
		this.city = city;
		this.county = county;
		this.state = state;
		this.stateCode = stateCode;
		this.country = country;
		this.countryCode = countryCode;
	}
	
	public String getHouse() {
		return house;
	}
	public void setHouse(String house) {
		this.house = house;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCounty() {
		return county;
	}
	public void setCounty(String county) {
		this.county = county;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getStateCode() {
		return stateCode;
	}
	public void setStateCode(String stateCode) {
		this.stateCode = stateCode;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	
	@Override
	public String toString() {
		return "AddressVO [house=" + house + ", street=" + street + ", postalCode=" + postalCode + ", city=" + city
				+ ", county=" + county + ", state=" + state + ", stateCode=" + stateCode + ", country=" + country
				+ ", countryCode=" + countryCode + "]";
	}
	
	@Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof AddressVO))
            return false;
        AddressVO other = (AddressVO) o;
        
        boolean houseEquals = (this.house == null && other.house == null)
        	      || (this.house != null && this.house.equals(other.house));
        boolean streetEquals = (this.street == null && other.street == null)
      	      || (this.street != null && this.street.equals(other.street));
        boolean postalCodeEquals = (this.postalCode == null && other.postalCode == null)
      	      || (this.postalCode != null && this.postalCode.equals(other.postalCode));
        boolean cityEquals = (this.city == null && other.city == null)
      	      || (this.city != null && this.city.equals(other.city));
        boolean countyEquals = (this.county == null && other.county == null)
      	      || (this.county != null && this.county.equals(other.county));
        boolean stateEquals = (this.state == null && other.state == null)
      	      || (this.state != null && this.state.equals(other.state));
        boolean stateCodeEquals = (this.stateCode == null && other.stateCode == null)
        	      || (this.stateCode != null && this.stateCode.equals(other.stateCode));
        boolean countryEquals = (this.country == null && other.country == null)
        	      || (this.country != null && this.country.equals(other.country));
        boolean countryCodeEquals = (this.countryCode == null && other.countryCode == null)
        	      || (this.countryCode != null && this.countryCode.equals(other.countryCode));
        
        return houseEquals && streetEquals && postalCodeEquals && cityEquals && countyEquals 
        		&& stateEquals && stateCodeEquals && countryEquals && countryCodeEquals ;
    }
	
	@Override
	public final int hashCode() {
	    int code = 17;
	    if (house != null) {
	    	code = 31 * code + house.hashCode();
	    }
	    if (street != null) {
	    	code = 31 * code + street.hashCode();
	    }
	    
	    if (postalCode != null) {
	    	code = 31 * code + postalCode.hashCode();
	    }
	    
	    if (city != null) {
	    	code = 31 * code + city.hashCode();
	    }
	    
	    if (county != null) {
	    	code = 31 * code + county.hashCode();
	    }
	    
	    if (state != null) {
	    	code = 31 * code + state.hashCode();
	    }
	    
	    if (stateCode != null) {
	    	code = 31 * code + stateCode.hashCode();
	    }
	    
	    if (country != null) {
	    	code = 31 * code + country.hashCode();
	    }
	    
	    if (countryCode != null) {
	    	code = 31 * code + countryCode.hashCode();
	    }
	   	    
	    return code;
	}
	

}
