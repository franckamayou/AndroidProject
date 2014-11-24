package com.example.franckamayou.barcodescanningapp;

/**
 * Created by franckamayou on 11/23/14.
 */
import android.app.Application;

public class GlobalApplication extends Application{

    private String email;
    private boolean authenticated;

    public String getEmail() {

        return email;
    }

    public void setEmail(String aEmail) {

        email = aEmail;
    }

    public boolean isAuthenticated() {
        return authenticated;
    }

    public void setAuthenticated(boolean authenticated) {
        this.authenticated = authenticated;
    }
}