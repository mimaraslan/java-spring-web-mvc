package com.mimaraslan.model.pojo.entity;

public class Musteri {
	
	private long id;
	private String adi;
	private String soyadi;	
	private int yasi;
	private double maasi;
	//-----------------------
	public Musteri() {
		id=0;
		yasi=0;
		maasi=0;
	System.out.println("Musteri");	
	}

	public Musteri(long id, String adi, String soyadi, int yasi, double maasi) {
		this.id = id;
		this.adi = adi;
		this.soyadi = soyadi;
		this.yasi = yasi;
		this.maasi = maasi;
	}
	//-----------------------

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getAdi() {
		return adi;
	}

	public void setAdi(String adi) {
		this.adi = adi;
	}

	public String getSoyadi() {
		return soyadi;
	}

	public void setSoyadi(String soyadi) {
		this.soyadi = soyadi;
	}

	public int getYasi() {
		return yasi;
	}

	public void setYasi(int yasi) {
		this.yasi = yasi;
	}

	public double getMaasi() {
		return maasi;
	}

	public void setMaasi(double maasi) {
		this.maasi = maasi;
	}
	//-----------------------

	@Override
	public String toString() {
		return "Musteri [id=" + id + ", adi=" + adi + ", soyadi=" + soyadi 
				+ ", yasi=" + yasi + ", maasi=" + maasi
				+ "]";
	}

	
	
	
		
}
