import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    private final Scanner scanner;
    private final AnimalList animalList;

    public Menu(Scanner scanner, AnimalList animalList) {
        this.scanner = scanner;
        this.animalList = animalList;
    }

    private void printMainMenu() {
        System.out.println("***********************");
        System.out.println("1. Добавить животное;");
        System.out.println("2. Посмотреть список животных;");
        System.out.println("3. Выбрать животное;");
        System.out.println("4. Удалить животное;");
        System.out.println("0. Выход из приложения;");
        System.out.println("***********************");
    }

    private void printAnimalMenu() {
        System.out.println("***********************");
        System.out.println("1. Изменить имя животного;");
        System.out.println("2. Посмотреть умения животного;");
        System.out.println("3. Обучить животное новым командам;");
        System.out.println("0. Вернуться в главное меню;");
        System.out.println("***********************");
    }

    private void printAnimalClassMenu() {
        System.out.println("***********************");
        System.out.println("Какое животное вы хотите занести: ");
        System.out.println("1. Кошки");
        System.out.println("2. Собаки");
        System.out.println("3. Хомяки");
        System.out.println("***********************");
    }

    public Animal chooseAnimalMenu() {
        Animal animal;
        do {
            System.out.println("Выберите животное:");
            animalList.showAllAnimals();
            try {
                animal = animalList.getAnimals().get(scanner.nextInt()-1);
                return animal;
            } catch (Exception e) {
                scanner.nextLine();
                System.out.println("Вы ввели неверное значение меню...");
            }
        } while (true);
    }

    public void mainMenu() {
        if (this.scanner != null) {
            int key = -1;
            do {
                printMainMenu();
                System.out.print("Введите номер меню: ");
                try {
                    key = this.scanner.nextInt();
                } catch (InputMismatchException e) {
                    scanner.nextLine();
                    System.out.println("Вы ввели неверное значение меню...");
                    continue;
                }
                switch (key) {
                    case 1:
                        Animal animal = this.animalClassMenu();
                        animalList.addAnimal(animal);
                        break;
                    case 2:
                        animalList.showAllAnimals();
                        break;
                    case 3:
                        this.animalMenu(this.chooseAnimalMenu());
                        break;
                    case 4:
                        animalList.removeAnimal(this.chooseAnimalMenu());
                        break;
                    case 0:
                        break;
                    default:
                        System.out.println("Вы ввели неверное значение меню...");
                }
            } while (key != 0);
        }
    }

    public void animalMenu(Animal animal) {
        int key = -1;
        do {
            System.out.println(animal);
            printAnimalMenu();
            System.out.print("Введите номер меню: ");
            try {
                key = this.scanner.nextInt();
            } catch (InputMismatchException e) {
                scanner.nextLine();
                System.out.println("Вы ввели неверное значение меню...");
                continue;
            }
            switch (key) {
                case 1:
                    animal.setAnimalName();
                    break;
                case 2:
                    animal.showCommands();
                    break;
                case 3:
                    animal.addCommand();
                    break;

                case 0:

                    break;
                default:
                    System.out.println("Вы ввели неверное значение меню...\n");
            }

        } while (key != 0);
    }

    public Animal animalClassMenu() {
        int key = -1;
        do {
            printAnimalClassMenu();
            System.out.print("Введите номер меню: ");
            try {
                key = this.scanner.nextInt();
            } catch (InputMismatchException e) {
                scanner.nextLine();
                System.out.println("Вы ввели неверное значение меню...");
                continue;
            }

            switch (key) {
                case 1:
                    return new Cat();
                case 2:
                    return new Dog();
                case 3:
                    return new Hamster();
                default:
                    System.out.println("Вы ввели неверное значение меню...\n");
            }
        } while (key != 1 && key != 2 && key != 3);
        return null;
    }
}
