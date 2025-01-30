package com.lorin.spring_data_jpa.controller.impl;

import com.lorin.spring_data_jpa.controller.IStudentController;
import com.lorin.spring_data_jpa.entities.Student;
import com.lorin.spring_data_jpa.services.impl.IStudentServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("rest/api/student")
public class StudentControllerImpl implements IStudentController {

    @Autowired
    private IStudentServices studentServices;//normalde bu bağlantının interface fileı üzerinden yapılması daha dıoğru

    //dto kullanılıyormuş normalde buranın yerine
    @PostMapping(path = "/save")
    @Override
    public Student saveStudent(@RequestBody Student student) {
        return studentServices.saveStudent(student);
    }
}
