package Temporizador;

public class Alarma {
    private int tiempoObjetivo;

    // Constructor
    public Alarma(int tiempoObjetivo) {
        this.tiempoObjetivo = tiempoObjetivo;
    }

    // Método para verificar si la alarma debe activarse
    public boolean debeActivar(int tiempoActual) {
        return tiempoActual >= tiempoObjetivo;
    }

    // Método para activar la alarma
    public void activar() {
        System.out.println("¡Alarma activada! Tiempo objetivo alcanzado.");
    }
}
