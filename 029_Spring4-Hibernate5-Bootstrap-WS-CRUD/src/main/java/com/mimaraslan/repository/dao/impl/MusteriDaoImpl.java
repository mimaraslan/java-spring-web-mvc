package com.mimaraslan.repository.dao.impl;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mimaraslan.model.pojo.entity.Musteri;
import com.mimaraslan.repository.dao.MusteriDao;


@Repository
public class MusteriDaoImpl implements MusteriDao {
    
	@Inject  //@Autowired
    private SessionFactory sessionFactory;
	
	//---------------------------------------------
	public MusteriDaoImpl() {
    	System.out.println("MusteriDaoImpl");
    }
	//---------------------------------------------
    @Override
    public long createMusteri(Musteri musteri) {        
    	return (long) sessionFactory.getCurrentSession().save(musteri); 
    }
    
    @Override
    public Musteri updateMusteri(Musteri musteri) {        
    	sessionFactory.getCurrentSession().update(musteri); 
        return musteri; 
    }
    
    @Override
    public void deleteMusteri(long musteriId) {
        Musteri musteri = new Musteri();
        musteri.setMusteriId(musteriId);
        sessionFactory.getCurrentSession().delete(musteri);    
        //sessionFactory.getCurrentSession().createQuery("DELETE FROM Musteri WHERE musteriId = "+musteriId).executeUpdate();      
    }
    
    @Override
    public List<Musteri> findAllMusteri() {        
        return sessionFactory.getCurrentSession().createQuery("FROM "+Musteri.class.getName()).list();        

    /*  Session session = this.sessionFactory.getCurrentSession();
        List<Musteri> muusteriListe = session.createQuery("FROM Musteri").list();
        for(Musteri m : musteriListe){
           // logger.info("Musteri List:"+m);
        }
        return musteriListe;*/
        
    }
    
    @Override
    public Musteri findMusteri(long musteriId) {
        return sessionFactory.getCurrentSession().get(Musteri.class, musteriId);

    }

	@SuppressWarnings("unchecked")
	@Override
	public List<Musteri> findMusteriler (String arananMusteriAdi) { 

String sqlSorgusu = "SELECT m.* FROM Musteri m WHERE m.musteriAdi LIKE '"+ arananMusteriAdi +"%'";
List<Object[]> musteriObjects = sessionFactory.getCurrentSession().createSQLQuery(sqlSorgusu).list();        


		List<Musteri> musteriler = new ArrayList<Musteri>();

	   // Session session = this.sessionFactory.getCurrentSession();
       // List<Musteri> musteriler = session.createQuery(sqlSorgusu).list();
      //  for(Musteri m : musteriler){
           // logger.info("Musteri Liste:"+m);
       // }
      //  return musteriler;
        
       
		for(Object[] musteriObject: musteriObjects) {
			Musteri musteri = new Musteri();
			
			long musteriId = ((BigInteger) musteriObject[0]).longValue();
			String musteriAdi = (String) musteriObject[1];
			String musteriSoyadi = (String) musteriObject[3];
			int musteriNo = (int) musteriObject[2];
		
			musteri.setMusteriId(musteriId);
			musteri.setMusteriAdi(musteriAdi);
			musteri.setMusteriSoyadi(musteriSoyadi);
			musteri.setMusteriNo(musteriNo);
								
			musteriler.add(musteri);
		}
		
		System.out.println(musteriler);
		return musteriler;
		
	}
}