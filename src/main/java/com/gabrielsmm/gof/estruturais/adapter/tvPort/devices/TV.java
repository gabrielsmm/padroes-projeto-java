package com.gabrielsmm.gof.estruturais.adapter.tvPort.devices;


import com.gabrielsmm.gof.estruturais.adapter.tvPort.interfaces.HDMI;

public class TV implements HDMI {
	
	@Override
	public void setImage(String image) {
		System.out.println(">>> This is your video: " + image);
	}

	@Override
	public void setSound(String sound) {
		System.out.println(">>> This is your sound: " + sound);
	}

}
