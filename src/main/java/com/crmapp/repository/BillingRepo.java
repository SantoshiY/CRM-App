package com.crmapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crmapp.entity.Billing;

public interface BillingRepo extends JpaRepository<Billing, Long> {

}
