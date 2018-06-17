package org.mytests.uiobjects.example.entities;

import com.epam.commons.DataClass;
import ru.yandex.qatools.allure.annotations.Description;

@Description("User 'PITER CHAILOVSKI' data")
public class User extends DataClass {
    public String login = "epam";
    public String password = "1234";
}
