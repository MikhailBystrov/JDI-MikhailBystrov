package org.mytests.uiobjects.example.site.pages;

import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.JPage;
import ru.yandex.qatools.allure.annotations.Description;


@Description("Home page content")
@JPage(url = "/index.html", title = "Home Page")
public class HomePage extends CommonPage {
}
