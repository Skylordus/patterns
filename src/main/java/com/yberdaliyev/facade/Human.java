package com.yberdaliyev.facade;

/**
 * Created by Yerlan on 08.03.2017.
 */
public class Human {
    private Brain brain;
    private Hands hands;
    private Heart heart;

    public Human() {
        brain = new Brain();
        heart = new Heart();
        hands = new Hands();
    }

    public void life() {
        brain.stayCold(100);
        brain.think("8 marta");
        hands.doWork();
        heart.stayHot(120);
        heart.takeRhytm();
    }
}
