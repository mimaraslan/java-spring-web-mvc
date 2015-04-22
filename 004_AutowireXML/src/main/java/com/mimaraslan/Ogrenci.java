package com.mimaraslan;

public class Ogrenci {
	
	private String adi, soyadi;
	private Adres adres;
	//---------------------
	public Ogrenci() {
	}

	public Ogrenci(Adres adres) {
		this.adres = adres;
	}

	//---------------------	

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

	public Adres getAdres() {
		return adres;
	}

	public void setAdres(Adres adres) {
		this.adres = adres;
	}

	@Override
	public String toString() {
		return "\n\nOgrenci [adi=" + adi + ", soyadi=" + soyadi + ", adres=" + adres + "]\n\n";
	}
	

	

	
	
}
