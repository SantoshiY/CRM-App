package com.crmapp.service;

import java.util.List;

import com.crmapp.entity.Lead;

public interface LeadService {
	public void saveLead(Lead lead);

	public Lead findLeadById(long id);

	public void deleteById(long id);

	public List<Lead> getAllLeads();

}
