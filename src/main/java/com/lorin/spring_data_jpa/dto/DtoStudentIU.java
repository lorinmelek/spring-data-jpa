package com.lorin.spring_data_jpa.dto;

import jakarta.validation.constraints.*;

public class DtoStudentIU
{
    //insert update işlemlerini burda yapacağız diğer classı kullanamyabiliriz istenmeyen dışında variable döndürüyor o yüzden mesela sva emethdunu kullanmak istediğimiz de fazladan birthofdate i döndürüyor.

    @NotEmpty(message = "Firstname alanı boş bırakılamazç.")
    @Min(value = 3)
    @Max(value = 10)
    private String firstName;
    private String lastName;
    private String birthOfDate;

    @Email(message = "email formatında bir şey gir")
    private String email;

    @Size(min = 11, max = 11, message = " Tckn 11 haneli olmalıdır." )
    @NotEmpty(message = "Tckn alanı boş bırakılamaz.")
    private String tckn;

    public DtoStudentIU()
    {
    }

    public DtoStudentIU(Integer id, String firstName, String lastName, String birthOfDate)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthOfDate = birthOfDate;
        this.email = email;
        this.tckn = tckn;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getBirthOfDate() {
        return birthOfDate;
    }

    public void setBirthOfDate(String birthOfDate) {
        this.birthOfDate = birthOfDate;
    }

    public String getEmail() {return email;}

    public void setEmail(String email) {this.email = email;}

    public String getTckn() {return tckn;}

    public void setTckn(String tckn) {this.tckn = tckn;}
}
