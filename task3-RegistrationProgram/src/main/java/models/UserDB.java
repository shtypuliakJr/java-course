package models;

public enum UserDB {

    USER_ONE("User1", "lollopop1"),
    USER_TWO("User2", "shtepa"),
    USER_THREE("User3", "User3_login");

    private final String name;
    private final String login;

    UserDB(String name, String login) {
        this.name = name;
        this.login = login;
    }

    public String getLogin() {
        return login;
    }
    public enum Request {;
        public static class Create {
            public static boolean checkLoginExist(String userLogin) {
                for (UserDB user : UserDB.values()) {
                    if (user.getLogin().equals(userLogin)) {
                        return true;
                    }
                }
                return false;
            }
        }
    }
}
