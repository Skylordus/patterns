package com.yberdaliyev.abstractFactory.ikea;

import com.yberdaliyev.abstractFactory.*;

/**
 * Created by Yerlan on 07.03.2017.
 */
public class IkeaFactory extends MebelFactory {
    public Chair createChair() {
        return new ChairIkea();
    }

    public Table createTable() {
        return new TableIkea();
    }

    public Sofa createSofa() {
        return new SofaIkea();
    }

    public Taburetka createTaburetka() {
        return new TaburetkaIkea();
    }
}
