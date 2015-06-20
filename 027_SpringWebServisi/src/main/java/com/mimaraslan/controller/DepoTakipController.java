package com.mimaraslan.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mimaraslan.model.pojo.entity.MusteriJSON;
import com.mimaraslan.model.pojo.entity.MusteriXML;

@RestController
public class DepoTakipController {
	
	@RequestMapping("/uretjson/{musteriadi}")
	public MusteriJSON uretjson(@PathVariable("musteriadi") String musteriadi) {		
		MusteriJSON sonucjson = new MusteriJSON(musteriadi, "JSON "+ musteriadi);
		return sonucjson;
	}
	
	
	@RequestMapping("/uretxml/{musteriadi}")
	public MusteriXML uretxml(@PathVariable("musteriadi") String musteriadi) {		
		MusteriXML sonucxml = new MusteriXML(musteriadi, "XML "+ musteriadi);
		return sonucxml;
	}
	
    
    
}