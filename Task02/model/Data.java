package model;

import java.util.ArrayList;
import java.util.List;

public class Data {
    List<String> data;

    public Data() {
        this.data = new ArrayList<>();
    }

    public List<String> getData() {
        return data;
    }

    public void addElement(String element) {
        this.data.add(element);
    }
}
