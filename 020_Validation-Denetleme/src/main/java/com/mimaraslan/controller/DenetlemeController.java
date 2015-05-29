package com.mimaraslan.controller;

import java.util.Map;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/*
CREATE - POST

READ - GET

UPDATE - PUT

DELETE - DELETE
*/

import com.mimaraslan.model.Kullanici;

@Controller
@RequestMapping("denetlemeform.html")
public class DenetlemeController {
	
	@RequestMapping(method = RequestMethod.GET)
	public String deneletlemeSayafasiniGoster(Map<String, Kullanici> model) {
		model.put("kullanici", new Kullanici());
		return "denetlemeform";
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String sonucBasarili(@Valid Kullanici kullanici, 
			BindingResult result, Map<String, Kullanici> model ) {
		
		if (result.hasErrors()) {
			return "denetlemeform";
		}
		
		model.put("kullanici", kullanici);
		return "denetlemebasirili";
		
	}
	

	
	
}
