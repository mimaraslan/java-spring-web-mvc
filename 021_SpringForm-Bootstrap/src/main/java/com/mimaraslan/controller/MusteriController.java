package com.mimaraslan.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/*
CREATE - POST

READ - GET

UPDATE - PUT

DELETE - DELETE
*/

import com.mimaraslan.model.Musteri;

@Controller
@RequestMapping("listele.htm")
public class MusteriController {

	
	@RequestMapping(method = RequestMethod.POST)
	public ModelAndView ekle(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		Musteri musteri = new Musteri();
		
		//request.setCharacterEncoding("utf-8");
		
		 String musteriAdi = request.getParameter("musteriAdi") ;
		 String musteriSoyadi = request.getParameter("musteriSoyadi") ;
		 String musteriEposta = request.getParameter("musteriEposta") ;
		
		musteri.setMusteriAdi(musteriAdi);
		musteri.setMusteriSoyadi(musteriSoyadi);
		musteri.setMusteriEposta(musteriEposta);
		
		
		 
		return new ModelAndView("MusteriView", "musteriModel", musteri);
	
	}
	

	
	
}
