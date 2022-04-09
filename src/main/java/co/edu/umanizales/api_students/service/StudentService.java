package co.edu.umanizales.api_students.service;

import co.edu.umanizales.api_students.model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {
    private List<Student> students; // Crear lista

    public List<Student> getAllStudent()
    {
        students = new ArrayList<>(); // Lista vacía
        // Se adicionan tres objetos
        students.add(new Student("12345",(byte)1, 7000000, true,
                    "Juan Felipe"));
        students.add(new Student("9283915",(byte)1, 6000000, true,
                    "Laura"));
        students.add(new Student("1387345",(byte)1, 10000000, true,
                    "Nick"));

        return students;
    }

}
