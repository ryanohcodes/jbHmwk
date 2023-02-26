package org.session3;

import java.util.ArrayList;
import java.util.Arrays;

public class Zoo{
    public ArrayList<Zone> zones;

    public Zoo(ArrayList<Zone> zone){
        this.zones = zone;
    }
    public void add(Zone zone){
        zones.add(zone);
    }
}
