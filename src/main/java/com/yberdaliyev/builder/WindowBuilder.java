package com.yberdaliyev.builder;

/**
 * Created by Yerlan on 07.03.2017.
 */
public abstract class WindowBuilder {
    AuWindow auWindow;

    public AuWindow getAuWindow() {
        if (auWindow!=null) {
            return auWindow;
        } else return new AuWindow();
    }

    public void create() {
        auWindow = new AuWindow();
    }

    public abstract void buildModel();
    public abstract void buildHeight();
    public abstract void buildWidth();
}
