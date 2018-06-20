package org.mytests.uiobjects.example.enums;

import ru.yandex.qatools.allure.annotations.Description;

/**
 * Created by Mikhail on 16.06.2018
 */
@Description("Elements from checklist on 'Metals and Colors' page")
public enum Nature {
    WATER("Water"), EARTH("Earth"), WIND("Wind"), FIRE("Fire");

    public String value;

    Nature(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
