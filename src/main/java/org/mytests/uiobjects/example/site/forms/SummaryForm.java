package org.mytests.uiobjects.example.site.forms;

import com.epam.jdi.uitests.core.interfaces.common.IButton;
import com.epam.jdi.uitests.web.selenium.elements.complex.RadioButtons;
import com.epam.jdi.uitests.web.selenium.elements.composite.Form;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.allure.annotations.Step;

import static org.mytests.uiobjects.example.enums.Even.EIGHT;
import static org.mytests.uiobjects.example.enums.Odds.THREE;

/**
 * Created by Mikhail on 17.06.2018
 */
public class SummaryForm extends Form {
    @FindBy(css = "#odds-selector p")
    private RadioButtons odds;

    @FindBy(css = "#even-selector p")
    private RadioButtons even;

    @FindBy(css = "#calculate-button")
    private IButton calculate;

    @Step("Submit selected radios")
    public void calculate() {
        odds.select(THREE.value);
        even.select(EIGHT.value);
        calculate.click();
    }
}
