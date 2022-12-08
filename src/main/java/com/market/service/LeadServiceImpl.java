package com.market.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.market.entity.Lead;
import com.market.repositories.LeadRepository;

@Service
public class LeadServiceImpl implements LeadService {

	@Autowired
	private LeadRepository leadRepo;
	
	
	@Override
	public void saveInfo(Lead lead) {
     leadRepo.save(lead);
	}

}
