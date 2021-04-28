package ohm.softa.a05;

import ohm.softa.a05.collections.SimpleList;
import ohm.softa.a05.collections.SimpleListImpl;
import ohm.softa.a05.model.Plant;
import ohm.softa.a05.model.PlantColor;

public class PlantBed<T extends Plant> {
    private final SimpleList<T> plants;

    public PlantBed() {
        plants = new SimpleListImpl<>();
    }

    public void add(T plant) {
        plants.add(plant);
    }

    public int size() {
        return plants.size();
    }

    public SimpleList<T> getPlantsByColor(PlantColor color) {
        return plants.filter(p -> p.getColor().equals(color));
    }

    public SimpleList<T> getPlants() {
        return plants;
    }
}
