package presenter;

import model.Service;
import view.View;

import java.text.ParseException;

public class Presenter {
    Service service;
    View view;

    public Presenter(View view) {
        this.service = new Service();
        this.view = view;
        view.setPresenter(this);
    }

    public void start() {
        view.start();
    }

    public String[] addElement(String s) {
        return service.addElement(s);
    }
}
