package com.dee.hublockerapi.service;

import com.dee.hublockerapi.model.Location;
import com.dee.hublockerapi.model.Locker;
import com.dee.hublockerapi.payloads.LockerRequest;
import org.springframework.stereotype.Service;

import java.util.List;

public interface LockerService {
    Locker addLocker(LockerRequest lockerRequest);

    List<Locker> allLockers();

    List<Locker> lockersByCityOrState(String cityOrState);
}
