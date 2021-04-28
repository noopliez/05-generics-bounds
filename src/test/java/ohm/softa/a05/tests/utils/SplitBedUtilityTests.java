package ohm.softa.a05.tests.utils;

import ohm.softa.a05.PlantBed;
import ohm.softa.a05.collections.SimpleList;
import ohm.softa.a05.model.Flower;
import ohm.softa.a05.model.Plant;
import ohm.softa.a05.model.PlantColor;
import ohm.softa.a05.model.Shrub;
import ohm.softa.a05.utils.SplitBedUtility;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

public class SplitBedUtilityTests {
    private final Logger logger = LogManager.getLogger();
    private SplitBedUtility testUtility;
    private PlantBed<Plant> testBed;

    @BeforeEach
    public void setup() {
        testBed = new PlantBed<>();

        testBed.add(new Flower(4.3, "blubb", "bla", PlantColor.BLUE));
        testBed.add(new Flower(4.1, "blibb", "bli", PlantColor.RED));
        testBed.add(new Flower(3.9, "blobb", "blo", PlantColor.YELLOW));
        testBed.add(new Shrub(4.9, "shrubb", "shru", PlantColor.GREEN));
        testBed.add(new Shrub(5.3, "shribb", "shri", PlantColor.GREEN));
        testBed.add(new Shrub(2.3, "shrabb", "shra", PlantColor.GREEN));
    }

    @Test
    public void testSplitBedByColor() {
        logger.info("Testing the splitBedByColor method");

        Map<PlantColor, SimpleList<Plant>> map = SplitBedUtility.splitBedByColor(testBed);

        for (PlantColor color : map.keySet()) {
            SimpleList<Plant> plants = map.get(color);

            for (Plant plant : plants) {
                assertEquals(color, plant.getColor());
            }
        }
    }
}
