package com.lorin.spring_data_jpa.services.impl;

import com.lorin.spring_data_jpa.entities.Student;
import com.lorin.spring_data_jpa.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements IStudentServices
{

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Student saveStudent(Student student)
    {
        return studentRepository.save(student);
    }
}