package com.mycompany.ConstantuniBot;

import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

/**
 *
 * @author Administrator
 */
public class MainClass {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        
        try {
                TelegramBotsApi telegramBotsApi = new TelegramBotsApi(DefaultBotSession.class);
                telegramBotsApi.registerBot(new ConsBot());
                
            } catch (TelegramApiException e) {
                //e.printStackTrace();
            }
    }
}