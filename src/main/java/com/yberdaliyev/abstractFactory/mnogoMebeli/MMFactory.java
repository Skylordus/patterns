package com.yberdaliyev.abstractFactory.mnogoMebeli;

import com.yberdaliyev.abstractFactory.*;

/**
 * Created by Yerlan on 07.03.2017.
 */
public class MMFactory extends MebelFactory {
    public Chair createChair() {
        return new ChairMM();
    }

    public Table createTable() {
        return new TableMM();
    }

    public Sofa createSofa() {
        return new SofaMM();
    }

    @Override
    public Taburetka createTaburetka() {
        return null;
    }
}
