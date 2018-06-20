package org.mytests.tests.example;

import org.testng.annotations.Test;
import ru.yandex.qatools.allure.annotations.Description;

import static org.mytests.uiobjects.example.entities.MetalsColorsData.INITIAL_DATA;
import static org.mytests.uiobjects.example.entities.MetalsColorsResult.RESULT_DATA;
import static org.mytests.uiobjects.example.entities.User.PITER_CHAILOVSKI;
import static org.mytests.uiobjects.example.enums.MenuButtons.METALS_AND_COLORS;
import static org.mytests.uiobjects.example.site.JDIExampleSite.homePage;
import static org.mytests.uiobjects.example.site.JDIExampleSite.login;
import static org.mytests.uiobjects.example.site.JDIExampleSite.metalsColorsPage;

@Description("Checking 'metals & colors' page elements")
public class SimpleTest extends SimpleTestsInit {

    @Test
    public void loginTest() {
        //Open home page
        homePage.open();
        //1. Login on JDI site as User
        login(PITER_CHAILOVSKI);

        //2. Open Metals & Colors page by Header menu
        homePage.headerSection.selectHeaderMenu(METALS_AND_COLORS);

        //3. Fill form Metals & Colors by data below:
        //  Summary: 3, 8
        //  Elements: Water, Fire
        //  Colors: Red
        //  Metals: Selen
        //  Vegetables: Cucumber,Tomato
        metalsColorsPage.submitForms(INITIAL_DATA);

        //4. Result section contains certain data
        //  Summary: 11
        //  Elements: Water, Fire
        //  Color: Red
        //  Metal: Selen
        //  Vegetables: Cucumber, Tomato
        metalsColorsPage.resultSection.checkResultLines(RESULT_DATA);
    }
}
