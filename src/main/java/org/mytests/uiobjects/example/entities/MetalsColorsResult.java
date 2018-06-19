package org.mytests.uiobjects.example.entities;

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
@SuppressWarnings("WeakerAccess")
@Description("Results of 'metals and colors' page form submit")
public class MetalsColorsResult {
    private int summary;
    private Nature[] elements;
    private Colors color;
    private Metals metal;
    private Vegetables[] vegetables;

    public static MetalsColorsResult RESULT_DATA = new MetalsColorsResult(11, new Nature[]{WATER, FIRE}
            , RED, SELEN, new Vegetables[]{CUCUMBER, TOMATO});

    public MetalsColorsResult(int summary, Nature[] elements, Colors color, Metals metal
            , Vegetables[] vegetables) {
        this.summary = summary;
        this.elements = elements;
        this.color = color;
        this.metal = metal;
        this.vegetables = vegetables;
    }

    public int getSummary() {
        return summary;
    }

    public Nature[] getElements() {
        return elements;
    }

    public Colors getColor() {
        return color;
    }

    public Metals getMetal() {
        return metal;
    }

    public Vegetables[] getVegetables() {
        return vegetables;
    }
}
