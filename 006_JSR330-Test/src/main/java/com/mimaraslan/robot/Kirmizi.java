package com.mimaraslan.robot;

import org.springframework.stereotype.Component;

@Component("kirmiziBas")
public class Kirmizi implements Bas {

	@Override
	public void olustur() {
		System.out.println("KIRMIZI baş robota eklendi.");
	}

}
