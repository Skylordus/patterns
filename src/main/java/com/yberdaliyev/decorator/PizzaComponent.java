package com.yberdaliyev.decorator;

/**
 * Created by Yerlan on 08.03.2017.
 */
public abstract class PizzaComponent implements ComponentInterface {
    protected ComponentInterface component;

    public PizzaComponent(ComponentInterface component) {
        this.component = component;
    }

    @Override
    public void showComponent() {
        component.showComponent();
    }
}
