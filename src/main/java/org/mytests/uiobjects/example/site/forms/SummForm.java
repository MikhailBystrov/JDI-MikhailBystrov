package org.mytests.uiobjects.example.site.forms;

import com.epam.jdi.uitests.core.interfaces.common.IButton;
import com.epam.jdi.uitests.web.selenium.elements.complex.RadioButtons;
import com.epam.jdi.uitests.web.selenium.elements.composite.Form;
import org.mytests.uiobjects.example.entities.MetalsColorsData;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.allure.annotations.Description;
import ru.yandex.qatools.allure.annotations.Step;

/**
 * Created by Mikhail on 17.06.2018
 */
@SuppressWarnings("unchecked")
@Description("'Metals and colors' page summary form")
public class SummForm extends Form<MetalsColorsData> {
    @FindBy(css = "#odds-selector p")
    private RadioButtons odds;

    @FindBy(css = "#even-selector p")
    private RadioButtons even;

    @FindBy(css = "#setNumbers-button")
    private IButton calculate;

    // TODO nope, that's wrong.
    // TODO 1. this form should not get the whole data set, actually
    // TODO 2. this method do not "calculate" anything
    @Step("Submit selected radios")
    public void setNumbers(MetalsColorsData data) {
        odds.select(data.getOdds());
        even.select(data.getEven());
    }
}
