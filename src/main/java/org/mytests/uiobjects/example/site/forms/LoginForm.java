package org.mytests.uiobjects.example.site.forms;

import com.epam.jdi.uitests.web.selenium.elements.common.Button;
import com.epam.jdi.uitests.web.selenium.elements.common.TextField;
import com.epam.jdi.uitests.web.selenium.elements.composite.Form;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.simple.Css;
import org.mytests.uiobjects.example.entities.User;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.allure.annotations.Description;

@Description("Login form")
public class LoginForm extends Form<User> {

    @FindBy(id="Name")
    public TextField login;

    @FindBy(id="Password")
    public TextField password;

    @Css("[type=submit]")
    public Button enter;
}
