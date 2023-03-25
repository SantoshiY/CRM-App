package com.crmapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crmapp.entity.Billing;
import com.crmapp.repository.BillingRepo;

@Service
public class BillingServiceImpl implements BillingService {
	
	@Autowired
	private BillingRepo br;

	@Override
	public void generateBill(Billing bill) {
		br.save(bill);
		
	}

}
