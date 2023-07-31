package com.gabrielsmm.gof.comportamentais.iterator.tvChannel;

import java.util.Iterator;
import java.util.Random;

public class TV implements Iterable<Integer> {

    private Integer[] channels;

    public void searchAvailableChannels() {
        this.channels = new Integer[30];
        Random r = new Random();
        int channelsCount = 0;
        for (int i = 0; i < channels.length; i++) {
            if (r.nextInt(2) == 1) {
                channels[channelsCount++] = i;
            }
        }
        System.out.println(String.format("Found %d channels...", channelsCount));
    }

    @Override
    public Iterator<Integer> iterator() {
        return new ChannelIterator(channels);
    }

}
