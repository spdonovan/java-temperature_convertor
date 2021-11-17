public class TemperatureConvertor {
    public static void main(String[] args) {
        TemperatureConvertor converter = new TemperatureConvertor();

        Double fahrenheit = 60.0;
        System.out.printf("%f in fahrenheit = %f in celcius\n", fahrenheit, converter.toCelsius(fahrenheit));

        Double celsius = 27.0;
        System.out.printf("%f in celsius = %f in fahrenheit\n", celsius, converter.toFahrenheit(celsius));
    }

    public double toCelsius(Double fahrenheit) {
        Double factor = (5.0 / 9.0);
        return (fahrenheit - 32) * factor;
    }

    public double toFahrenheit(Double celsius) {
        Double factor = (9.0 / 5.0);
        return celsius * factor + 32;
    }
}
