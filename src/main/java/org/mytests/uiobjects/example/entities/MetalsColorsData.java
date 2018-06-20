package org.mytests.uiobjects.example.entities;

import org.mytests.uiobjects.example.enums.Colors;
import org.mytests.uiobjects.example.enums.Even;
import org.mytests.uiobjects.example.enums.Metals;
import org.mytests.uiobjects.example.enums.Nature;
import org.mytests.uiobjects.example.enums.Odds;
import org.mytests.uiobjects.example.enums.Vegetables;
import ru.yandex.qatools.allure.annotations.Description;

import static org.mytests.uiobjects.example.enums.Colors.RED;
import static org.mytests.uiobjects.example.enums.Even.EIGHT;
import static org.mytests.uiobjects.example.enums.Metals.SELEN;
import static org.mytests.uiobjects.example.enums.Nature.FIRE;
import static org.mytests.uiobjects.example.enums.Nature.WATER;
import static org.mytests.uiobjects.example.enums.Odds.THREE;
import static org.mytests.uiobjects.example.enums.Vegetables.CUCUMBER;
import static org.mytests.uiobjects.example.enums.Vegetables.TOMATO;

/**
 * Created by Mikhail on 19.06.2018
 */
@SuppressWarnings("WeakerAccess")
@Description("Data for fill 'metals and colors' page form")
public class MetalsColorsData {
    public static MetalsColorsData INITIAL_DATA = new MetalsColorsData(THREE, EIGHT, new Nature[]{WATER, FIRE}
            , RED, SELEN, new Vegetables[]{CUCUMBER, TOMATO});
    private Odds odds;
    private Even even;
    private Nature[] elements;
    private Colors color;
    private Metals metal;
    private Vegetables[] vegetables;

    public MetalsColorsData(Odds odds, Even even, Nature[] elements, Colors color, Metals metal
            , Vegetables[] vegetables) {
        this.odds = odds;
        this.even = even;
        this.elements = elements;
        this.color = color;
        this.metal = metal;
        this.vegetables = vegetables;
    }

    public Odds getOdds() {
        return odds;
    }

    public Even getEven() {
        return even;
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
