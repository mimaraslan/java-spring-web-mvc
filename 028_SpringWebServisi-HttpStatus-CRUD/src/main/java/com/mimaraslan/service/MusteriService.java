package com.mimaraslan.service;

import java.util.List;

import com.mimaraslan.model.pojo.entity.Musteri;

public interface MusteriService {
	
	Musteri findById (long id);
	
	Musteri findByAdi (String adi);
	
	List<Musteri> findAllMusteriler ();
	
	boolean isMusteriExist (Musteri musteri); 
	
	void saveMusteri (Musteri musteri);
	
	void updateMusteri (Musteri musteri);
	
	void deleteMusteriById (long id);
	
	void deleteAllMusteriler ();
	

}
