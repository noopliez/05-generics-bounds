package ohm.softa.a05.model;

public class Shrub extends Plant {
    private final PlantColor color;

    public Shrub(double height, String family, String name, PlantColor color) {
        super(height, family, name);

        if (!color.equals(PlantColor.GREEN))
            throw new IllegalArgumentException("Shrubs are always green");

        this.color = color;
    }

    @Override
    public PlantColor getColor() {
        return this.color;
    }

    @Override
    public int compareTo(Plant p) {
        return Double.compare(this.getHeight(), p.getHeight());
    }
}
