package com.yberdaliyev.bridge;

/**
 * Created by Yerlan on 08.03.2017.
 */
public class RussianPatient extends Patient {
    @Override
    public void heal() {
        hospital.heal();
    }

    public RussianPatient(Hospital hospital) {
        super(hospital);
    }
}
