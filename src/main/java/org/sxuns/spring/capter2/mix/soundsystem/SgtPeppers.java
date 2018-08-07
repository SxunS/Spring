package org.sxuns.spring.capter2.mix.soundsystem;

import org.springframework.stereotype.Component;

@Component
public class SgtPeppers implements CompactDisc {
    private String title = "青花瓷";
    private String artist = "周杰伦";
    @Override
    public void play() {
        System.out.println("Playing " + title + " by " + artist);
    }
}
