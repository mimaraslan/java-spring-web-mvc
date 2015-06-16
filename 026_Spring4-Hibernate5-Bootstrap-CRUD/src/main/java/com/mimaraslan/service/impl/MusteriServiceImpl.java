package com.mimaraslan.service.impl;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mimaraslan.model.pojo.entity.Musteri;
import com.mimaraslan.repository.dao.MusteriDao;
import com.mimaraslan.service.MusteriService;

@Service
@Transactional
public class MusteriServiceImpl implements MusteriService {

	@Inject  //@Autowired
	private MusteriDao musteriDao;

	//----------------------------
	public MusteriServiceImpl() {
		System.out.println("MusteriServiceImpl");
	}
	//----------------------------
	
	@Override
	public long createMusteri(Musteri musteri) {
		return musteriDao.createMusteri(musteri);
	}

	@Override
	public Musteri updateMusteri(Musteri musteri) {
		return musteriDao.updateMusteri(musteri);
	}

	@Override
	public void deleteMusteri(long musteriId) {
		musteriDao.deleteMusteri(musteriId);
	}

	@Override
	public List<Musteri> findAllMusteri() {
		return musteriDao.findAllMusteri();
	}

	@Override
	public Musteri findMusteri(long musteriId) {
		return musteriDao.findMusteri(musteriId);
	}

	@Override
	public List<Musteri> findMusteriler(String musteriAdi) {
		return musteriDao.findMusteriler(musteriAdi);
	}
}
