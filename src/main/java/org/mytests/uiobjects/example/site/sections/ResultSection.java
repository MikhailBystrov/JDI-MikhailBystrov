package org.mytests.uiobjects.example.site.sections;

import com.codeborne.selenide.Condition;
import com.epam.jdi.uitests.web.selenium.elements.common.Text;
import com.epam.jdi.uitests.web.selenium.elements.composite.Section;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.allure.annotations.Step;

import static org.mytests.uiobjects.example.enums.Colors.RED;
import static org.mytests.uiobjects.example.enums.Even.EIGHT;
import static org.mytests.uiobjects.example.enums.Metals.SELEN;
import static org.mytests.uiobjects.example.enums.Nature.FIRE;
import static org.mytests.uiobjects.example.enums.Nature.WATER;
import static org.mytests.uiobjects.example.enums.Odds.THREE;
import static org.mytests.uiobjects.example.enums.Vegetables.CUCUMBER;
import static org.mytests.uiobjects.example.enums.Vegetables.TOMATO;

/**
 * Created by Mikhail on 17.06.2018
 */
public class ResultSection extends Section {

    @FindBy(css = ".results .summ-res")
    public Text summaryResult;

    @FindBy(css = ".results .elem-res")
    public Text elementsResult;

    @FindBy(css = ".results .col-res")
    public Text colorResult;

    @FindBy(css = ".results .met-res")
    public Text metalResult;

    @FindBy(css = ".results .sal-res")
    public Text vegetablesResult;

    @Step
    public void checkResultLines() {
        summaryResult.shouldHave(Condition.text("Summary: " + (THREE.digitValue + EIGHT.digitValue)));
        elementsResult.shouldHave(Condition.text("Elements: " + WATER.value + ", " + FIRE.value));
        colorResult.shouldHave(Condition.text("Color: " + RED.value));
        metalResult.shouldHave(Condition.text("Metal: " + SELEN.value));
        vegetablesResult.shouldHave(Condition.text("Vegetables: " + CUCUMBER.value + ", " + TOMATO.value));
    }
}
