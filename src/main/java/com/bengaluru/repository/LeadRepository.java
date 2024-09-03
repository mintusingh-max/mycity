package com.bengaluru.repository;

import com.bengaluru.entity.Lead;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LeadRepository extends JpaRepository<Lead,Long> {
}
