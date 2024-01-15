package model;

import java.io.IOException;
import java.nio.file.Path;

public class Service {
    Data data;
    Parser parser;
    FileHandler fileHandler;

    public Service() {
        this.data = new Data();
        this.parser = new Parser();
        fileHandler = new FileHandler();
    }

    public String[] addElement(String element) {
        return data.addElement(parser.stringPars(element));
    }

    public void writeToFile() throws IOException {
        if (data.getData().isEmpty()) {
            throw new NullPointerException("Не указаны данные для записи");
        } else {
            for (String[] element : data.getData()) {
                fileHandler.write(Path.of(element[0] + ".json"), String.join(";", element));
                fileHandler.write(Path.of(element[0] + ".json"), "\n");
            }
        }
    }

    public String showAllData() {
        return data.toString();
    }
}
