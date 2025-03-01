package Temporizador;

public class Temporizador {
    private int tiempoActual;
    // Atributo privado para la alarma asociada
    private Alarma alarma;

    // Constructor
    public Temporizador() {
        this.tiempoActual = 0;
        this.alarma = null;
    }

    public void setAlarma(Alarma alarma) {
        this.alarma = alarma;
    }

    public void iniciar() {
        while (true) {
            System.out.println("Tiempo actual: " + tiempoActual + " segundos");

            if (alarma != null && alarma.debeActivar(tiempoActual)) {
                alarma.activar();
                break; // Detener el temporizador cuando se activa la alarma
            }

            tiempoActual++;

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
