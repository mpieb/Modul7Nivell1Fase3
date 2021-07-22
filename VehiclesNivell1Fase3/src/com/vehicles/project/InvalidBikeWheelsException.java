package com.vehicles.project;

public class InvalidBikeWheelsException extends Exception {
	
	private static final String INVALID_BIKE_WHEELS_EXCEPTION =
                "Diameter of front and back wheels musb be the same";
	
	public InvalidBikeWheelsException() {
		super(INVALID_BIKE_WHEELS_EXCEPTION);
	}

}
