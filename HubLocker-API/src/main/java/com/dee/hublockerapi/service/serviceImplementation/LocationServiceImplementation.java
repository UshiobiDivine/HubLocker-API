package com.dee.hublockerapi.service.serviceImplementation;

import com.dee.hublockerapi.model.Location;
import com.dee.hublockerapi.payloads.LocationRequest;
import com.dee.hublockerapi.repository.LocationRepository;
import com.dee.hublockerapi.service.LocationService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LocationServiceImplementation implements LocationService{

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private LocationRepository locationRepository;

    @Override
    public Location addLocation(LocationRequest locationRequest) {
        Location location = new Location();
        modelMapper.map(locationRequest, location);
        Location savedLocation = locationRepository.save(location);

        return savedLocation;
    }
}
