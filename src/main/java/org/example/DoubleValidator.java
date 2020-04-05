package org.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DoubleValidator implements Validator {
    public boolean isValid(String value) {

        boolean a = value.matches("[+-]?[0-1_]*[.]?[0-1d_]*[^_]$");
        return a;
    }


}
