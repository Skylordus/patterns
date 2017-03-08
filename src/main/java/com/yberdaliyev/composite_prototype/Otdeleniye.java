package com.yberdaliyev.composite_prototype;

/**
 * Created by Yerlan on 08.03.2017.
 */
public class Otdeleniye implements Military, Prototype {

    private int soldiers = 10;


    @Override
    public void remove(Military military) {

    }

    @Override
    public void add(Military military) {

    }

    @Override
    public int getSoldiersCount() {
        return soldiers;
    }

    public void setSoldiers(int soldiers) {
        this.soldiers = soldiers;
    }

    @Override
    public int getAmmoCount() {
        return 0;
    }

    @Override
    public int getBudget() {
        return 0;
    }

    @Override
    public Prototype clone() {
        Otdeleniye otdeleniye = new Otdeleniye();
        otdeleniye.soldiers = this.soldiers;
        return otdeleniye;
    }
}
