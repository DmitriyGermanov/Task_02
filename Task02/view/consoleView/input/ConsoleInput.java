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

    public Integer rangeIntInput(Integer start, Integer end) {
        int output;
        try {
            output = Integer.parseInt(scanner.nextLine());
            if (output >= start && output <= end) {
                return output;
            } else {
                throw new IllegalArgumentException("Введите корректный пункт меню от " + start + " до " + end);
            }
        } catch (Exception e) {
            throw e;
        }
    }
}