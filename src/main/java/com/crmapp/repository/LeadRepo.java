package com.crmapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crmapp.entity.Lead;

public interface LeadRepo extends JpaRepository<Lead, Long> {

}
