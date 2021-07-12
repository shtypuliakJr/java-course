package models;

import models.exceptions.LoginExistException;
import models.user.User;


/**
 * @author Arthur Shtypuliak
 * @version 1.2
 * @see User
 * @since 1.0
 * UserModel is used as model part of program, which contains all users and process them
 */
public class Model {
    public boolean addUser(User user) {

        if (!checkLoginExistInDB(user.getLogin())) {
            // add user
            return true;

        }
        throw new LoginExistException();
    }

    public boolean checkLoginExistInDB(String login) {
        return UserDB.Request.checkLoginExist(login);
    }
}
