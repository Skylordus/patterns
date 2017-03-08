package com.yberdaliyev.builder;

/**
 * Created by Yerlan on 07.03.2017.
 */
public class BuilderRussian extends WindowBuilder {
    public void buildModel() {
        auWindow.setModel("Russian Window");
    }

    public void buildHeight() {
        auWindow.setHeight(100);
    }

    public void buildWidth() {
        auWindow.setWidth(100);
    }
}
