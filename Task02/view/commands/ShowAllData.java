package view.commands;

import view.consoleView.ConsoleUI;

public class ShowAllData extends Command {
    public ShowAllData(ConsoleUI consoleUI) {
        super("Показать все записи", consoleUI);
    }
    @Override
    public void execute() {
        getConsoleUI().showAllData();
    }
}
