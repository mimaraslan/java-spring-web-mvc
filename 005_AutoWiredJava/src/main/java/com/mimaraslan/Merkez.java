package com.mimaraslan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Merkez {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeansConfig.xml");
		
		Ders ders = context.getBean("beanDers", Ders.class);
		
		// System.out.println(ogrenci);
		
		System.out.println("ADI      :" + ders.getOgrenci().getAdi());
		System.out.println("SOYADI   :" + ders.getOgrenci().getSoyadi());
		System.out.println("NUMARASI :" + ders.getOgrenci().getNumarasi());		
		System.out.println("DERS ADI :" + ders.getDersAdi());
		System.out.println("PAUN     :" + ders.getPuan());

	}

}
