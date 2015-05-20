package com.mimaraslan.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;


public class MusteriController extends MultiActionController{


	public ModelAndView ekle(HttpServletRequest request, HttpServletResponse response) throws Exception {

		String mesaj = "Müşteri sınıfındaki EKLE metodu çağırıldı.";
		System.out.println(mesaj);
		
		//ModelAndView modelAndView = new ModelAndView("MusteriView");		
		//modelAndView.addObject("modelNesnesi", mesaj);	
		//return modelAndView;	
		return new ModelAndView("MusteriView","musteriModelNesnesi", mesaj);
	}
	
	
	public ModelAndView sil(HttpServletRequest request, HttpServletResponse response) throws Exception {

		String mesaj = "Müşteri sınıfındaki SİL metodu çağırıldı.";
		System.out.println(mesaj);
		return new ModelAndView("MusteriView","musteriModelNesnesi", mesaj);
	}
	
	
	public ModelAndView duzenle(HttpServletRequest request, HttpServletResponse response) throws Exception {

		String mesaj = "Müşteri sınıfındaki DÜZENLE metodu çağırıldı.";
		System.out.println(mesaj);
		return new ModelAndView("MusteriView","musteriModelNesnesi", mesaj);
	}
	
	
	


	
	
}
