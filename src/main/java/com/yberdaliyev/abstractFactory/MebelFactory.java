package com.yberdaliyev.abstractFactory;

/**
 * Created by Yerlan on 07.03.2017.
 */
public abstract class MebelFactory {
    abstract public Chair  createChair();
    abstract public Table createTable();
    abstract public Sofa createSofa();
    abstract public Taburetka createTaburetka();
}
