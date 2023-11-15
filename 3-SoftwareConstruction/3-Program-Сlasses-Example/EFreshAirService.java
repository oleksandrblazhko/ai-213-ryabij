package com.lab9.airstatechecker.service;

import com.lab9.airstatechecker.entity.EFreshAir;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public interface EFreshAirService extends JpaRepository<EFreshAir, Integer> {
}
