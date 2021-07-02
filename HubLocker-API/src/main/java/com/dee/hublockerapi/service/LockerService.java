package com.dee.hublockerapi.service;

import com.dee.hublockerapi.model.Locker;
import com.dee.hublockerapi.payloads.LockerRequest;
import org.springframework.stereotype.Service;

public interface LockerService {
    Locker addLocker(LockerRequest lockerRequest);
}
