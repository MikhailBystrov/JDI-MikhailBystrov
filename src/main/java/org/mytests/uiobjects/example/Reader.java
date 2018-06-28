package org.mytests.uiobjects.example;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import org.mytests.uiobjects.example.entities.MetalsColorsData;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Map;

/**
 * Created by Mikhail on 25.06.2018
 */
public class Reader {
    // TODO what if the reason of this field ? Local variable is not enough ?
    private static File file = new File("src\\test\\resources\\JDI_ex8_metalsColorsDataSet.json");

    public static Map<String, MetalsColorsData> readFile() {
        Map<String, MetalsColorsData> dataMap = null;
        try (JsonReader jsonReader = new JsonReader(new FileReader(file))) {
            Type token = new TypeToken<Map<String, MetalsColorsData>>() {{
            }}.getType();
            dataMap = new Gson().fromJson(jsonReader, token);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return dataMap;
    }
}
