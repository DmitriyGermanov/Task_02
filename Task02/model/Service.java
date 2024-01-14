package model;

import customExceptions.IllegalElementsNumbers;

import java.text.ParseException;

public class Service {
    Data data;
    Parser parser;

    public Service() {
        this.data = new Data();
        this.parser = new Parser();
    }

    public String[] addElement(String element) {
        String[] parts = parser.stringPars(element);
        data.addElement(element);
        return parts;
    }
}
