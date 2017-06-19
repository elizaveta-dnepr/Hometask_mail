package com.layout.liza.hometaskmail;

import android.media.Image;

import java.sql.Time;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by liza on 6/13/17.
 */

public class Mail {

     String sender;
     int iconId;
     String mailTheme;
     String mailBody;
     Time time;
     Boolean activeStar;
     Boolean newMail;


    public Mail(String sender, int iconId, String mailTheme, String mailBody, Boolean newMail, Time time, Boolean activeStar) {
        this.sender = sender;
        this.iconId = iconId;
        this.mailTheme = mailTheme;
        this.mailBody = mailBody;
        this.newMail = newMail;
        this.time = time;
        this.activeStar = activeStar;
    }



}

