package Promedio;


import java.util.ArrayList;
import java.util.List;

public class Curso {
    private List<Estudiante> estudiantes;

    // Constructor
    public Curso() {
        this.estudiantes = new ArrayList<>();
    }

    // Método para agregar un estudiante al curso
    public void agregarEstudiante(Estudiante estudiante) {
        estudiantes.add(estudiante);
    }

    // Método para calcular el promedio del curso
    public double calcularPromedio() {
        if (estudiantes.isEmpty()) {
            System.out.println("No hay estudiantes en el curso.");
            return 0;
        }

        double sumaNotas = 0;
        for (Estudiante estudiante : estudiantes) {
            sumaNotas += estudiante.getNotaFinal();
        }
        return sumaNotas / estudiantes.size();
    }

    // Método para determinar qué estudiantes aprobaron (nota >= 61)
    public List<Estudiante> estudiantesAprobados() {
        List<Estudiante> aprobados = new ArrayList<>();
        for (Estudiante estudiante : estudiantes) {
            if (estudiante.getNotaFinal() >= 61) {
                aprobados.add(estudiante);
            }
        }
        return aprobados;
    }

    // Método para mostrar la lista de estudiantes
    public void mostrarEstudiantes() {
        for (Estudiante estudiante : estudiantes) {
            System.out.println(estudiante);
        }
    }
}
