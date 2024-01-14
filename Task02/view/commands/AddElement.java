package view.commands;

import view.consoleView.ConsoleUI;

public class AddElement extends Command {
    public AddElement(ConsoleUI consoleUI) {
        super("Добавить элемент", consoleUI);
    }

    @Override
    public void execute() {
        getConsoleUI().addElement();
    }
}
