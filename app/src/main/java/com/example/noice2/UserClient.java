package com.example.noice2;

import com.google.firebase.firestore.auth.User;
public class UserClient {
    private User user = null;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
