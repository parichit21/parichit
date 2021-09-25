package com.example.iam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.iam.model.Lead;
import com.example.iam.service.LeadService;

@RestController
@RequestMapping(path="/leads")
public class LeadController {
	
	@Autowired
	LeadService leadService;

	@CrossOrigin
	@PostMapping(path="/save")
	public ResponseEntity<String> getleads(@RequestBody Lead lead  )
	{
		if (leadService.saveLead(lead)) {

			return new ResponseEntity<>("Lead saved",HttpStatus.OK);
		}
		else 
		{
			return new ResponseEntity<>("Lead failed to save ",HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	
	@CrossOrigin
	@GetMapping(path="/getLeads")
	public ResponseEntity<List<Lead>> getleads( )
	{
		
		return new ResponseEntity<>(leadService.getLeads(),HttpStatus.OK);
		
	}
	
	
	
	
}
