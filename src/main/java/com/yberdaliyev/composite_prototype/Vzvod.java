package com.yberdaliyev.composite_prototype;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Yerlan on 08.03.2017.
 */
public class Vzvod implements Military, Prototype {
private int ammoCount = 1000;
private List<Military> otdeleniyes = new ArrayList<>();

    @Override
    public void remove(Military military) {
        otdeleniyes.remove(military);
    }

    @Override
    public void add(Military military) {
        otdeleniyes.add(military);
    }

    @Override
    public int getSoldiersCount() {
        int soldiers = 0;
        for (Military otdeleniye: otdeleniyes) {
            soldiers += otdeleniye.getSoldiersCount();
        }
        return soldiers;
    }

    @Override
    public int getAmmoCount() {
        return ammoCount;
    }

    public void setAmmoCount(int ammoCount) {
        this.ammoCount = ammoCount;
    }

    @Override
    public int getBudget() {
        return 0;
    }

    @Override
    public Prototype clone() {
        Vzvod vzvod = new Vzvod();
        vzvod.otdeleniyes = new ArrayList<>(this.otdeleniyes);
        vzvod.ammoCount = this.ammoCount;
        return vzvod;
    }
}
