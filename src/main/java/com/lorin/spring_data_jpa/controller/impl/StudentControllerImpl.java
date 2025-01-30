package com.lorin.spring_data_jpa.controller.impl;

import com.lorin.spring_data_jpa.controller.IStudentController;
import com.lorin.spring_data_jpa.dto.DtoStudent;
import com.lorin.spring_data_jpa.dto.DtoStudentIU;
import com.lorin.spring_data_jpa.entities.Student;
import com.lorin.spring_data_jpa.services.impl.IStudentServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("rest/api/student")
public class StudentControllerImpl implements IStudentController
{
    @Autowired
    private IStudentServices studentServices;//normalde bu bağlantının interface fileı üzerinden yapılması daha doğru

    //dto kullanılıyormuş normalde buranın yerine
    @PostMapping(path = "/save")
    @Override
    public DtoStudent saveStudent(@RequestBody DtoStudentIU dtoStudentIU)
    {
        return studentServices.saveStudent(dtoStudentIU);
    }

    @GetMapping(path = "/list")
    @Override
    public List<DtoStudent> getAllStudents()
    {//artık sadece dtodaki verileri dönüyor kullanıcıya yani sadece name ve lastname.
        return studentServices.getAllStudents();
    }

    @GetMapping(path = "/list/{id}")
    @Override
    public DtoStudent getStudentById(@PathVariable(name="id") int id)
    {
        return studentServices.getStudentById(id);
    }

    @DeleteMapping(path = "/delete/{id}")
    @Override
    public void deleteStudent(@PathVariable(name = "id") int id)
    {
        studentServices.deleteStudent(id);
    }
    @PutMapping(path = "/update/{id}")
    @Override
    public DtoStudent updateStudent(@PathVariable(name = "id") int id, @RequestBody DtoStudentIU dtoStudentIU) {
        return studentServices.updateStudent(id, dtoStudentIU);
    }
}