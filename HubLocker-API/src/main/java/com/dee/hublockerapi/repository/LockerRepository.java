package com.dee.hublockerapi.repository;

import com.dee.hublockerapi.model.Locker;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LockerRepository extends JpaRepository<Locker, Long> {
}
