package org.mytests.uiobjects.example.site.sections;

import com.codeborne.selenide.Condition;
import com.epam.jdi.uitests.web.selenium.elements.common.Text;
import com.epam.jdi.uitests.web.selenium.elements.composite.Section;
import org.mytests.uiobjects.example.entities.MetalsColorsData;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.allure.annotations.Description;
import ru.yandex.qatools.allure.annotations.Step;

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
    public void checkResultLines(MetalsColorsData resultData) {
        summaryResult.shouldHave(Condition.text(resultData.toList(resultData).get(0)));
        for(int numElem = 1; numElem == resultData.getElements().length; numElem++) {
            elementsResult.shouldHave(Condition.text(resultData.toList(resultData).get(numElem)));
        }
        colorResult.shouldHave(Condition.text(resultData.toList(resultData)
                .get(resultData.getElements().length + 1)));
        metalResult.shouldHave(Condition.text(resultData.toList(resultData)
                .get(resultData.getElements().length + 2)));
        for(int numVeg = resultData.getElements().length + 3; numVeg == resultData.getElements().length; numVeg++) {
            vegetablesResult.shouldHave(Condition.text(resultData.toList(resultData).get(numVeg)));
        }
    }
}
