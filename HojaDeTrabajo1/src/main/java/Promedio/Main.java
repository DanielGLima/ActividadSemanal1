package Promedio;

import java.util.List;

public class Main {
        public static void main(String[] args) {
            // Crear un curso
            Curso curso = new Curso();

            // Agregar estudiantes al curso
            curso.agregarEstudiante(new Estudiante("Juan Pérez", "A001", 85));
            curso.agregarEstudiante(new Estudiante("Ana Gómez", "A002", 55));
            curso.agregarEstudiante(new Estudiante("Carlos Ruiz", "A003", 90));
            curso.agregarEstudiante(new Estudiante("María López", "A004", 60));

            // Mostrar la lista de estudiantes
            System.out.println("Estudiantes en el curso:");
            curso.mostrarEstudiantes();

            // Calcular y mostrar el promedio del curso
            double promedio = curso.calcularPromedio();
            System.out.println("Promedio del curso: " + promedio);

            // Mostrar los estudiantes que aprobaron
            System.out.println("Estudiantes que aprobaron:");
            List<Estudiante> aprobados = curso.estudiantesAprobados();
            for (Estudiante estudiante : aprobados) {
                System.out.println(estudiante);
            }
        }
    }