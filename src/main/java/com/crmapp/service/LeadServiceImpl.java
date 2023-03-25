package com.crmapp.service;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crmapp.entity.Lead;
import com.crmapp.repository.LeadRepo;

@Service
public class LeadServiceImpl implements LeadService {
	
	@Autowired
	private LeadRepo lr;

	@Override
	public void saveLead(Lead lead) {
		lr.save(lead);
		
	}

	@Override
	public Lead findLeadById(long id) {
		Optional<Lead> findById = lr.findById(id);
		Lead lead = findById.get();
		return lead;
	}

	@Override
	public void deleteById(long id) {
		lr.deleteById(id);
		
	}

	@Override
	public List<Lead> getAllLeads() {
		List<Lead> findAll = lr.findAll();
		return findAll;
	}

}
