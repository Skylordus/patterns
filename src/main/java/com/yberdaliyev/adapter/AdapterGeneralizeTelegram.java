package com.yberdaliyev.adapter;

/**
 * Created by Yerlan on 08.03.2017.
 */
public class AdapterGeneralizeTelegram extends TelegramBot implements Bot {

    private int searchGroupID() {
        return 1;
    }

    @Override
    public void sendMessage(String message, int userID) {
        this.sendMessage(message,searchGroupID(),userID);
    }

    @Override
    public void sendSpam(String spam, int ppl) {
        this.sendSpam(ppl,spam);
    }

    @Override
    public void sleep(float millis) {
        this.sleep((int)millis);
    }

}
