package com.yberdaliyev.composite_prototype;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Yerlan on 08.03.2017.
 */
public class Okrug implements Military, Prototype {

    private List<Military> chasts = new ArrayList<>();

    @Override
    public void remove(Military military) {
        chasts.remove(military);
    }

    @Override
    public void add(Military military) {
        chasts.add(military);
    }

    @Override
    public int getSoldiersCount() {
        int soldiers = 0;
        for (Military chast: chasts) {
            soldiers += chast.getSoldiersCount();
        }
        return soldiers;
    }

    @Override
    public int getAmmoCount() {
        int ammo = 0;
        for (Military chast: chasts) {
            ammo += chast.getAmmoCount();
        }
        return ammo;
    }

    @Override
    public int getBudget() {
        int budget = 0;
        for (Military chast: chasts) {
            budget += chast.getBudget();
        }
        return budget;
    }

    @Override
    public Prototype clone() {
        Okrug okrug = new Okrug();
        okrug.chasts = new ArrayList<>(this.chasts);
        return okrug;
    }
}
