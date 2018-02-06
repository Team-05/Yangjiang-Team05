package com.team05.domain;

import java.io.Serializable;

/**
 * Created by dllo on 18/2/5.
 */
public class User implements Serializable{

    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
