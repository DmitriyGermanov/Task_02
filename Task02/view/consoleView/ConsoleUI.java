package view.consoleView;

import customExceptions.IllegalData;
import customExceptions.IllegalElementsNumbers;
import customExceptions.IllegalGender;
import customExceptions.IllegalPhoneNumber;
import presenter.Presenter;
import view.View;
import view.consoleView.input.ConsoleInput;
import view.consoleView.input.Input;

import javax.swing.*;
import java.text.ParseException;

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

    public void addElement() {
        boolean flag = true;

        //Todo: переделать в блок Try/Catch
        String[] parts = null;
        while (flag) {
            try {
                System.out.println("Введите данные через пробел в формате: \n" +
                        "Фамилия Имя Отчество дата_рождения(dd.mm.yyyy) номер_телефона(цифры) пол(Мужской/Женский)");
                String data = input.dataInput();
                parts = presenter.addElement(data);
                flag = false;
            } catch (IllegalElementsNumbers e) {
                System.out.println("Введено некорректное количество элементов\n");
            } catch (IllegalData e) {
                System.out.println("Дата рождения введена некорректно, введите дату рождения по шаблону\n");
                ;
            } catch (IllegalPhoneNumber e) {
                System.out.println("Номер телефона введен неверно, введите только цифры\n");
            } catch (IllegalGender e) {
                System.out.println("Пол введен неверно, введите: Мужской или Жениский\n");
            }
        }
        System.out.println("Вы ввели следующие данные:\n" +
                "Фамилия: " + parts[0] + "\n" +
                "Имя: " + parts[1] + "\n" +
                "Отчество: " + parts[2] + "\n" +
                "Дата рождения: " + parts[3] + "\n" +
                "Номер телефона: " + parts[4] + "\n" +
                "Пол: " + parts[5]);
    }
}
