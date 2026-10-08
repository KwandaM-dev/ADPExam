package za.ac.cput.vehiclesystem.util;

import javax.xml.validation.Validator;

public class Helper {

    public static boolean isNullOrEmpty(String str) {
        if (str == null || str.isEmpty()){
            return false;
        }
        return true;
    }

    public static boolean isValidPrice(double price) {
        if(price < 0){
            return false;
        }
        return true;
    }

    public static boolean isValidMobile(String mobile) {
        // Regex for a flexible 10-digit number
        final String REGEX_PATTERN = "^\\(?(\\d{3})\\)?[- ]?(\\d{3})[- ]?(\\d{4})$";
        if (mobile.matches(REGEX_PATTERN)) {
            return true;
        }
        return false;
    }





}
