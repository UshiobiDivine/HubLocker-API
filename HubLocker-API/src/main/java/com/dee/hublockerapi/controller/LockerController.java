package com.dee.hublockerapi.controller;


import com.dee.hublockerapi.model.Location;
import com.dee.hublockerapi.model.Locker;
import com.dee.hublockerapi.payloads.LockerRequest;
import com.dee.hublockerapi.service.LockerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/locker")
public class LockerController {

    @Autowired
    private LockerService lockerService;

    @PostMapping
    public ResponseEntity<Locker> addLocker(@Valid @RequestBody LockerRequest lockerRequest) {
        Locker locker = lockerService.addLocker(lockerRequest);
        return ResponseEntity.ok(locker);
    }

    @GetMapping
    public ResponseEntity<List<Locker>> getAllLockers(){
        List<Locker> allLocation = lockerService.allLockers();
        return ResponseEntity.ok(allLocation);
    }

    @GetMapping("/{cityOrState}")
    public ResponseEntity<List<Locker>> getLockersByCityOrState(@Valid @PathVariable(name = "cityOrState") String cityOrState){
        List<Locker> byCityOrState = lockerService.lockersByCityOrState(cityOrState);
        return ResponseEntity.ok(byCityOrState);
    }
}
