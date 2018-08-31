package org.sxuns.spring.capter4.concert;

import java.util.HashMap;

public class CountTrack {
    private HashMap<Integer, Integer> map = new HashMap<>(8);
    public void count(int track){
        int count = getCount(track);
        map.put(track,count+1);
    }
    public int getCount(int track) {
        return map.getOrDefault(track, 0);
    }
}
