package ControlDeTemperatura;

public class Main {
    public static void main(String[] args) {

        Termometro conversion1 = new Termometro();
        Termometro conversion2 = new Termometro();

        conversion1.ConvertirFahrenheit(100.00);
        conversion1.ConvertirKelvin(100.00);

        conversion2.ConvertirFahrenheit(50.00);
        conversion2.ConvertirKelvin(50.00);

            }
}
