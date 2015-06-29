package com.mimaraslan.repository.dao;

import java.util.List;

import com.mimaraslan.model.pojo.entity.Musteri;

public interface MusteriDao {
	
    public long createMusteri(Musteri musteri);
   
    public void deleteMusteri(long musteriId);
    
    public Musteri updateMusteri(Musteri musteri);

    public List<Musteri> findAllMusteri();

    public Musteri findMusteri(long musteriId);

    public List<Musteri> findMusteriler(String musteriAdi);
	
}
