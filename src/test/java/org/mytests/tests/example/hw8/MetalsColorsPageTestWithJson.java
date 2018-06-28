package org.mytests.tests.example.hw8;

import org.mytests.tests.example.SimpleTestsInit;
import org.mytests.uiobjects.example.Reader;
import org.mytests.uiobjects.example.entities.MetalsColorsData;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Map;

import static org.mytests.uiobjects.example.entities.User.PITER_CHAILOVSKI;
import static org.mytests.uiobjects.example.enums.MenuButtons.METALS_AND_COLORS;
import static org.mytests.uiobjects.example.site.JDIExampleSite.*;

/**
 * Created by Mikhail on 23.06.2018
 */
// TODO in a real project, you should not push comments like this...
public class MetalsColorsPageTestWithJson extends SimpleTestsInit {

    @DataProvider(name = "provider")
    public Object[] getDataFromJsonFile() {
        Map<String, MetalsColorsData> dataMap = Reader.readFile();
        return dataMap.values().toArray();
    }

    @Test(dataProvider = "provider")
    public void loginTest(MetalsColorsData metalsColorsData) {
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
        metalsColorsPage.submitForms(metalsColorsData);

        //4. Result section contains certain data
        //  Summary: 11
        //  Elements: Water, Fire
        //  Color: Red
        //  Metal: Selen
        //  Vegetables: Cucumber, Tomato
        metalsColorsPage.resultSection.checkResultLines(metalsColorsData);
    }
}
