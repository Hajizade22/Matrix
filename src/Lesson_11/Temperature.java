package Lesson_11;

public class Temperature {
    double temperature;
    double fahrenheitTemperature;

    public Temperature() {
        this.temperature = 0.0;
        this.fahrenheitTemperature = 32.0;
    }

    public Temperature(double Celsius) {
        this.temperature = Celsius;
        this.fahrenheitTemperature = (temperature * 9 / 5) + 32;
    }

    public Temperature(double Celsius, double Fahrenheit) {
        if (Celsius == ' ') {
            this.temperature = (Fahrenheit - 32) * 5 / 9;
            this.fahrenheitTemperature = Fahrenheit;
        } else {
            this.temperature = Celsius;
            this.fahrenheitTemperature = Fahrenheit;
        }
    }
    @Override
    public String toString() {
        return
                "Temperature=" + temperature +
                        ", FahrenheitTemperature=" + fahrenheitTemperature;
    }
}





