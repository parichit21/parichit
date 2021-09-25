package com.example.iam.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.iam.Dao.LeadRepository;
import com.example.iam.model.Lead;

@Service
public class LeadServiceImpl implements LeadService {

	@Autowired
	LeadRepository leadRepository;
	
	@Override
	public boolean saveLead(Lead lead)
	{
		try {
			Lead saveLead = leadRepository.save(lead); 
			if(saveLead != null)
			{
			return true;
			}
			else 
			{
				return false;
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return false;
	}
	
	@Override
	public List<Lead> getLeads()
	{
		return leadRepository.findAll();
	}
	
	
	
	
	
	
	
}
