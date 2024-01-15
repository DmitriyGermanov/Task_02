# Описание классов приложения
## Package  - model
#### 1. *Parser* - Принимает на вход исходную строку - проверяет и преобразует ее в массив строк
#### 2. *Data* - Отвечает за хранение и работу с листом из массивов строк, которые были приняты от пользователя и успешно обработаны.
#### 3. *Service* - Объединяет работу прочих классов в model
###  4. *FileHandler* - отвечает за запись и чтение данных из файла
Чтение не реализовывал, так как нет по ТЗ

## Package - presenter
#### 1. *Presenter* - осуществляет связь model и view

## Package - view
### Package - view.ConsoleView
В пакете собраны команды отвечающие за взаимодействие с пользователем через консоль
#### 1. *ConsoleUI* - отвечает за взаимодействие с пользователем через консоль
#### 2. *MainMenu* - собирает и формирует меню
### Package - view.commands
В пакете собраны команды интерфейса, все команды наследованы от
Command.java
### Package - consoleView.input
#### 1. *ConsoleInput* - принимает данные у пользователя через консоль