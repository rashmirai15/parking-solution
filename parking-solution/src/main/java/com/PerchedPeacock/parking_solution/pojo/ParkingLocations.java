package com.PerchedPeacock.parking_solution.pojo;

import org.springframework.stereotype.Component;

/**
 * @author rashmi rai
 *
 */

@Component
public class ParkingLocations {
	private int parkingLotLocationId;
	private String parkingLotLocationName;
	private int noOfParkingSlots;

	public int getParkingLotLocationId() {
		return parkingLotLocationId;
	}

	public void setParkingLotLocationId(int parkingLotLocationId) {
		this.parkingLotLocationId = parkingLotLocationId;
	}

	public String getParkingLotLocationName() {
		return parkingLotLocationName;
	}

	public void setParkingLotLocationName(String parkingLotLocationName) {
		this.parkingLotLocationName = parkingLotLocationName;
	}

	public int getNoOfParkingSlots() {
		return noOfParkingSlots;
	}

	public void setNoOfParkingSlots(int noOfParkingSlots) {
		this.noOfParkingSlots = noOfParkingSlots;
	}

}
