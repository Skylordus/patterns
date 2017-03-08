package com.yberdaliyev.bridge;

/**
 * Created by Yerlan on 08.03.2017.
 */
public abstract class Patient {
    protected Hospital hospital;

    protected Patient(Hospital hospital) {
        this.hospital = hospital;
    }

    public abstract void heal();
}
