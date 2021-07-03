package com.dee.hublockerapi.service;

import com.dee.hublockerapi.model.Location;
import com.dee.hublockerapi.payloads.LocationRequest;

import java.util.List;

public interface LocationService {
    Location addLocation(LocationRequest locationRequest);
    List<Location> getAllLocation();
}
