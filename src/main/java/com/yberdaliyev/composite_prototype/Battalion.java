package com.yberdaliyev.composite_prototype;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Yerlan on 08.03.2017.
 */
public class Battalion implements Military, Prototype {
    private List<Military> rotas = new ArrayList<>();

    @Override
    public void remove(Military military) {
        rotas.remove(military);
    }

    @Override
    public void add(Military military) {
        rotas.add(military);
    }

    @Override
    public int getSoldiersCount() {
        int soldiers = 0;
        for (Military rota: rotas) {
            soldiers += rota.getSoldiersCount();
        }
        return soldiers;
    }

    @Override
    public int getAmmoCount() {
        int ammo = 0;
        for (Military rota: rotas) {
            ammo += rota.getAmmoCount();
        }
        return ammo;
    }

    @Override
    public int getBudget() {
        int budget = 0;
        for (Military rota: rotas) {
            budget += rota.getBudget();
        }
        return budget;
    }

    @Override
    public Prototype clone() {
        Battalion battalion = new Battalion();
        battalion.rotas = new ArrayList<>(this.rotas);
        return battalion;
    }
}
