package view.consoleView;

import presenter.Presenter;
import view.View;
import view.consoleView.input.ConsoleInput;
import view.consoleView.input.Input;

public class ConsoleUI implements View {
    private boolean work;
    private final MainMenu menu;
    private final Input input;
    private Presenter presenter;

    public ConsoleUI() {
        this.work = true;
        menu = new MainMenu(this);
        input = new ConsoleInput();
    }

    public void setPresenter(Presenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public void start() {
        System.out.println("Здравствуйте!\nВведите в консоль пункт меню и нажмите Enter");
        while (work) {
            printMenu();
            execute();
        }
    }

    private void printMenu() {
        System.out.println(menu.menu());
    }

    private void execute() {
        try {
            menu.execute(input.intInput());
        } catch (NumberFormatException e) {
            System.out.println("Введите пункт меню в виде цифры от 1 до " + menu.getSize());
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Введите корректный пункт меню от 1 до " + menu.getSize());
        }
    }

    public void setWork(boolean b) {
        this.work = false;
    }

    public void writeData() {
        presenter.writeData(input.dataInput());
    }
}
