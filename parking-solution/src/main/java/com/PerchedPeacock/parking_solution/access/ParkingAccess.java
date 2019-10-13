package com.PerchedPeacock.parking_solution.access;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.PerchedPeacock.parking_solution.RequestResponse.ParkingMasterResponse;
import com.PerchedPeacock.parking_solution.pojo.ParkingLocations;

/**
 * @author rashmi rai
 *
 */
@Repository("parkingaccess")
public class ParkingAccess {
	@Autowired
	ParkingMasterResponse parkingMasterResponse;

	public ParkingMasterResponse getParkingLocations() {
		List<ParkingLocations> parkingLocationList = new ArrayList<ParkingLocations>();
		ParkingLocations parkingLocations=new ParkingLocations();
		parkingLocations.setParkingLotLocationId(1);
		parkingLocations.setParkingLotLocationName("SanFrancisco");
		parkingLocations.setNoOfParkingSlots(10);
		parkingLocationList.add(parkingLocations);
		parkingLocations.setParkingLotLocationId(2);
		parkingLocations.setParkingLotLocationName("London");
		parkingLocations.setNoOfParkingSlots(8);
		parkingLocationList.add(parkingLocations);
		parkingLocations.setParkingLotLocationId(3);
		parkingLocations.setParkingLotLocationName("Paris");
		parkingLocations.setNoOfParkingSlots(7);
		parkingLocationList.add(parkingLocations);
		parkingMasterResponse.setParkingLocationList(parkingLocationList);
		return parkingMasterResponse;
	}
}
