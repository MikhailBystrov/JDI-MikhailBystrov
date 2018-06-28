package org.mytests.uiobjects.example.site.pages;

import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.JPage;
import org.mytests.uiobjects.example.entities.MetalsColorsData;
import org.mytests.uiobjects.example.site.forms.MetalsColorsForm;
import org.mytests.uiobjects.example.site.sections.ResultSection;
import ru.yandex.qatools.allure.annotations.Description;
import ru.yandex.qatools.allure.annotations.Step;

/**
 * Created by Mikhail on 17.06.2018
 */


@SuppressWarnings("WeakerAccess")
@Description("'Metals and colors' page content")
@JPage(url = "/metals-colors.html", title = "Metal and Colors")
public class MetalsColorsPage extends CommonPage {
    public MetalsColorsForm metalsColorsForm;
    public ResultSection resultSection;

    @Step("Submit selected radios")
    public void submitForms(MetalsColorsData data) {
        // TODO move sum form to metalsColorsForm
        metalsColorsForm.submit(data);
    }
}
