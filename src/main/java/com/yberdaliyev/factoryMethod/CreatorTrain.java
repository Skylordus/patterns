package com.yberdaliyev.factoryMethod;

public class CreatorTrain extends Creator{
    private CreatorTrain() {}

    public static class CreatorTrainHolder {
        private static final CreatorTrain creatorTrain = new CreatorTrain();
        public static CreatorTrain getInstance() {return creatorTrain;}
    }

    public Transport create() {
        return new Train();
    }
}
