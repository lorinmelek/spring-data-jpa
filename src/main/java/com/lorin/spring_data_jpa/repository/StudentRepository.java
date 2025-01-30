package com.lorin.spring_data_jpa.repository;

import com.lorin.spring_data_jpa.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//sadece bir interface olacak repository de

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>//burdaki integer değeri primery key value mun type ı oluyor. student da hangi sınıf üzerinde işlem yapıcağımı belirtiyorum.
{

}
