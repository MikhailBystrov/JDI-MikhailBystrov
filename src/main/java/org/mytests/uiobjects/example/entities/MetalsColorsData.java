package org.mytests.uiobjects.example.entities;

import lombok.Getter;
import ru.yandex.qatools.allure.annotations.Description;

import java.util.Arrays;

import static org.mytests.uiobjects.example.enums.Colors.RED;
import static org.mytests.uiobjects.example.enums.Metals.SELEN;
import static org.mytests.uiobjects.example.enums.Nature.FIRE;
import static org.mytests.uiobjects.example.enums.Nature.WATER;
import static org.mytests.uiobjects.example.enums.Vegetables.CUCUMBER;
import static org.mytests.uiobjects.example.enums.Vegetables.TOMATO;


/**
 * Created by Mikhail on 19.06.2018
 */
@SuppressWarnings("WeakerAccess")
@Description("Data for fill 'metals and colors' page form")
public class MetalsColorsData {

    public int[] summary;
    @Getter
    public String[] elements;
    public String color;
    @Getter
    public String metals;
    @Getter
    public String[] vegetables;

    public static MetalsColorsData INITIAL_DATA = new MetalsColorsData(
            new int[]{3, 8},
            new java.lang.String[]{WATER.value, FIRE.value},
            RED.value,
            SELEN.value,
            new java.lang.String[]{CUCUMBER.value, TOMATO.value});

    private MetalsColorsData(int[] summary,
                             String[] elements,
                             String color,
                             String metals,
                             String[] vegetables) {
        this.summary = summary;
        this.elements = elements;
        this.color = color;
        this.metals = metals;
        this.vegetables = vegetables;
    }


    public String getOdds() {
        if (summary.length != 0) {
            return String.valueOf(summary[0]);
        } else {
            return "1";
        }
    }

    public String getEven() {
        if (summary.length != 0) {
            return String.valueOf(summary[1]);
        } else {
            return "2";
        }
    }

    public String getColor() {
        if(!color.equals("")) {
            return color;
        } else {
            return "Colors";
        }
    }

    public String getSumm(MetalsColorsData metalsColorsData) {
        if (summary.length != 0) {
            return String.valueOf(metalsColorsData.summary[0] + metalsColorsData.summary[1]);
        } else {
            return "3";
        }
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
