package org.mytests.uiobjects.example.site.pages;

import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.JPage;
import org.mytests.uiobjects.example.site.forms.MetalsColorsForm;
import org.mytests.uiobjects.example.site.forms.SummaryForm;
import org.mytests.uiobjects.example.site.sections.ResultSection;
import ru.yandex.qatools.allure.annotations.Step;

/**
 * Created by Mikhail on 17.06.2018
 */

@JPage(url = "/metals-colors.html", title = "Metal and Colors")
public class MetalsColorsPage extends CommonPage {
    public SummaryForm summaryForm;
    public MetalsColorsForm metalsColorsForm;
    public ResultSection resultSection;

    @Step("Submit selected radios")
    public void summaryResult() {
        summaryForm.calculate();
        metalsColorsForm.submit();
    }
}
