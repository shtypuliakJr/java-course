package models;

import models.exception.LoginExistException;
import models.user.User;


/**
 * @author Arthur Shtypuliak
 * @version 1.2
 * @see User
 * @since 1.0
 * UserModel is used as model part of program, which contains all users and process them
 */
public class Model {
    public boolean addUser(User user) throws LoginExistException {
        if (checkUserLoginInDB(user)) {
            return true;
        }
        throw new LoginExistException();
    }

    public boolean checkUserLoginInDB(User user) throws LoginExistException {

        if (checkLoginIsNotExist(user.getLogin())) {
            // add user

            return true;
        }

        throw new LoginExistException();
    }

    public static boolean checkLoginIsNotExist(String loginData) {
        for (UserDB user : UserDB.values()) {
            if (user.getLogin().equals(loginData)) {
                return false;
            }
        }
        return true;
    }
}
