package org.mytests.uiobjects.example.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.mytests.uiobjects.example.enums.Colors;
import org.mytests.uiobjects.example.enums.Metals;
import org.mytests.uiobjects.example.enums.Nature;
import org.mytests.uiobjects.example.enums.Vegetables;
import ru.yandex.qatools.allure.annotations.Description;

import static org.mytests.uiobjects.example.enums.Colors.RED;
import static org.mytests.uiobjects.example.enums.Metals.SELEN;
import static org.mytests.uiobjects.example.enums.Nature.FIRE;
import static org.mytests.uiobjects.example.enums.Nature.WATER;
import static org.mytests.uiobjects.example.enums.Vegetables.CUCUMBER;
import static org.mytests.uiobjects.example.enums.Vegetables.TOMATO;



/**
 * Created by Mikhail on 19.06.2018
 */
@AllArgsConstructor
@NoArgsConstructor
@SuppressWarnings("WeakerAccess")
@Description("Data for fill 'metals and colors' page form")
public class MetalsColorsData {
    public static MetalsColorsData INITIAL_DATA = new MetalsColorsData(new int[]{3, 8}, new Nature[]{WATER, FIRE}
            , RED, SELEN, new Vegetables[]{CUCUMBER, TOMATO});

    private int[] numbers;
    @Getter
    private Nature[] elements;
    @Getter
    private Colors color;
    @Getter
    private Metals metal;
    @Getter
    private Vegetables[] vegetables;

    public String getOdds() {
        return String.valueOf(numbers[0]);
    }

    public String getEven() {
        return String.valueOf(numbers[1]);
    }

    @Override
    public String toString() {
        return "summary: " + numbers +
                ", elements: " + elements
                + ", color: " + color
                + ", metals: " + metal
                + ", vegetables: " + vegetables
                + '}';
    }
}
