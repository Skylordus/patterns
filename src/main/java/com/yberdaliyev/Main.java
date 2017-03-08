package com.yberdaliyev;

import com.yberdaliyev.composite_prototype.*;

/**
 * Created by Yerlan on 07.03.2017.
 */
public class Main {
    public static void main(String[] args) {
        Otdeleniye otdeleniye1 = new Otdeleniye();
        Otdeleniye otdeleniye2 = (Otdeleniye) otdeleniye1.clone();
        Otdeleniye otdeleniye3 = (Otdeleniye) otdeleniye2.clone();

        Vzvod vzvod1 = new Vzvod();
        vzvod1.add(otdeleniye1);
        vzvod1.add(otdeleniye2);

        Vzvod vzvod2 = (Vzvod) vzvod1.clone();
        vzvod2.add(otdeleniye3);

        Rota rota = new Rota();
        rota.add(vzvod1);
        rota.add(vzvod2);

        Battalion battalion = new Battalion();
        battalion.add(rota);

        Chast chast = new Chast();
        chast.add(battalion);

        Okrug okrug = new Okrug();
        okrug.add(chast);

        Army army = new Army();
        army.add(okrug);

        System.out.println("Total soldiers in army: "+army.getSoldiersCount());
        System.out.println("Total ammo in army: "+army.getAmmoCount());
        System.out.println("Total budget in army: "+army.getBudget());


    }
}
