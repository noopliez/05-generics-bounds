package ohm.softa.a05.model;

public class Flower extends Plant {
    private final PlantColor color;

    public Flower(double height, String family, String name, PlantColor color) {
        super(height, family, name);

        if (color.equals(PlantColor.GREEN))
            throw new IllegalArgumentException("Flowers are apparently not green");

        this.color = color;
    }

    @Override
    public PlantColor getColor() { return this.color; }

    @Override
    public int compareTo(Plant p) {
        return Double.compare(this.getHeight(), p.getHeight());
    }
}
