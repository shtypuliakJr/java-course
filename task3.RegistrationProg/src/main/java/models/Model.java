package models;

import user.User;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Arthur Shtypuliak
 * @version 1.2
 * @see User
 * @since 1.0
 * UserModel is used as model part of program, which contains all users and process them
 */
public class Model {

    private int userId = 0;

    protected Map<Integer, User> usersList;

    public void addUser(User user) {

        usersList.put(generateUserID(), user);
    }

    private int generateUserID() {
        return userId++;
    }

    public void createUserList() {
        this.usersList = new HashMap<>();
    }
}
