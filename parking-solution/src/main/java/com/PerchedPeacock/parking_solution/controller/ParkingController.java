package com.PerchedPeacock.parking_solution.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
 
import com.PerchedPeacock.parking_solution.RequestResponse.ParkingMasterResponse;
import com.PerchedPeacock.parking_solution.service.ParkingService;

@RestController
@RequestMapping(value = "/parking")

public class ParkingController {
    @Autowired
    ParkingService parkingService;
	@RequestMapping(value = "/parkingLocations", method = RequestMethod.GET)
	ParkingMasterResponse getParkingLocations() {
		return parkingService.getParkingLocations();
    }
}
