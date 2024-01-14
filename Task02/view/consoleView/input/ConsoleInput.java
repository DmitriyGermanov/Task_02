package view.consoleView.input;

import java.util.Scanner;

public class ConsoleInput implements Input {

    Scanner scanner;

    public ConsoleInput() {
        this.scanner = new Scanner(System.in);
    }

    public Integer intInput() {
        return Integer.parseInt(scanner.nextLine());
    }

    public String dataInput() {
        return scanner.nextLine();
    }


}