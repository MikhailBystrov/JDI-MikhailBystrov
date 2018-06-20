package org.mytests.uiobjects.example.enums;

import ru.yandex.qatools.allure.annotations.Description;

/**
 * Created by Mikhail on 18.06.2018
 */
@Description("Buttons names from header menu")
public enum MenuButtons {
    HOME("Home"), CONTACT_FORM("Contact form"), SERVICE("Service"), METALS_AND_COLORS("Metals & Colors"),
    SUPPORT("Support"), DATES("Dates"), COMPLEX_TABLE("Complex Table "), SIMPLE_TABLE("Simple Table "),
    TABLE_WITH_PAGES("Table with pages"), DIFFERENT_ELEMENTS("Different elements");

    public String value;

    MenuButtons(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
