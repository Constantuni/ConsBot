package com.mycompany.ConstantuniBot;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class ConsBot extends TelegramLongPollingBot {

    
    @Override
    public String getBotToken() {
        return "5601877296:AAGGAN4fJWxNCiTtSRhvtcs2Vj-3bg-3O8M"; //token
    }

    @Override
    public void onUpdateReceived(Update update) {
        
        System.out.println(update.getMessage().getText());   //bota yazılanları çeker
    
        String command = update.getMessage().getText();        //komut atama
        SendMessage message = new SendMessage();
        
        int mesajId = update.getMessage().getMessageId();
        /*
        String command1 = command.
        String command2 = command1;
        String command3 = command2;
        String command4 = command3;
        String command5 = command4;
        */
        
        //n word
        switch (command){
            case "/start" -> message.setText("pizza <3");
            case "/cat" -> message.setText("https://upload.wikimedia.org/wikipedia/commons/thumb/3/3a/Cat03.jpg/1200px-Cat03.jpg");
            case "n" -> message.setText("i");
            case "N" -> message.setText("I");
            case "g" -> message.setText("g");
            case "G" -> message.setText("G");
            case "e" -> message.setText("r");
            case "E" -> message.setText("R");
            case "sa" -> message.setText("as");
            case "Sa" -> message.setText("As");
            case "/uwu" -> message.setText("Herkese selam ben kiz arkadas edinince burayi biraz boslamaya basladim firsat buldukca yazmaya calisacagim");
            /*
            case "log1" -> message.setText(command);
            case "log2" -> message.setText(command1);
            case "log3" -> message.setText(command2);
            case "log4" -> message.setText(command3);
            case "log5" -> message.setText(command4);
            */
            
        }
        if (command.contains("sos")){
            message.setText("/search@Anime_Reverse_Search_Bot");
            message.setReplyToMessageId(mesajId-1);
            message.setChatId(update.getMessage().getChatId());
            
            try {
                execute(message);
            } catch (TelegramApiException ex) {
                Logger.getLogger(ConsBot.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else{
            if (command.contains("/calc")){
                String noSpace = command.replaceAll(" ","");
                String onlyOper = command.replaceAll("[^a-zA-Z0-9]","");
                String onlyDigits = command.replaceAll("[^0-9]","");
                //String noLetters = command.replaceAll("[a-zA-Z]","");
                //String onlyCalc = noLetters.replaceAll("[a-zA-Z]","");

                if(noSpace.equals("/calc10+9")||noSpace.equals("/calc9+10")){
                message.setText("21");
                }
                else{
                    message.setText(onlyOper);
                    message.setText(onlyDigits);
                }
            }
            message.setReplyToMessageId(mesajId);
            message.setChatId(update.getMessage().getChatId());
            try {
                execute(message);
            } catch (TelegramApiException ex) {
                Logger.getLogger(ConsBot.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    @Override
    public String getBotUsername() {
        return "ConstantuniBot";
    }
}
