package com.lorin.spring_data_jpa.dto;

public class DtoStudentIU
{
    //insert update işlemlerini burda yapacağız diğer classı kullanamyabiliriz istenmeyen dışında variable döndürüyor o yüzden mesela sva emethdunu kullanmak istediğimiz de fazladan birthofdate i döndürüyor.

    private String firstName;
    private String lastName;
    private String birthOfDate;

    public DtoStudentIU()
    {
    }

    public DtoStudentIU(Integer id, String firstName, String lastName, String birthOfDate)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthOfDate = birthOfDate;
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
}
