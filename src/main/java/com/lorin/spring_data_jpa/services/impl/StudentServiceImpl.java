package com.lorin.spring_data_jpa.services.impl;

import com.lorin.spring_data_jpa.dto.DtoStudent;
import com.lorin.spring_data_jpa.dto.DtoStudentIU;
import com.lorin.spring_data_jpa.entities.Student;
import com.lorin.spring_data_jpa.repository.StudentRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements IStudentServices
{
    @Autowired
    private StudentRepository studentRepository;

    @Override
    public DtoStudent saveStudent(DtoStudentIU dtoStudentIU)
    {
        DtoStudent response = new DtoStudent(); // direkt döneceğim için responde yapıyorum.
        Student student = new Student();
        BeanUtils.copyProperties(dtoStudentIU, student);//dtostudent ı student a kopyalıyorum

        Student dbStudent = studentRepository.save(student);
        BeanUtils.copyProperties(dbStudent, response);//kopyaadığım dto objesini responsa atıyorum. sonra onu dödürüyorm.
        return response;
    }

    @Override
    public List<DtoStudent> getAllStudents()
    {
        List<DtoStudent> dtoList = new ArrayList<>();
        List<Student> students = studentRepository.findAllStudents();
        for (Student student : students)
        {
            DtoStudent dto = new DtoStudent();
            BeanUtils.copyProperties(student, dto);
            dtoList.add(dto);
        }
        return dtoList;
    }

    @Override
    public DtoStudent getStudentById(int id)
    {
        DtoStudent dto = new DtoStudent();
        Optional<Student> optional = studentRepository.findStudentById(id);//optional olduğunu type ına baakrak kara veriyoruz içine giderek
        if(optional.isPresent())
        {
            Student dbStudent = optional.get();

            BeanUtils.copyProperties(dbStudent, dto);
            return dto;
        }
        return null;
    }

    @Override
    public void deleteStudent(int id)
    {
        //DtoStudent dbStudent = getStudentById(id);//sileceğim student ı önce find ediyorum.
        Optional<Student> optional  = studentRepository.findById(id);
        optional.ifPresent(student -> studentRepository.delete(student));
    }

    @Override
    public DtoStudent updateStudent(int id, DtoStudentIU dtoStudentIU)
    {
//       Student Student = getStudentById(id);
//        if(dtoStudent != null)
//        {
//            dbStudent.setFirstName(updateStudent.getFirstName());
//            dbStudent.setLastName(updateStudent.getLastName());
//            dbStudent.setBirthOfDate(updateStudent.getBirthOfDate());
//        }
//        return studentRepository.save(dbStudent);

        DtoStudent dto = new DtoStudent();

        Optional <Student> optional = studentRepository.findById(id);
        if(optional.isPresent()){
            Student dbStudent = optional.get();

            dbStudent.setFirstName(dtoStudentIU.getFirstName());
            dbStudent.setLastName(dtoStudentIU.getLastName());
            dbStudent.setBirthOfDate(dtoStudentIU.getBirthOfDate());

            Student updatedStudent = studentRepository.save(dbStudent);
            BeanUtils.copyProperties(updatedStudent, dto);

             return dto;
        }
        return null;
    }


}