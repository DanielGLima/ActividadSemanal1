package Promedio;

public class Estudiante {
    private String nombre;
    private String carnet;
    private double notaFinal;

    // Constructor
    public Estudiante(String nombre, String carnet, double notaFinal) {
        this.nombre = nombre;
        this.carnet = carnet;
        setNotaFinal(notaFinal);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCarnet() {
        return carnet;
    }

    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }

    public double getNotaFinal() {
        return notaFinal;
    }

    // Setter para la nota final con validación
    public void setNotaFinal(double notaFinal) {
        if (notaFinal >= 0 && notaFinal <= 100) {
            this.notaFinal = notaFinal;
        } else {
            System.out.println("Error: La nota debe estar en el rango de 0 a 100.");
        }
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "nombre='" + nombre + '\'' +
                ", carnet='" + carnet + '\'' +
                ", notaFinal=" + notaFinal +
                '}';
    }
}
