package org.mytests.uiobjects.example.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import ru.yandex.qatools.allure.annotations.Description;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

    public static MetalsColorsData INITIAL_DATA = new MetalsColorsData(
            new int[]{3, 8},
            new java.lang.String[]{WATER.value, FIRE.value},
            RED.value,
            SELEN.value,
            new java.lang.String[]{CUCUMBER.value, TOMATO.value});

    public int[] summary;
    @Getter
    public String[] elements;
    @Getter
    public String color;
    @Getter
    public String metals;
    @Getter
    public String[] vegetables;

    public String getOdds() {
        return String.valueOf(summary[0]);
    }

    public String getEven() {
        return String.valueOf(summary[1]);
    }

    public String getSumm(MetalsColorsData metalsColorsData) {
        return String.valueOf(metalsColorsData.summary[0] + metalsColorsData.summary[1]);
    }

    public List<String> toList(MetalsColorsData metalsColorsData) {
        List<String> list = new ArrayList<>();
        list.add(getSumm(metalsColorsData));
        list.addAll(Arrays.asList(elements));
        list.add(color);
        list.add(metals);
        list.addAll(Arrays.asList(vegetables));
        return list;
    }
    @Override
    public String toString() {
        return "summary: " + Arrays.toString(summary) +
                ", elements: " + Arrays.toString(elements)
                + ", color: " + color
                + ", metals: " + metals
                + ", vegetables: " + Arrays.toString(vegetables)
                + '}';
    }
}
