package org.mytests.tests.example;

import com.epam.jdi.uitests.web.selenium.elements.composite.WebSite;
import com.epam.jdi.uitests.web.testng.testRunner.TestNGBase;
import org.mytests.uiobjects.example.site.JDIExampleSite;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import static com.epam.jdi.uitests.core.settings.JDISettings.logger;

@SuppressWarnings("unchecked")
public class SimpleTestsInit extends TestNGBase {
    @BeforeClass(alwaysRun = true)
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebSite.init(JDIExampleSite.class);
        logger.info("Run Tests");
//        JDIFrameworkSite.indexPage.open();
    }
    @AfterMethod(alwaysRun = true)
    public void refreshPage() {
        JDIExampleSite.metalsColorsPage.headerSection.logout();
    }
}
