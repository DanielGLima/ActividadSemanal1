package Temporizador;

public class Main {
    public static void main(String[] args) {

        Temporizador temporizador = new Temporizador();

        Alarma alarma = new Alarma(5);

        temporizador.setAlarma(alarma);

        temporizador.iniciar();
    }
}
