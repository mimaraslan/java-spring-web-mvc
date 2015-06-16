package com.mimaraslan.controller;

import com.mimaraslan.model.pojo.entity.Musteri;
import com.mimaraslan.service.MusteriService;

import org.jboss.logging.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

import javax.inject.Inject;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MusteriController {
	
	 @Inject  //@Autowired
	 private MusteriService musteriService;
	 
	private static final Logger logger = Logger.getLogger(MusteriController.class);
	
	public MusteriController() {
		System.out.println("MusteriController()");
	}

	
    @RequestMapping("newMusteri")
    public ModelAndView newMusteri(@ModelAttribute Musteri musteri) {
    	logger.info("Musteri ekleniyor. Bilgi : "+musteri);
        return new ModelAndView("musteriForm");
    }
    
    @RequestMapping("editMusteri")
    public ModelAndView updateMusteri(@RequestParam long id, @ModelAttribute Musteri musteri) {
    	logger.info("Musteri duzenleniyor. Id : "+id);
        musteri = musteriService.findMusteri(id);
        return new ModelAndView("musteriForm", "musteriObject", musteri);
    }
    
    @RequestMapping("saveMusteri")
    public ModelAndView saveMusteri(@ModelAttribute Musteri musteri) {
    	logger.info("Musteri kaydediliyor. : " + musteri);
        if(musteri.getMusteriId() == 0){ 
            musteriService.createMusteri(musteri);
        } else {
            musteriService.updateMusteri(musteri);
        }
        return new ModelAndView("redirect:listAllMusteri");
    }
    
    @RequestMapping("removeMusteri")
    public ModelAndView deleteMusteri(@RequestParam long id) {
    	logger.info("Musteri siliniyor. Id : "+id);
        musteriService.deleteMusteri(id);
        return new ModelAndView("redirect:listAllMusteri");
    }
    
    @RequestMapping(value = {"getListAllMusteri", "/listAllMusteri"})
    public ModelAndView findAllMusteri() {
    	logger.info("Bütün musteriler.");
        List<Musteri> musteriListe = musteriService.findAllMusteri();
        return new ModelAndView("musteriListe", "musteriListe", musteriListe);
    }
    
    
    @RequestMapping("searchMusteri")
    public ModelAndView searchMusteri(@RequestParam("searchAdi") String searchAdi) { 
    logger.info("Arama Musteri. Musteri isimleri: "+searchAdi);
    List<Musteri> musteriListe = musteriService.findMusteriler(searchAdi);
    return new ModelAndView("musteriListe", "musteriListe", musteriListe); 
    } 
    
    
    
    
}