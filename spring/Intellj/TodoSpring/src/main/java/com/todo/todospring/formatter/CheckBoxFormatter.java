package com.todo.todospring.formatter;

import org.springframework.format.Formatter;

import java.text.ParseException;
import java.util.Locale;

public class CheckBoxFormatter implements Formatter<Boolean> {

    @Override
    public Boolean parse(String text, Locale locale) throws ParseException {
        if (text == null) {// text값이 없으면 false
            return false;
        }
        return text.equals("on");// 들어온 값이 on이면 리턴
    }

    @Override
    public String print(Boolean object, Locale locale) {
        return object.toString();
    }
}
