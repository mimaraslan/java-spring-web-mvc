package com.mimaraslan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PersonelController {

	
	@RequestMapping(value="/giris.htm", method = RequestMethod.GET)
	public ModelAndView  getPersonelForm() {
		ModelAndView mav = new ModelAndView("PersonelBilgiGirisFormu");
		return mav;
	}

	
	
	@RequestMapping(value="sonuc.htm",  method = RequestMethod.POST)
	public ModelAndView  submitPersonelForm(
			@RequestParam(value="kullaniciAdi", defaultValue="***") String adi, 
			@RequestParam("kullaniciSoyadi") String soyadi,
			@RequestParam(value="eposta") String email
			) {
		ModelAndView mav = new ModelAndView("PersonelBilgiSonucFormu");
		
		mav.addObject("kullaniciAdi", adi);
		mav.addObject("kullaniciSoyadi", soyadi);
		mav.addObject("eposta", email);
		
		return mav;
		
	}




	

	
	
}
