package com.PerchedPeacock.parking_solution.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.PerchedPeacock.parking_solution.RequestResponse.ParkingMasterResponse;
import com.PerchedPeacock.parking_solution.access.ParkingAccess;


/**
 * @author rashmi rai
 *
 */
@Service("parkingservice")
public class ParkingService {
	@Autowired
	ParkingMasterResponse parkingMasterResponse;
	
	@Autowired
	ParkingAccess parkingAccess;
	
	public ParkingMasterResponse getParkingLocations() {
		return parkingAccess.getParkingLocations();
		
	}
}
