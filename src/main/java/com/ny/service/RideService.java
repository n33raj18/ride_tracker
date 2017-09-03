package com.ny.service;

import java.util.List;

import com.ny.model.Ride;

public interface RideService {

	List<Ride> getRides();

	Ride createRide(Ride ride);

}