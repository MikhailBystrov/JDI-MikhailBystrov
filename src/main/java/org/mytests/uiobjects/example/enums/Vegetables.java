package org.mytests.uiobjects.example.enums;

import ru.yandex.qatools.allure.annotations.Description;

/**
 * Created by Mikhail on 17.06.2018
 */
@Description("Vegetables from checklist on 'Metals and Colors' page")
public enum Vegetables {
    CUCUMBER("Cucumber"),
    TOMATO("Tomato"),
    DEFAULT_VEGETABLE("Vegetables"),
    ONION("Onion");

    public String value;

    Vegetables(String text) {
        this.value = text;
    }
}
