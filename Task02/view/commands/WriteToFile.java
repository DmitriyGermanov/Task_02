package view.commands;

import view.consoleView.ConsoleUI;

import java.io.IOException;

public class WriteToFile extends Command {
    public WriteToFile(ConsoleUI consoleUI) {
        super("Запись все элементы в память", consoleUI);
    }
    @Override
    public void execute() {
        getConsoleUI().writeToFile();
    }
}
