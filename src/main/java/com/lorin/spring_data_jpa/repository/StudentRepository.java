package com.lorin.spring_data_jpa.repository;

import com.lorin.spring_data_jpa.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

//sadece bir interface olacak repository de buraya kendi mehodlarımızı da tanımlayabiliriz.

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>//burdaki integer değeri primery key value mun type ı oluyor. student da hangi sınıf üzerinde işlem yapıcağımı belirtiyorum.
{
    // eğer  HQL kullanırsak burdaki tablo isimleriyle işlem yapıyoruz
    // SQL kullanırsak nativeQuery i true yapıp db deki table isimleriyle işlem yapıyoruz.
    @Query(value = "from Student", nativeQuery = false )
    List<Student> findAllStudents();

    @Query(value = "from Student s where s.id= :studentId")
    Optional <Student>  findStudentById(int studentId);
}
