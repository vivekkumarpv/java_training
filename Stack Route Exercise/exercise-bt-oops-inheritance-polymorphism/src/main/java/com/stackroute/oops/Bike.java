package com.stackroute.oops;

public class Bike extends AbstractManufacturer implements Vehicle {
	public Bike(String name, String modelName, String type) {
		super(name, modelName, type);
		// TODO Auto-generated constructor stub
	}

	/*
   Method returns maximum speed depending upon their types
   For Sports-300kmh
   For cruiser-170kmh
    */
    @Override
    public int maxSpeed(String bikeType) {
    	if (bikeType.equalsIgnoreCase("Sports")){
    		return 300;
    	}return 170;
    }

    /*
    should return in the format : Bike{Manufacturer name:'name',Model Name:'modelName',Type:'type'}
     */
    @Override
    public String getManufacturerInformation() {
    	
    	return "Bike{Manufacturer name:" + getName() + ",Model Name:"
				+ getModelName() + ",Type:" + getType() +"}";
    }

}
