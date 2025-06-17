package com.springjdbc.dao;
import com.springjdbc.Student;
import java.util.List;

public interface StudentDao {
    Student getStudentById(int studentId);
    List<Student> getAllStudents();  // <-- new method
}
