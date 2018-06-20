package org.mytests.uiobjects.example.enums;

import ru.yandex.qatools.allure.annotations.Description;

/**
 * Created by Mikhail on 16.06.2018
 */
@Description("Colors from dropdown on 'Metals and Colors' page")
public enum Colors {
    COLORS("Colors"), RED("Red"), GREEN("Green"), BLUE("Blue"), YELLOW("Yellow");

    public String value;

    Colors(String text) {
        this.value = text;
    }

    @Override
    public String toString() {
        return value;
    }
}
