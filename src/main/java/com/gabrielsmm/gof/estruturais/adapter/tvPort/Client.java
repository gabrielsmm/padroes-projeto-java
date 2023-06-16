package com.gabrielsmm.gof.estruturais.adapter.tvPort;

import com.gabrielsmm.gof.estruturais.adapter.tvPort.adapters.HDMIToOldMonitorAdapter;
import com.gabrielsmm.gof.estruturais.adapter.tvPort.adapters.HDMIToVGAAdapter;
import com.gabrielsmm.gof.estruturais.adapter.tvPort.devices.Computer;
import com.gabrielsmm.gof.estruturais.adapter.tvPort.devices.OldMonitor;
import com.gabrielsmm.gof.estruturais.adapter.tvPort.devices.TV;

public class Client {

    public static void main(String[] args) {

        Computer pc = new Computer();
        TV tv = new TV();
        pc.connectPort(tv);
        pc.sendImageAndSound("Man dancing", "Chris Brown - Yeah 3x");

        System.out.println("------ Monitor ----------");

        Computer pc2 = new Computer();
        OldMonitor monitor = new OldMonitor();
        pc2.connectPort(new HDMIToVGAAdapter(monitor));
        pc2.sendImageAndSound("Man dancing", "Chris Brown - Yeah 3x");

        System.out.println("------ Monitor Class Adapter ----------");

        Computer pc3 = new Computer();
        HDMIToOldMonitorAdapter monitorAdapter = new HDMIToOldMonitorAdapter();
        pc3.connectPort(monitorAdapter);
        pc3.sendImageAndSound("Man dancing", "Chris Brown - Yeah 3x");

    }

}
