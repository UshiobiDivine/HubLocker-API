package com.dee.hublockerapi.repository;

import com.dee.hublockerapi.model.Locker;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LockerRepository extends JpaRepository<Locker, Long> {

//    List<Locker> findAllByLocation_LocationName(String location);
    List<Locker> findAllByLocationLocationNameStartsWith(String location);
//    List<Locker> findAllByLocation;
}
