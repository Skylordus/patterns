package com.yberdaliyev.adapter;

/**
 * Created by Yerlan on 08.03.2017.
 */
public class TelegramBot {

    public void sendMessage(String message, int groupID, int userID) {
        System.out.println("in TGbot: you sent message to group and user");
    }

    public void sendSpam(int ppl, String spam) {
        System.out.println("in TGbot:  you sent spam to ppl");
    }

    public void sleep(float millis) {
        System.out.println("in TGbot: You sleep to millis");
    }
}
