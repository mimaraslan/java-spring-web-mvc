package com.mimaraslan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/market")
public class AnasayfaController {
	
	@RequestMapping(value = "/gida/yazlik/{indirimOrani}")
	public ModelAndView gidaReyonu(@PathVariable("indirimOrani") String oran) {
		
		ModelAndView modelAndView = new ModelAndView("AnasayfaView");
		
		modelAndView.addObject("duyuruMesaji", "Elmalarda %"+ oran +" indirim var.");
		
		return modelAndView;
	}
	
	@RequestMapping(value = "/gida/{turu}/{indirimOrani}")
	public ModelAndView gidaReyonu(
			@PathVariable("indirimOrani") String indirimOrani, 
			@PathVariable("turu") String turu
			) {
		
		ModelAndView modelAndView = new ModelAndView("AnasayfaView");
		
		String duyuruMesaji;
		
		if(0 < Integer.valueOf(indirimOrani) ){
			duyuruMesaji = "<br /> <b> Türü :</b>  "  + turu.toUpperCase() + 
					       "<br /> <b> İndirim Oranı :</b>  %"  + indirimOrani;
		}else{
			duyuruMesaji = "<br /> <b> Türü :</b>  "  + turu.toUpperCase() + 
				           "<br /> <b style = background-color:#F6CECE> Henüz bir indirim yok.</b> ";
		}
		
		modelAndView.addObject("duyuruMesaji", duyuruMesaji);
		
		return modelAndView;
	}
	
	
	
	@RequestMapping(value = "/giyim")
	public ModelAndView giyimReyonu() {	
		ModelAndView modelAndView = new ModelAndView("AnasayfaView");	
		modelAndView.addObject("duyuruMesaji", "Eteklerde %25 indirim var.");	
		return modelAndView;
	}
	
	@RequestMapping(value = "/giyim/kislik/palto/deri")
	public ModelAndView giyimKislikPaltoDeriReyonu() {		
		ModelAndView modelAndView = new ModelAndView("AnasayfaView");		
		modelAndView.addObject("duyuruMesaji", "Henüz indirim yok.");		
		return modelAndView;
	}	
}