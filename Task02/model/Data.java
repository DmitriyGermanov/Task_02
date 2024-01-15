package model;

import java.util.ArrayList;
import java.util.List;

public class Data {
    List<String[]> data;


    public Data() {
        this.data = new ArrayList<>();
    }

    public List<String[]> getData() {
        return data;
    }

    public String[] addElement(String[] element) {
        this.data.add(element);
        return element;
    }

    public String getParsedData() {
        StringBuilder sb = new StringBuilder();
        for (String[] element : data) {
            for (String s : element) {
                sb.append(s).append(";");
            }
        }
        return sb.toString();
    }

    @Override
    public String toString() {
        if (data.isEmpty()) {
            throw new NullPointerException("Данные отсутствуют");
        }
        StringBuilder sb = new StringBuilder();
        for (String[] element : data) {
            sb.append("* ");
            sb.append(String.join(" ", element)).append("\n");
        }
        return sb.toString();
    }
}
