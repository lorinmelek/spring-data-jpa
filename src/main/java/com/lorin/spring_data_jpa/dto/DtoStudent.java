package com.lorin.spring_data_jpa.dto;

public class DtoStudent {
    private String firstName;
    private String lastName;
    //kullanıcının görmesini istediğim enitity özelliklerini tanımlıyorum sadece.
    //sadece get işlemlerinde u class ı kullanıypruz.
    // Parametresiz Constructor
    public DtoStudent() {}

    // Parametreli Constructor
    public DtoStudent(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // Getter ve Setter metotları
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
}
