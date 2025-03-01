package ControlDeTemperatura;

import java.sql.SQLOutput;

public class Termometro {

    private double celcius;

    public void ControlDeTemperatura(double celcius){
        this.celcius = celcius;
    }

    public void ConvertirFahrenheit(Double celcius){
        double fahrenheit = (celcius * 1.8) + 32;
        System.out.println("Temperatura en Fahrenheit: " + fahrenheit);
    }

    public void ConvertirKelvin(Double celcius){
        Double kelvin = (celcius + 273.15);
        System.out.println("Temperatura en Kelvin: " + kelvin);
    }

}
