package org.mytests.uiobjects.example.site.sections;

import com.codeborne.selenide.Condition;
import com.epam.jdi.uitests.web.selenium.elements.common.Text;
import com.epam.jdi.uitests.web.selenium.elements.composite.Section;
import org.mytests.uiobjects.example.entities.MetalsColorsData;
import org.mytests.uiobjects.example.entities.MetalsColorsResult;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.allure.annotations.Description;
import ru.yandex.qatools.allure.annotations.Step;

import java.util.Formatter;

/**
 * Created by Mikhail on 17.06.2018
 */

@Description("Results of 'metals and colors' page section")
public class ResultSection extends Section {

    @FindBy(css = ".summ-res")
    private Text summaryResult;

    @FindBy(css = ".elem-res")
    private Text elementsResult;

    @FindBy(css = ".col-res")
    private Text colorResult;

    @FindBy(css = ".met-res")
    private Text metalResult;

    @FindBy(css = ".sal-res")
    private Text vegetablesResult;

    @Step
    public void checkResultLines(MetalsColorsResult resultData) {
        summaryResult.shouldHave(Condition.text("Summary: " + resultData.getSummary()));
        elementsResult.shouldHave(Condition.text(String.format("Elements: %s, %s",
                resultData.getElements()[0],
                resultData.getElements()[1])));
        colorResult.shouldHave(Condition.text("Color: " + resultData.getColor()));
        metalResult.shouldHave(Condition.text("Metal: " + resultData.getMetal()));
        vegetablesResult.shouldHave(Condition.text(String.format("Vegetables: %s, %s",
                resultData.getVegetables()[0],
                resultData.getVegetables()[1])));
    }

    @Step
    public void checkResultLinesJson(MetalsColorsData resultData) {
        summaryResult.shouldHave(Condition.text("Summary: " + resultData.getSumm(resultData)));
        switch (resultData.getElements().length) {
            case 1:
                elementsResult.shouldHave(Condition.text(String.format("Elements: %s",
                        resultData.getElements()[0])));
                break;
            case 2:
                elementsResult.shouldHave(Condition.text(String.format("Elements: %s, %s",
                        resultData.getElements()[0],
                        resultData.getElements()[1])));
                break;
            case 3:
                elementsResult.shouldHave(Condition.text(String.format("Elements: %s, %s, %s",
                        resultData.getElements()[0],
                        resultData.getElements()[1],
                        resultData.getElements()[2])));
                break;
            case 4:
                elementsResult.shouldHave(Condition.text(String.format("Elements: %s, %s, %s, %s",
                        resultData.getElements()[0],
                        resultData.getElements()[1],
                        resultData.getElements()[2],
                        resultData.getElements()[3])));
                break;
            default:
                break;
        }
        if(!resultData.getColor().equals("")) {
            colorResult.shouldHave(Condition.text("Color: " + resultData.getColor()));
        } else {
            colorResult.shouldHave(Condition.text("Color: Colors"));
        }
        if(!resultData.getMetals().equals("")) {
            metalResult.shouldHave(Condition.text("Metal: " + resultData.getMetals()));
        }
        switch (resultData.getVegetables().length) {
            case 1:
                vegetablesResult.shouldHave(Condition.text(String.format("Vegetables: %s",
                        resultData.getVegetables()[0])));
                break;
            case 2:
                vegetablesResult.shouldHave(Condition.text(String.format("Vegetables: %s, %s",
                        resultData.getVegetables()[0],
                        resultData.getVegetables()[1])));
                break;
            case 3:
                vegetablesResult.shouldHave(Condition.text(String.format("Vegetables: %s, %s, %s",
                        resultData.getVegetables()[0],
                        resultData.getVegetables()[1],
                        resultData.getVegetables()[2])));
                break;
            case 4:
                vegetablesResult.shouldHave(Condition.text(String.format("Vegetables: %s, %s, %s, %s",
                        resultData.getVegetables()[0],
                        resultData.getVegetables()[1],
                        resultData.getVegetables()[2],
                        resultData.getVegetables()[3])));
                break;
            default:
                vegetablesResult.shouldHave(Condition.text("Vegetables:"));
                break;
        }
    }
}
