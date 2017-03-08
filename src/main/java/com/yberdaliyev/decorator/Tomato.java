package com.yberdaliyev.decorator;

/**
 * Created by Yerlan on 08.03.2017.
 */
public class Tomato extends PizzaComponent{

    public Tomato(ComponentInterface component) {
        super(component);
    }

    @Override
    public void showComponent() {
        super.showComponent();
        System.out.println("tomato");
    }
}
