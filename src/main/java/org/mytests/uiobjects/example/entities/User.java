package org.mytests.uiobjects.example.entities;

import com.epam.commons.DataClass;
import ru.yandex.qatools.allure.annotations.Description;

// TODO Quite good  Description, but
// TODO 1. where is user name ?
// TODO 2. Any user can be represented by this class, not only PITER CHAILOVSKI...
@Description("User 'PITER CHAILOVSKI' data")
public class User extends DataClass {
    public String login = "epam";
    public String password = "1234";
}
