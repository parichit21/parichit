package com.example.iam.service;

import java.util.List;

import com.example.iam.model.Lead;

public interface LeadService {


	boolean saveLead(Lead lead);

	List<Lead> getLeads();
}
