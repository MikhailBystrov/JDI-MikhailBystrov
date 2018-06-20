package org.mytests.uiobjects.example.entities;

import lombok.AllArgsConstructor;
import ru.yandex.qatools.allure.annotations.Description;

@AllArgsConstructor
@SuppressWarnings("ALL")
@Description("User data")
public class User {
    public static User PITER_CHAILOVSKI = new User ("epam", "1234", "PITER_CHAILOVSKI");

    public String name;
    public String password;
    private String fullName;

}
