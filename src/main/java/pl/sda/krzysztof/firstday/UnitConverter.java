package pl.sda.krzysztof.firstday;

public class UnitConverter {

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 1.8) + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) / 1.8;
    }

    public static double kilometersToMiles(double km) {
        return km / 1.609344;
    }

    public static double milesToKilometers(double miles) {
        return miles * 1.609344;
    }

    public static double kilogramsToPounds(double kilogram) {
        return kilogram / 0.45359237;
    }

    public static double poundsToKilograms(double pound) {
        return pound * 0.45359237;
    }
}
