package com.gabrielsmm.gof.estruturais.adapter.tvPort.adapters;

import com.gabrielsmm.gof.estruturais.adapter.tvPort.devices.OldMonitor;
import com.gabrielsmm.gof.estruturais.adapter.tvPort.interfaces.HDMI;

public class HDMIToOldMonitorAdapter extends OldMonitor implements HDMI {

    public HDMIToOldMonitorAdapter() {
        super();
        System.out.println("Wrapping the VGA's OldMonitor's Interface with a HDMI adapter...");
    }

    @Override
    public void setImage(String image) {
        System.out.println("Converting the image from HDMI to VGA...");
        super.setImage(image);
    }

    @Override
    public void setSound(String sound) {
        System.out.println("Sorry, we don't work with sound");
    }

}
