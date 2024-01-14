package model;

import model.writer.FileHandler;

import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Data {
    List<String[]> data;
    FileHandler fileHandler;

    public Data() {
        this.data = new ArrayList<>();
        fileHandler = new FileHandler();
    }

    public List<String[]> getData() {
        return data;
    }

    public String[] addElement(String[] element) {
        this.data.add(element);
        return element;
    }

    public boolean writeToFile() throws IOException {
        if (data == null) {
            return false;
        } else {
            for (String[] element : data) {
                for (String s : element) {
                    fileHandler.write(Path.of("files/" + element[0]), String.join(";", s));
                }
            }
            return true;
        }
    }
}
