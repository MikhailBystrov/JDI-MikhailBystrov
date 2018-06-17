package org.mytests.tests.example;

import org.testng.annotations.Test;
import ru.yandex.qatools.allure.annotations.Description;

import static org.mytests.uiobjects.example.site.JDIExampleSite.homePage;
import static org.mytests.uiobjects.example.site.JDIExampleSite.login;
import static org.mytests.uiobjects.example.site.JDIExampleSite.metalsColorsPage;

@Description("Checking 'metals & colors' page elements")
public class SimpleTest extends SimpleTestsInit {

    @Test
    public void loginTest() throws InterruptedException {
        //1. Login on JDI site as User
        login();

        //2. Open Metals & Colors page by Header menu
        homePage.headerSection.goToMetalsColors();

        //3. Fill form Metals & Colors by data below:
        //  Summary: 3, 8
        //  Elements: Water, Fire
        //  Colors: Red
        //  Metals: Selen
        //  Vegetables: Cucumber,Tomato
        metalsColorsPage.summaryResult();

        //4. Result section contains certain data
        //  Summary: 11
        //  Elements: Water, Fire
        //  Color: Red
        //  Metal: Selen
        //  Vegetables: Cucumber, Tomato
        metalsColorsPage.resultSection.checkResultLines();
    }
}
