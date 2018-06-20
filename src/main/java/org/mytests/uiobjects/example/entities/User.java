package org.mytests.uiobjects.example.entities;

import com.epam.commons.DataClass;
import ru.yandex.qatools.allure.annotations.Description;

@SuppressWarnings("ALL")
@Description("User data")
public class User extends DataClass {
    public static User piterChailovski = new User ("epam", "1234", "PITER_CHAILOVSKI");
    public String login;
    public String password;
    public String name;

    public User(String login, String password, String name) {
        this.login = login;
        this.password = password;
        this.name = name;
    }
}
