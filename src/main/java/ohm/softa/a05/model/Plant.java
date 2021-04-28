package ohm.softa.a05.model;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public abstract class Plant implements Comparable<Plant> {

    public Plant(double height, String family, String name) {
        this.height = height;
        this.family = family;
        this.name = name;
    }

    private final double height;
    private final String family;
    private final String name;

    public double getHeight() {
        return height;
    }

    public String getFamily() {
        return family;
    }

    public String getName() {
        return name;
    }

    public abstract PlantColor getColor();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        Plant plant = (Plant) o;

        return new EqualsBuilder()
                .append(height, plant.height)
                .append(family, plant.family)
                .append(name, plant.name)
                .append(this.getColor(), plant.getColor()).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(height)
                .append(family)
                .append(name)
                .append(this.getColor()).toHashCode();
    }

    @Override
    public String toString() {
        return "Plant{" +
                "height=" + height +
                ", family='" + family + '\'' +
                ", name='" + name + '\'' +
                ", color=" + this.getColor() +
                '}';
    }
}
