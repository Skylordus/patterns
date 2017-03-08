package com.yberdaliyev.factoryMethod;

public class CreatorCar extends Creator {
    private CreatorCar() {}

    public static class CreatorHolder {
        private static final CreatorCar creatorCar = new CreatorCar();
        public static CreatorCar getInstance() {return creatorCar;}
    }
    @Override
    public Transport create() {
        return new Car();
    }
}

