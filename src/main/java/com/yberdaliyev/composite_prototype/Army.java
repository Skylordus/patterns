package com.yberdaliyev.composite_prototype;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Yerlan on 08.03.2017.
 */
public class Army implements Military, Prototype {
    private List<Military> okrugs = new ArrayList<>();

    @Override
    public void remove(Military military) {
        okrugs.remove(military);
    }

    @Override
    public void add(Military military) {
       okrugs.add(military);
    }

    @Override
    public int getSoldiersCount() {
        int soldiers = 0;
        for (Military okrug: okrugs) {
            soldiers += okrug.getSoldiersCount();
        }
        return soldiers;
    }

    @Override
    public int getAmmoCount() {
        int ammo = 0;
        for (Military okrug: okrugs) {
            ammo += okrug.getAmmoCount();
        }
        return ammo;
    }

    @Override
    public int getBudget() {
        int budget = 0;
        for (Military okgug: okrugs) {
            budget += okgug.getBudget();
        }
        return budget;
    }

    @Override
    public Prototype clone() {
        Army army = new Army();
        army.okrugs = new ArrayList<>(this.okrugs);
        return army;
    }
}
