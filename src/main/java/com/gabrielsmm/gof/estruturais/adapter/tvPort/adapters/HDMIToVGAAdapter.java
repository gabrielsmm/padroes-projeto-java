package com.gabrielsmm.gof.estruturais.adapter.tvPort.adapters;

import com.gabrielsmm.gof.estruturais.adapter.tvPort.interfaces.HDMI;
import com.gabrielsmm.gof.estruturais.adapter.tvPort.interfaces.VGA;

public class HDMIToVGAAdapter implements HDMI {

    private VGA vga;

    public HDMIToVGAAdapter(VGA vga) {
        System.out.println("Connecting the HDMI/VGA adapter...");
        this.vga = vga;
    }

    @Override
    public void setImage(String image) {
        System.out.println("Converting the image from HDMI to VGA...");
        vga.setImage(image);
    }

    @Override
    public void setSound(String sound) {
        System.out.println("Sorry, we don't work with sound");
    }
}
