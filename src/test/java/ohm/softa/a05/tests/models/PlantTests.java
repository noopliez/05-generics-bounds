package ohm.softa.a05.tests.models;

import ohm.softa.a05.model.Flower;
import ohm.softa.a05.model.Plant;
import ohm.softa.a05.model.PlantColor;
import ohm.softa.a05.model.Shrub;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Demo model with an empty constructor to be able to test the addEmpty() method
 * @author Peter Kurfer
 * Created on 10/19/17.
 */
public class PlantTests {
	private final Logger logger = LogManager.getLogger();
	private Plant testPlant;

	@Test
	public void testFlowerNotGreen() {
		logger.info("Testing that flowers can't be green");
		assertThrows(IllegalArgumentException.class, () -> testPlant = new Flower(3.5, "Roses", "Rose", PlantColor.GREEN));
	}

	@Test
	public void testShrubMustBeGreen() {
		logger.info("Testing that shrubs can only be green");
		assertThrows(IllegalArgumentException.class, () -> testPlant = new Shrub(3.7, "Shrubs", "Hot Shrubs", PlantColor.BLUE));
	}
}

