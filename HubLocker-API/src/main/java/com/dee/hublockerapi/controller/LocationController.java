package com.dee.hublockerapi.controller;

import com.dee.hublockerapi.model.Location;
import com.dee.hublockerapi.model.Locker;
import com.dee.hublockerapi.payloads.LocationRequest;
import com.dee.hublockerapi.payloads.LockerRequest;
import com.dee.hublockerapi.service.LocationService;
import com.dee.hublockerapi.service.LockerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/location")
public class LocationController {

    @Autowired
    private LocationService locationService;

    @PostMapping
    public ResponseEntity<Location> addLocker(@Valid @RequestBody LocationRequest locationRequest) {
        Location location = locationService.addLocation(locationRequest);
        return ResponseEntity.ok(location);
    }

    @GetMapping
    public ResponseEntity<List<Location>> getAllLocations(){
        List<Location> allLocation = locationService.getAllLocation();
        return ResponseEntity.ok(allLocation);
    }
}
