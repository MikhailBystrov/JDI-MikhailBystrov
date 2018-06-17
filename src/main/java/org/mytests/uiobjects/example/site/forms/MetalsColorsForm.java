package org.mytests.uiobjects.example.site.forms;

import com.epam.jdi.uitests.web.selenium.elements.common.Button;
import com.epam.jdi.uitests.web.selenium.elements.common.TextField;
import com.epam.jdi.uitests.web.selenium.elements.complex.CheckList;
import com.epam.jdi.uitests.web.selenium.elements.complex.Dropdown;
import com.epam.jdi.uitests.web.selenium.elements.composite.Form;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.JFindBy;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.objects.JDropdown;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.simple.Css;
import org.mytests.uiobjects.example.enums.Nature;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.allure.annotations.Step;

import static org.mytests.uiobjects.example.enums.Colors.RED;
import static org.mytests.uiobjects.example.enums.Metals.SELEN;
import static org.mytests.uiobjects.example.enums.Nature.FIRE;
import static org.mytests.uiobjects.example.enums.Nature.WATER;
import static org.mytests.uiobjects.example.enums.Vegetables.CUCUMBER;
import static org.mytests.uiobjects.example.enums.Vegetables.DEFAULT_VEGETABLE;
import static org.mytests.uiobjects.example.enums.Vegetables.TOMATO;

/**
 * Created by Mikhail on 17.06.2018
 */
public class MetalsColorsForm extends Form {

    @Css(".vertical-group label")
    private CheckList<Nature> elements;

    @JDropdown(jroot = @JFindBy(css = ".colors"),
            jlist = @JFindBy(css = "li"),
            jvalue = @JFindBy(css = ".filter-option")
    )
    private Dropdown color;

    @FindBy(css = "[type='text']")
    private TextField metals;

    @FindBy(css = ".salad button")
    private Button vegetablesButton;

    @FindBy(css = ".salad label")
    private CheckList vegetables;

    @FindBy(css = "#submit-button")
    private Button submit;

    @Step("Submit entered data")
    public void submit() {
        elements.check(WATER.value, FIRE.value);
        color.select(RED.value);
        metals.setValue(SELEN.value);
        vegetablesButton.click();
        vegetables.select(DEFAULT_VEGETABLE.value, TOMATO.value, CUCUMBER.value);
        submit.click();
    }
}
