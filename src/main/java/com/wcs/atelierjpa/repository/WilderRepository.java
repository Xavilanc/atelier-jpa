package com.wcs.atelierjpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wcs.atelierjpa.entity.Wilder;

@Repository
public interface WilderRepository extends JpaRepository<Wilder, Long> {
    
    public List<Wilder> findByAge(int age);
}
