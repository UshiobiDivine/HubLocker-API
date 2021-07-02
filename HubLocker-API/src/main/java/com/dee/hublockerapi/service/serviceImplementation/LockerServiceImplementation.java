package com.dee.hublockerapi.service.serviceImplementation;

import com.dee.hublockerapi.model.Location;
import com.dee.hublockerapi.model.Locker;
import com.dee.hublockerapi.payloads.LockerRequest;
import com.dee.hublockerapi.repository.LockerRepository;
import com.dee.hublockerapi.service.LockerService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LockerServiceImplementation implements LockerService {

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private LockerRepository lockerRepository;

    @Override
    public Locker addLocker(LockerRequest lockerRequest) {
        Locker locker = new Locker();
        modelMapper.map(lockerRequest, locker);
        Locker savedLocker = lockerRepository.save(locker);

        return savedLocker;

    }
}
