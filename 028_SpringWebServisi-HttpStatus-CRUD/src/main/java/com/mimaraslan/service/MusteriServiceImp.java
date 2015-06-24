package com.mimaraslan.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mimaraslan.model.pojo.entity.Musteri;

@Service ("musteriService")
@Transactional
public class MusteriServiceImp implements MusteriService {

	private static final AtomicLong sayac = new AtomicLong();
	
	private static List<Musteri> musteriler;
	
	static {
		musteriler = musterileriGetir();
	}
	
	private static List<Musteri> musterileriGetir() {	
	 List<Musteri> musteriler = new ArrayList<Musteri>();
	 musteriler.add(new Musteri(sayac.incrementAndGet(), "Mert", "Bozkurt", 33, 15000));
	 musteriler.add(new Musteri(sayac.incrementAndGet(), "Burak", "Yılmaz", 26, 18000));
	 musteriler.add(new Musteri(sayac.incrementAndGet(), "Rahman", "Yazgan", 22, 2500));
	 musteriler.add(new Musteri(sayac.incrementAndGet(), "Hamdi Atacan", "Oğul", 25, 7000));
		return musteriler;
	}

	

	@Override
	public Musteri findById(long id) {
		for (Musteri musteri : musteriler) {
			if (musteri.getId() == id) {
				return musteri;
			}
		}
		return null;
	}


	@Override
	public Musteri findByAdi(String adi) {
		for (Musteri musteri : musteriler) {
			if (musteri.getAdi().equalsIgnoreCase(adi)) {
				return musteri;
			}
		}
		return null;
	}

	@Override
	public List<Musteri> findAllMusteriler() {	
		return musteriler;
	}

	@Override
	public boolean isMusteriExist(Musteri musteri) {
		return findByAdi(musteri.getAdi()) != null;
	}

	@Override
	public void saveMusteri(Musteri musteri) {
		musteri.setId(sayac.incrementAndGet());
		musteriler.add(musteri);
	}

	@Override
	public void updateMusteri(Musteri musteri) {
		int listedekiKonumu = musteriler.indexOf(musteri);
		musteriler.set(listedekiKonumu, musteri);
	}

	@Override
	public void deleteMusteriById(long id) {
		for (Iterator iterator = musteriler.iterator(); iterator.hasNext();) {
			Musteri musteri = (Musteri) iterator.next();
			if (musteri.getId() == id) {
				 iterator.remove();
			}
		}
	}

	@Override
	public void deleteAllMusteriler() {
		musteriler.clear();
	}

}
