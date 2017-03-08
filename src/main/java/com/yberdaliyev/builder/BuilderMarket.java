package com.yberdaliyev.builder;

/**
 * Created by Yerlan on 07.03.2017.
 */
public class BuilderMarket extends WindowBuilder {
    public void buildModel() {
        auWindow.setModel("MarketWindow");
    }

    public void buildHeight() {
        auWindow.setHeight(100);
    }

    public void buildWidth() {
        auWindow.setWidth(100);
    }
}
