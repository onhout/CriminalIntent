package com.onhout.criminalintent;

import java.util.UUID;

/**
 * Created by gpl on 9/14/15.
 */
public class Crime {
    UUID id;
    String title;
    public Crime(){
        id = UUID.randomUUID();
    }

    public UUID getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
