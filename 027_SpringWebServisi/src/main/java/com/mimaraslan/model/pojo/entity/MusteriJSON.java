package com.mimaraslan.model.pojo.entity;

public class MusteriJSON  {

	String adi;
	String bilgi;
	//--------------------
	public MusteriJSON() {
	System.out.println("MusteriJSON");
	}

	public MusteriJSON (String adi, String bilgi) {
		this.adi = adi;
		this.bilgi = bilgi;
	}
	//--------------------
	public String getAdi() {
		return adi;
	}

	public String getBilgi() {
		return bilgi;
	}
	
}