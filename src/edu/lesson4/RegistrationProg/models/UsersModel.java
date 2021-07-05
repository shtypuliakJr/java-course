package edu.lesson4.RegistrationProg.models;

import edu.lesson4.RegistrationProg.user.User;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Arthur Shtypuliak
 * @version 1.1
 * @see User
 * @since 1.0
 * UserModel is used as model part of program, which contains all users and process them
 */
public class UsersModel {

    private static int userId = 0;

    protected Map<Integer, User> usersList = new HashMap<>();

    public void addUser(User user) {
        this.usersList.put(generateUserID(), user);
    }

    private int generateUserID() {
        return userId++;
    }
}
