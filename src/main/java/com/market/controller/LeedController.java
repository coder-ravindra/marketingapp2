package com.market.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.market.dto.LeedData;
import com.market.entity.Lead;
import com.market.service.LeadService;

@Controller
public class LeedController {
	@Autowired
	public LeadService leeed;
	
	@RequestMapping("/create")
	public String viewLead() {
		return"create_leed";
	}
//	
//	@RequestMapping("/saveravi")
//	public String saveRavi(@ModelAttribute("l")Lead lead,ModelMap model) {
//		leeed.saveInfo(lead);
//		model.addAttribute("msg", "massage is save!!");//
//	return "create_leed";
//	}


//	@RequestMapping("/saveravi")
//	public String saveRavi(@RequestParam("xyz")String firstName,@RequestParam("lastName")String lastName,@RequestParam("email")String email,@RequestParam("mobile")String mobile,ModelMap model) {
//		Lead lead=new Lead();
//		lead.setFirstName(firstName);
//		lead.setLastName(lastName);
//		lead.setEmail(email);
//		lead.setMobile(mobile);
//		
//		leeed.saveInfo(lead);
//		
//		model.addAttribute("msg", "massage is save!!"); 
//		return "create_leed";
//	}
	
	@RequestMapping("/saveravi")
	public String saveRavi(LeedData leadData,ModelMap model) {
		//leeed.saveInfo(lead);
		
		Lead lead=new Lead();
		lead.setFirstName(leadData.getFirstName());
		lead.setLastName(leadData.getLastName());
		lead.setEmail(leadData.getEmail());
		lead.setMobile(leadData.getMobile());
		leeed.saveInfo(lead);
		System.out.println(100);
		
		model.addAttribute("msg", "massage is save!!");

	return "create_leed";
	}
}
