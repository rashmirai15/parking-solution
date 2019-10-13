package com.PerchedPeacock.parking_solution.RequestResponse;

import java.util.List;

import org.springframework.stereotype.Component;

import com.PerchedPeacock.parking_solution.pojo.ErrorObject;
import com.PerchedPeacock.parking_solution.pojo.ParkingLocations;

/**
 * @author rashmi rai
 *
 */

@Component
public class ParkingMasterResponse {
	private List<ParkingLocations> parkingLocationList;
	private ErrorObject error;

	public List<ParkingLocations> getParkingLocationList() {
		return parkingLocationList;
	}

	public void setParkingLocationList(List<ParkingLocations> parkingLocationList) {
		this.parkingLocationList = parkingLocationList;
	}

	public ErrorObject getError() {
		return error;
	}

	public void setError(ErrorObject error) {
		this.error = error;
	}

}
