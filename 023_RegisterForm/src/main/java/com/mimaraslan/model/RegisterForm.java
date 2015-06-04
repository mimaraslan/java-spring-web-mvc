package com.mimaraslan.model;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

public class RegisterForm {

	@NotEmpty
	@Size (min=3, max=45)
	private String kullaniciAdi;
	
	@NotEmpty
	@Size(min= 5, max=80)
	private String parola;
	
	@NotEmpty
	private String parolaTekrari;
	
	@NotEmpty
	@Email
	private String eposta;

	public String getKullaniciAdi() {
		return kullaniciAdi;
	}

	public void setKullaniciAdi(String kullaniciAdi) {
		this.kullaniciAdi = kullaniciAdi;
	}

	public String getParola() {
		return parola;
	}

	public void setParola(String parola) {
		this.parola = parola;
	}

	public String getParolaTekrari() {
		return parolaTekrari;
	}

	public void setParolaTekrari(String parolaTekrari) {
		this.parolaTekrari = parolaTekrari;
	}

	public String getEposta() {
		return eposta;
	}

	public void setEposta(String eposta) {
		this.eposta = eposta;
	}
	
	
	
	
}
