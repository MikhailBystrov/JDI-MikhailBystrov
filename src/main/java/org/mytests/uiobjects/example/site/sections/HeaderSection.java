package org.mytests.uiobjects.example.site.sections;

import com.epam.jdi.uitests.web.selenium.elements.common.Button;
import com.epam.jdi.uitests.web.selenium.elements.complex.Menu;
import com.epam.jdi.uitests.web.selenium.elements.composite.Section;
import org.mytests.uiobjects.example.entities.User;
import org.mytests.uiobjects.example.enums.MenuButtons;
import org.mytests.uiobjects.example.enums.ServiceButtons;
import org.mytests.uiobjects.example.site.forms.LoginForm;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.allure.annotations.Description;
import ru.yandex.qatools.allure.annotations.Step;

/**
 * Created by Mikhail on 17.06.2018
 */

@Description("Header section buttons and forms")
public class HeaderSection extends Section {

    @FindBy(css = ".form-horizontal")
    private LoginForm loginForm;

    @FindBy(css = ".profile-photo")
    private Button profilePhoto;

    @FindBy(css = ".dark-gray [href='metals-colors.html']")
    private Button metalsColors;

    @FindBy(css = ".m-l8>li")
    private Menu<MenuButtons> headerMenu;

    @FindBy(css = ".m-l8 .dropdown-menu a")
    private Menu<ServiceButtons> serviceHeaderMenu;



    @Step("Login at the site")
    public void login(User data) {
        profilePhoto.click();
        loginForm.loginAs(data);
    }

    @Step("Follow the link in the header menu")
    public void goToMetalsColors() {
        metalsColors.click();
    }

    @Step
    public void selectHeaderMenu(MenuButtons menuButtons) {
        headerMenu.select(menuButtons.value);
    }

    @Step
    public void selectServiceHeaderMenu (ServiceButtons serviceButtons) {
        if(headerMenu.isDisplayed(MenuButtons.SERVICE.value)) {
            serviceHeaderMenu.select(serviceButtons.value);
        }
    }
}
