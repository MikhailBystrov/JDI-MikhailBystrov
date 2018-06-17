package org.mytests.uiobjects.example.enums;

import ru.yandex.qatools.allure.annotations.Description;

/**
 * Created by Mikhail on 16.06.2018
 */
@Description("Metals list from dropdown on 'Metals and Colors' page")
public enum Metals {
    METALS("Metals"), GOLD("Gold"), SILVER("Silver"), BRONZE("Bronze"), SELEN("Selen");

    public String value;

    Metals(String text) {
        this.value = text;
    }
}
