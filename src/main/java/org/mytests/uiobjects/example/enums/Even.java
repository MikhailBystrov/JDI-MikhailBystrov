package org.mytests.uiobjects.example.enums;

import ru.yandex.qatools.allure.annotations.Description;

/**
 * Created by Mikhail on 17.06.2018
 */
@Description("Even numbers from radios on 'Metals and Colors' page")
public enum Even {
    TWO("2", 2), FOUR("4", 4), SIX("6", 6), EIGHT("8", 8);

    public String value;
    public int digitValue;

    Even(String value, int digitValue) {
        this.value = value;
        this.digitValue = digitValue;
    }
}
