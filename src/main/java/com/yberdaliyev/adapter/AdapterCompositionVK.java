package com.yberdaliyev.adapter;

/**
 * Created by Yerlan on 08.03.2017.
 */
public class AdapterCompositionVK implements Bot {
    private VKBot bot = new VKBot();
    private static final int DELAY = 100;

    private boolean isFriend() {
        return false;
    }

    @Override
    public void sendMessage(String message, int userID) {
        bot.sendMessage(message,isFriend(), userID);
    }

    @Override
    public void sendSpam(String spam, int ppl) {
        bot.sendSpam(ppl,spam,100);
    }

    @Override
    public void sleep(float millis) {
        bot.sleep();
    }
}
