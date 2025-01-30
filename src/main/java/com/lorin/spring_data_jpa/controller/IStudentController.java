package com.lorin.spring_data_jpa.controller;

import com.lorin.spring_data_jpa.dto.DtoStudent;
import com.lorin.spring_data_jpa.dto.DtoStudentIU;
import com.lorin.spring_data_jpa.entities.Student;

import java.util.List;

public interface IStudentController
{
    public DtoStudent saveStudent(DtoStudentIU DtostudentIU);
    public List<DtoStudent> getAllStudents();
    public DtoStudent getStudentById(int id);
    public void deleteStudent(int id);
    public DtoStudent updateStudent(int id ,DtoStudentIU dtoStudentIU);
}
