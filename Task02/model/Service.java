package model;

public class Service {
    Data data;
    Parser parser;

    public Service() {
        this.data = new Data();
        this.parser = new Parser();
    }

    public String[] addElement(String element) {
        return data.addElement(parser.stringPars(element));
    }
}
