package presenter;

import model.Service;
import view.View;

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

    public void writeData(String s) {
    }
}
