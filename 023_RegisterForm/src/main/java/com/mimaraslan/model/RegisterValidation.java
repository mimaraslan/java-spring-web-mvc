package com.mimaraslan.model;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;

@Component("registerValidation")
public class RegisterValidation {

	public boolean denetle( Class<?> durum) {
		return RegisterForm.class.isAssignableFrom(durum);
	}
	

	
	public void validate (Object hedef, Errors hatalar) {
		
		RegisterForm registerForm = (RegisterForm) hedef;
		
		ValidationUtils.rejectIfEmptyOrWhitespace(hatalar, "kullaniciAdi", "Kullanıcı adı boş geçilemez.");
		
		String kullaniciAdi = registerForm.getKullaniciAdi();
		
		if (kullaniciAdi.length() > 2) {
		    hatalar.rejectValue("kullaniciAdi", "Arkadaş daha çok bilgi gir.");
		}
		
		
		if (!registerForm.getParola().equals(  registerForm.getParolaTekrari()   ) ) {		
			hatalar.rejectValue("parola", "Girilen parolalar aynı değil!");	
		}

	}
}

