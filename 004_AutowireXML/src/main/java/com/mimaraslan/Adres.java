package com.mimaraslan;

public class Adres {

	private String acikAdresBilgisi;
	//private String semt, ilce,....

	public String getAcikAdresBilgisi() {
		return acikAdresBilgisi;
	}

	public void setAcikAdresBilgisi(String acikAdresBilgisi) {
		this.acikAdresBilgisi = acikAdresBilgisi;
	}

	@Override
	public String toString() {
		return acikAdresBilgisi;
	}
	
	
	
}
