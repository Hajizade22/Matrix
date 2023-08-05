package Lesson_11;

public class Temperature2 {
    double temperature;
    double fahrenheitTemperature;

    public double getTemperature() {
        return temperature;
    }

    public double getFahrenheitTemperature() {
        return fahrenheitTemperature;
    }

    public Temperature2() {
        this.temperature = 0.0;
        this.fahrenheitTemperature = 32.0;
    }

    public Temperature2(double Celsius) {
        this.temperature = Celsius;
        this.fahrenheitTemperature = (Celsius * 9 / 5) + 32;
    }

    public Temperature2(double Celsius, double Fahrenheit) {
        this.temperature = Celsius;
        this.fahrenheitTemperature = Fahrenheit;
    }

    public void setTemperature(double Celsius) {
        this.temperature = Celsius;
        this.fahrenheitTemperature = (Celsius * 9 / 5) + 32;
    }

    public void setFahrenheitTemperature(double Celsius, double Fahrenheit) {
        this.fahrenheitTemperature = Fahrenheit;
        this.temperature = Celsius;
    }
    public void convertToCelsium(){
        this.temperature=(fahrenheitTemperature-32)*5/9;
    }

    @Override
    public String toString() {
        return "Temperature2{" +
                "temperature=" + temperature +
                ", fahrenheitTemperature=" + fahrenheitTemperature +
                '}';
    }
}



