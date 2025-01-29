public class TemperatureConverter {

    public double fahrenheitToCelcius(double fahrenheit) {
        double celcius = (fahrenheit - 32) * (5.0 / 9.0);
        return celcius;
    }

    public double celsiusToFahrenheit(double celcius) {
        double fahrenheith = (celcius * (9.0 / 5.0)) + 32;
        return fahrenheith;

    }

    public boolean isExtremeTemperature(double celcius) {
        return celcius < -40 || celcius > 50;
    }
}