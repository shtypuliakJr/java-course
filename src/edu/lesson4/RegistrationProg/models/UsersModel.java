package edu.lesson4.RegistrationProg.models;

import edu.lesson4.RegistrationProg.notes.User;

import java.util.HashMap;
import java.util.Map;

public class UsersModel {

    private static int userId = 0;

    protected Map<Integer, User> usersList = new HashMap<>();

    public void addUser(User user) {
        this.usersList.put(generateUserID(), user);
    }

    private int generateUserID () {
        return userId++;
    }
}
