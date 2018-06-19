package org.mytests.uiobjects.example.enums;

import ru.yandex.qatools.allure.annotations.Description;

/**
 * Created by Mikhail on 18.06.2018
 */

@Description("Buttons name of service menu")
public enum ServiceButtons {
    SUPPORT("Support"), DATES("Dates"), COMPLEX_TABLE("Complex Table "), SIMPLE_TABLE("Simple Table "),
    TABLE_WITH_PAGES("Table with pages"), DIFFERENT_ELEMENTS("Different elements");

    public String value;

    ServiceButtons(String value) {
        this.value = value;
    }
}
