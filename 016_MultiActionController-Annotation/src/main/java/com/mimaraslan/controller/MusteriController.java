package com.mimaraslan.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

@Controller
@RequestMapping("/musteri")
public class MusteriController extends MultiActionController{


	@RequestMapping("/ekle.adana")
	public ModelAndView ekle(HttpServletRequest request, HttpServletResponse response) throws Exception {

		String mesaj = "Müşteri sınıfındaki EKLE metodu çağırıldı.";
		System.out.println(mesaj);
		
		//ModelAndView modelAndView = new ModelAndView("MusteriView");		
		//modelAndView.addObject("modelNesnesi", mesaj);	
		//return modelAndView;	
		return new ModelAndView("MusteriView","musteriModelNesnesi", mesaj);
	}
	
	
	@RequestMapping("/sil.adana")
	public ModelAndView sil(HttpServletRequest request, HttpServletResponse response) throws Exception {

		String mesaj = "Müşteri sınıfındaki SİL metodu çağırıldı.";
		System.out.println(mesaj);
		return new ModelAndView("MusteriView","musteriModelNesnesi", mesaj);
	}
	
	@RequestMapping("/duzenle.adana")
	public ModelAndView duzenle(HttpServletRequest request, HttpServletResponse response) throws Exception {

		String mesaj = "Müşteri sınıfındaki DÜZENLE metodu çağırıldı.";
		System.out.println(mesaj);
		return new ModelAndView("MusteriView","musteriModelNesnesi", mesaj);
	}
	
	
	


	
	
}
