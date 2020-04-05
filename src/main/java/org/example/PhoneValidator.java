package org.example;

public class PhoneValidator implements Validator {
    public boolean isValid(String value) {

        boolean a = value.matches("^((\\+?[378])[\\-]?)?(([(]\\d{3,4}[)])|(\\d{3,4}))?([\\-])?((\\d{2}[\\-]?[\\d]{2}[\\-]?[\\d]{2,3})|(\\d{2}\\d-[\\d]{3,4})|(\\d{2}\\d-[\\d]{2}-[\\d]{2}))([(](([а-я]+\\s)|([а-я]+\\.\\s)*)(\\d{2,3}?[)]))?$");



        return a;
    }
}
