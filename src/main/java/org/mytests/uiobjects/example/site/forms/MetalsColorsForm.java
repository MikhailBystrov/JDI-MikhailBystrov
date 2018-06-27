package org.mytests.uiobjects.example.site.forms;

import com.epam.jdi.uitests.web.selenium.elements.common.Button;
import com.epam.jdi.uitests.web.selenium.elements.common.TextField;
import com.epam.jdi.uitests.web.selenium.elements.complex.CheckList;
import com.epam.jdi.uitests.web.selenium.elements.complex.Dropdown;
import com.epam.jdi.uitests.web.selenium.elements.composite.Form;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.JFindBy;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.objects.JDropdown;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.simple.Css;
import org.mytests.uiobjects.example.entities.MetalsColorsData;
import org.mytests.uiobjects.example.enums.Nature;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.allure.annotations.Description;
import ru.yandex.qatools.allure.annotations.Step;

import static org.mytests.uiobjects.example.enums.Vegetables.DEFAULT_VEGETABLE;

/**
 * Created by Mikhail on 17.06.2018
 */
// TODO
@Description("'Metals and colors' page form")
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

    // TODO
    @FindBy(css = ".salad button")
    private Button vegetablesButton;

    @FindBy(css = ".salad label")
    private CheckList vegetables;
    // !TODO

    @FindBy(css = "#submit-button")
    private Button submit;

    @SuppressWarnings("unchecked")
    @Step("Submit entered data")
    public void submit(MetalsColorsData data) {
        elements.check(data.getElements());
        color.select(data.getColor());
        metals.setValue(data.getMetals());
        // TODO
        vegetablesButton.click();
        vegetables.select(DEFAULT_VEGETABLE);
        vegetables.check(data.getVegetables());
        submit.click();
    }
}
