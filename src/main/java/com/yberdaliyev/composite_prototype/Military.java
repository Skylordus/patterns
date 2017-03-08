package com.yberdaliyev.composite_prototype;

/**
 * Created by Yerlan on 08.03.2017.
 */
public interface Military {
    void remove(Military military);
    void add(Military military);
    int getSoldiersCount();
    int getAmmoCount();
    int getBudget();
}
