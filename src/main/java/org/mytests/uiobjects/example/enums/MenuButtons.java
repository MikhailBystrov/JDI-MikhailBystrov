package org.mytests.uiobjects.example.enums;

import ru.yandex.qatools.allure.annotations.Description;

/**
 * Created by Mikhail on 18.06.2018
 */
@Description("Buttons names from header menu")
public enum MenuButtons {
    HOME("Home"), CONTACT_FORM("Contact form"), SERVICE("Service"), METALS_AND_COLORS("Metals & Colors");

    public String value;

    MenuButtons(String value) {
        this.value = value;
    }
}
