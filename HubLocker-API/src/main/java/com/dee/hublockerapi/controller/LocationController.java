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

@RestController
@RequestMapping("/api/location")
public class LocationController {

    @Autowired
    private LockerService lockerService;

    @PostMapping
    public ResponseEntity<Locker> addLocker(@Valid @RequestBody LockerRequest lockerRequest) {
        Locker locker = lockerService.addLocker(lockerRequest);
        return ResponseEntity.ok(locker);
    }
}
