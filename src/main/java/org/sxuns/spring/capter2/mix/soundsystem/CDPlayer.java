package org.sxuns.spring.capter2.mix.soundsystem;


public class CDPlayer {
    private CompactDisc cd;
    public CDPlayer(CompactDisc cd){
        this.cd = cd;
    }
    public void cdPlayerPlay(){
        cd.play();
    }
}
