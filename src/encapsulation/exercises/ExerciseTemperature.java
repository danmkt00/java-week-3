package encapsulation.exercises;

/**
 TODO:
 1. Create a private field temperatureInCelsius (double).
 2. Add getter and setter for it (no unrealistic values like -273).
 3. Add a method getFahrenheit() that converts Celsius to Fahrenheit.
 4. Add a method getKelvin() that converts Celsius to Kelvin.
 */
class Temperature
{
    private double temperatureInCelsius = 0;

    public double getTemperatureInCelsius() {
        return temperatureInCelsius;
    }

    public void setTemperatureInCelsius(double temperatureInCelsius)
    {
        if(temperatureInCelsius < -60 || temperatureInCelsius > 100)
        {
            System.out.println("Temperature must be realistic!");
        }else{
            this.temperatureInCelsius = temperatureInCelsius;
        }
    }

    public double getFahrenheit()
    {
        return temperatureInCelsius * 1.8 + 32;
    }

    public double getKelvin()
    {
        return temperatureInCelsius + 273.15;
    }
}
public class ExerciseTemperature
{
    public static void main(String[] args) {
        Temperature temperature = new Temperature();
        temperature.setTemperatureInCelsius(12);

        System.out.println(temperature.getTemperatureInCelsius() + "°C to Fahrenheit:\t" + temperature.getFahrenheit() + "°F");
        System.out.println(temperature.getTemperatureInCelsius() + "°C to Kelvin:\t\t" + temperature.getKelvin() + "K") ;
    }
}
