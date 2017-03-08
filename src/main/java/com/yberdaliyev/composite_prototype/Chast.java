package com.yberdaliyev.composite_prototype;

import com.yberdaliyev.abstractFactory.Chair;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Yerlan on 08.03.2017.
 */
public class Chast implements Military, Prototype {
    private List<Military> battalions = new ArrayList<>();

    @Override
    public void remove(Military military) {
        battalions.remove(military);
    }

    @Override
    public void add(Military military) {
        battalions.add(military);
    }

    @Override
    public int getSoldiersCount() {
        int soldiers = 0;
        for (Military battalion : battalions) {
            soldiers += battalion.getSoldiersCount();
        }
        return soldiers;
    }

    @Override
    public int getAmmoCount() {
        int ammo = 0;
        for (Military battalion: battalions) {
            ammo += battalion.getAmmoCount();
        }
        return ammo;
    }

    @Override
    public int getBudget() {
        int budget = 0;
        for (Military battalion: battalions) {
            budget += battalion.getBudget();
        }
        return budget;
    }

    @Override
    public Prototype clone() {
        Chast chast = new Chast();
        chast.battalions = new ArrayList<>(this.battalions);
        return chast;
    }
}
