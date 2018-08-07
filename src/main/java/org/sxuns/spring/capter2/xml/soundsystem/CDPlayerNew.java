package org.sxuns.spring.capter2.xml.soundsystem;

public class CDPlayerNew {
    private CompactDisc compactDisc;
    public void setCompactDisc(CompactDisc compactDisc){
        this.compactDisc = compactDisc;
    }
    public void play(){
        compactDisc.play();
    }
}
