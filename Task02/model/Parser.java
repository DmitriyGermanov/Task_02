package model;

import customExceptions.IllegalData;
import customExceptions.IllegalElementsNumbers;
import customExceptions.IllegalGender;
import customExceptions.IllegalPhoneNumber;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Parser {
    public String[] stringPars(String data) {
        DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        String[] elements = data.split(" ");
        if (elements.length != 6) {
            throw new IllegalElementsNumbers("Некорректное количество элементов в записи");
        }
        try {
            dateFormat.parse(elements[3]);
        } catch (ParseException e) {
            throw new IllegalData("Некорректный формат записи даты");
        }
        try {
            Long.parseLong(elements[4]);
        } catch (NumberFormatException e) {
            throw new IllegalPhoneNumber("Введен некорректный номер телефона");
        }
        if (elements[5].equals("Мужской") || elements[5].equals("Женский")) {
            return elements;
        } else {
            throw new IllegalGender("Введен некорректный пол");
        }
    }

}

