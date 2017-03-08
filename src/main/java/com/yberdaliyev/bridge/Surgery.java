package com.yberdaliyev.bridge;

/**
 * Created by Yerlan on 08.03.2017.
 */
public class Surgery implements Hospital {
    @Override
    public void heal() {
        System.out.println("surgery heal: chik chik");
    }
}
