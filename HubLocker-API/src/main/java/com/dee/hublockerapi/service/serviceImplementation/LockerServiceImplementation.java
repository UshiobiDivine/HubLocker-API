package com.dee.hublockerapi.service.serviceImplementation;

import com.dee.hublockerapi.execptions.AppException;
import com.dee.hublockerapi.execptions.BadRequestException;
import com.dee.hublockerapi.model.Location;
import com.dee.hublockerapi.model.Locker;
import com.dee.hublockerapi.payloads.LockerRequest;
import com.dee.hublockerapi.repository.LocationRepository;
import com.dee.hublockerapi.repository.LockerRepository;
import com.dee.hublockerapi.service.LockerService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class LockerServiceImplementation implements LockerService {

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private LockerRepository lockerRepository;

    @Autowired
    private LocationRepository locationRepository;

    @Override
    public Locker addLocker(LockerRequest lockerRequest) {
        Locker locker = new Locker();
        modelMapper.map(lockerRequest, locker);
        Locker savedLocker = lockerRepository.save(locker);

        return savedLocker;
    }

    @Override
    public Locker addLockerToLocation(LockerRequest lockerRequest, Long id) {

        Locker locker = new Locker();
        modelMapper.map(lockerRequest, locker);


        Optional<Location> location = locationRepository.findById(id);
        if (location.isPresent()){
            locker.setLocation(location.get());
            Locker savedLocker = lockerRepository.save(locker);

            location.get().getLockers().add(savedLocker);
            return savedLocker;
        }
        throw new AppException("Could not add locker to location");
    }

    @Override
    public List<Locker> allLockers() {
        List<Locker> allLockers = lockerRepository.findAll();
        return allLockers;
    }

    @Override
    public List<Locker> lockersByCityOrState(String cityOrState) {

        List<Locker> all = lockerRepository.findAllByLocationLocationNameStartsWith(cityOrState);
        if (Optional.of(all).isPresent()){
            return all;
        }
        throw new BadRequestException("Could not find any locker by that location");
    }
}
