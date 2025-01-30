package com.lorin.spring_data_jpa.services.impl;

import com.lorin.spring_data_jpa.dto.DtoStudent;
import com.lorin.spring_data_jpa.dto.DtoStudentIU;
import com.lorin.spring_data_jpa.entities.Student;

import java.util.List;


public interface IStudentServices
{
    public DtoStudent saveStudent(DtoStudentIU dtoStudentIU);
    public List<DtoStudent> getAllStudents();
    public DtoStudent getStudentById(int id);
    public void deleteStudent(int id);
    public DtoStudent updateStudent(int id, DtoStudentIU dtoStudentIU);
}
