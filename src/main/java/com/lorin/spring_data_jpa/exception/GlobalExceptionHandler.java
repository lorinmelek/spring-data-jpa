package com.lorin.spring_data_jpa.exception;

import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@ControllerAdvice //exception için yazılıyor
public class GlobalExceptionHandler
{
    //Spring validation dan fırlatılan hataları alıp yönetmek ve düzgğnce responde dönmek için.

//    private List<String> addMapValue(List<String> list, String newValue){
//        list.add(newValue);
//        return list;
//    }
//    @ExceptionHandler(value = MethodArgumentNotValidException.class)// burda exceptionı yakalıyoruz dönen mesajı parametere olarak classa veriyoruz.
//    public void handleMethodArgumentNotValidException(MethodArgumentNotValidException ex)
//    {
//        Map<String, List<String>> errorsMap = new HashMap<>();
//        for( ObjectError objError : ex.getBindingResult().getAllErrors()
//        {
//            String fieldName = ((FieldError)objError).getField();//hata olan alanın ismini almamı sağlar.
//            if (errorsMap.containsKey(fieldName)) {
//                errorsMap.get(fieldName).add(ex.getMessage());
//            }
//        }
//    }
}
