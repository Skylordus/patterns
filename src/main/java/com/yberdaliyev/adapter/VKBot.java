package com.yberdaliyev.adapter;

/**
 * Created by Yerlan on 08.03.2017.
 */
public class VKBot {
    public void sendMessage(String message, boolean isFriend, int userID) {
        System.out.println("in VKBot, you sent message to group and user");
    }

    public void sendSpam(int ppl, String spam, int delay) {
        System.out.println("in VKBot, you sent spam to ppl");
    }

    public void sleep() {
        System.out.println("in VKBot, sleep not implemented");
    }
}
