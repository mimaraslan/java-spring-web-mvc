package com.mimaraslan.controller;

import java.util.Map;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


/*
CREATE - POST

READ - GET

UPDATE - PUT

DELETE - DELETE
*/

import com.mimaraslan.model.RegisterForm;
import com.mimaraslan.model.RegisterValidation;

@Controller
@RequestMapping("registerform.html")
public class RegisterController {

	@Autowired
	private RegisterValidation registerValidation;
	

	public void setRegisterValidation(RegisterValidation registerValidation) {
		this.registerValidation = registerValidation;
	}
	
	
	@RequestMapping(method = RequestMethod.GET)
	public String  gosterRegisterForm(Map<String, RegisterForm> model) {
		RegisterForm  registerForm = new RegisterForm();
		model.put("registerform", registerForm);
		return "registerform";
	}

	
	
	@RequestMapping(method = RequestMethod.POST)
	public String  denetleRegisterForm(@Valid RegisterForm registerForm, BindingResult result, Map<String, RegisterForm> model) {
		registerValidation.validate(registerForm, result);
		if (result.hasErrors()) {
			return "registerform";
		}
		
		 model.put("registerform", registerForm);
		 
		return "basarili";
	}




	

	
	
}
