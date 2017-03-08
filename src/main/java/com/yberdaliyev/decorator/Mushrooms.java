package com.yberdaliyev.decorator;

/**
 * Created by Yerlan on 08.03.2017.
 */
public class Mushrooms extends PizzaComponent {

    public Mushrooms(ComponentInterface component) {
        super(component);
    }

    @Override
    public void showComponent() {
        super.showComponent();
        System.out.println("mushrooms!");
    }
}
