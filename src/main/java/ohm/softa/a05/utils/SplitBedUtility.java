package ohm.softa.a05.utils;

import ohm.softa.a05.PlantBed;
import ohm.softa.a05.collections.SimpleList;
import ohm.softa.a05.model.Plant;
import ohm.softa.a05.model.PlantColor;

import java.util.HashMap;
import java.util.Map;

public abstract class SplitBedUtility {
    private SplitBedUtility() { }

    public static  <T extends Plant> Map<PlantColor, SimpleList<T>> splitBedByColor(PlantBed<T> bed) {
        Map<PlantColor, SimpleList<T>> map = new HashMap<>();

        for (PlantColor c : PlantColor.values()) {
            map.put(c, bed.getPlantsByColor(c));
        }

        return map;
    }
}
