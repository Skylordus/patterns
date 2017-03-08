package com.yberdaliyev.adapter;

/**
 * Created by Yerlan on 08.03.2017.
 */
public interface Bot {
    void sendMessage(String message, int userID);
    void sendSpam(String spam, int ppl);
    void sleep(float millis);
}
