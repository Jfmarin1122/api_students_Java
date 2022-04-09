package co.edu.umanizales.api_students.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data // Se asignan getters and setters
@AllArgsConstructor // Para pedir todos los datos del estudiante
public class Student {
    private String identification; // Atributos privados
    private byte gender; // Atributos privados
    private double salary; // Atributos privados
    private boolean job; // Atributos privados
    private String name; // Atributos privados
}
