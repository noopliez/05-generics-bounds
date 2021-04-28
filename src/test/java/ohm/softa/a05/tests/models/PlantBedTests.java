package ohm.softa.a05.tests.models;

import ohm.softa.a05.PlantBed;
import ohm.softa.a05.collections.SimpleList;
import ohm.softa.a05.model.Flower;
import ohm.softa.a05.model.Plant;
import ohm.softa.a05.model.PlantColor;
import ohm.softa.a05.model.Shrub;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PlantBedTests {
    private final Logger logger = LogManager.getLogger();
    private PlantBed<Plant> testPlantBed;

    @BeforeEach
    public void setup() {
        testPlantBed = new PlantBed<>();

        testPlantBed.add(new Flower(4.3, "blubb", "bla", PlantColor.BLUE));
        testPlantBed.add(new Flower(4.1, "blibb", "bli", PlantColor.RED));
        testPlantBed.add(new Flower(3.9, "blobb", "blo", PlantColor.YELLOW));
        testPlantBed.add(new Shrub(4.9, "shrubb", "shru", PlantColor.GREEN));
        testPlantBed.add(new Shrub(5.3, "shribb", "shri", PlantColor.GREEN));
        testPlantBed.add(new Shrub(2.3, "shrabb", "shra", PlantColor.GREEN));
    }

    @Test
    public void testSize() {
        logger.info("Testing size func of TestBed");
        int ctr = 0;

        for (Plant p : testPlantBed.getPlants()) {
            ctr++;
        }

        assertEquals(ctr, testPlantBed.size());
    }

    @Test
    public void testGetPlantsByColor() {
        logger.info("Testing if colors are returned by color if filtered");
        for (Plant p : testPlantBed.getPlantsByColor(PlantColor.GREEN)) {
            assertEquals(p.getColor(), PlantColor.GREEN);
        }
    }
}
