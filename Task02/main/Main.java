package main;

import view.consoleView.ConsoleUI;
import view.View;

public class Main {
    public static void main(String[] args) {
        View view = new ConsoleUI();
        view.start();
    }
}