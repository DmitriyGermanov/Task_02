package main;

import presenter.Presenter;
import view.consoleView.ConsoleUI;

public class Main {
    public static void main(String[] args) {
        Presenter presenter = new Presenter(new ConsoleUI());
        presenter.start();
    }
}