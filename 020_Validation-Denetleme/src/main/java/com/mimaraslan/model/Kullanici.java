package com.mimaraslan.model;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.NumberFormat;
import org.springframework.format.annotation.NumberFormat.Style;

public class Kullanici {

	@NotEmpty
	@Size (min=1, max=25)
	private String kullaniciAdi;
	
	private String email;
	
	@NotNull
	@NumberFormat(style = Style.NUMBER)
	@Min(1)
    @Max(10000)
	private String maas;
	
	@NotEmpty(message="Bu alan bos gecilemez!")
	@Size (min=1, max=50, message="Bu alan 1 ile 50 karakter arasında olmalıdır.")
	private String parola;
	
	
	public String getKullaniciAdi() {
		return kullaniciAdi;
	}
	public void setKullaniciAdi(String kullaniciAdi) {
		this.kullaniciAdi = kullaniciAdi;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMaas() {
		return maas;
	}
	public void setMaas(String maas) {
		this.maas = maas;
	}
	public String getParola() {
		return parola;
	}
	public void setParola(String parola) {
		this.parola = parola;
	}
	
	
	
	
	
	
	
	
}
