import junit.framework.TestCase;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TemperatureConverterTest extends TestCase {
    private TemperatureConverter temperatureConverter;


    @BeforeEach
    public void setUp() {
        this.temperatureConverter = new TemperatureConverter();
    }



    @Test
    void TestfahrenheitToCelcius() {
        assertEquals(0.0, temperatureConverter.fahrenheitToCelcius(32.0));
        assertEquals(100.0, temperatureConverter.fahrenheitToCelcius(212.0));
        assertEquals(-40.0, temperatureConverter.fahrenheitToCelcius(-40.0));
    }
    @Test
    void celsiusToFahrenheit() {
        assertEquals(32.0, temperatureConverter.celsiusToFahrenheit(0.0));
        assertEquals(212.0, temperatureConverter.celsiusToFahrenheit(100.0));
        assertEquals(-40.0, temperatureConverter.celsiusToFahrenheit(-40.0));
    }

    @Test
    void isExtremeTemperature() {
        assertTrue(temperatureConverter.isExtremeTemperature(-41.0));
        assertTrue(temperatureConverter.isExtremeTemperature(51.0));
        assertFalse(temperatureConverter.isExtremeTemperature(-40.0));
        assertFalse(temperatureConverter.isExtremeTemperature(50.0));
    }
}