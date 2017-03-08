package com.yberdaliyev.composite_prototype;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Yerlan on 08.03.2017.
 */
public class Rota implements Military, Prototype {
    private int budget = 250;
    private List<Military> vzvods = new ArrayList<>();

    @Override
    public void remove(Military military) {
        vzvods.remove(military);
    }

    @Override
    public void add(Military military) {
        vzvods.add(military);
    }

    @Override
    public int getSoldiersCount() {
        int soldiers = 0;
        for (Military vzvod: vzvods) {
            soldiers += vzvod.getSoldiersCount();
        }
        return soldiers;
    }

    @Override
    public int getAmmoCount() {
        int ammo = 0;
        for (Military vzvod: vzvods) {
            ammo += vzvod.getAmmoCount();
        }
        return ammo;
    }

    @Override
    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    @Override
    public Prototype clone() {
        Rota rota = new Rota();
        rota.vzvods = new ArrayList<>(this.vzvods);
        rota.budget = this.budget;
        return rota;
    }

}
