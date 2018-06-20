package org.mytests.uiobjects.example.site.pages;

import com.epam.jdi.uitests.web.selenium.elements.composite.WebPage;
import org.mytests.uiobjects.example.site.sections.HeaderSection;
import ru.yandex.qatools.allure.annotations.Description;

/**
 * Created by Mikhail on 17.06.2018
 */
@Description("Common for all the pages content")
public class CommonPage extends WebPage {
    public HeaderSection headerSection;
}
