package org.example;
import java.util.Random;
import java.util.Scanner;

public class PrisonManagementSystem {
        public static void main(String[] args) {
            boolean continueProgram = true;
            Scanner scanner = new Scanner(System.in);
            PrisonManagementSystem prisonSystem = new PrisonManagementSystem();

            while (continueProgram) {
                System.out.println("Программа управления тюрьмой");
                System.out.println("Выберите действие:");
                System.out.println("1. Зарегистрировать нового заключенного");
                System.out.println("2. Провести обыск");
                System.out.println("3. Выдать прием пищи");
                System.out.println("4. Рассчитать длительность наказания");
                System.out.println("5. Назначить работу заключенному");
                System.out.println("6. Перевести заключенного в другую камеру");
                System.out.println("7. Освободить заключенного");
                System.out.println("8. Провести допрос");
                System.out.println("9. Провести физические упражнения для заключенных");
                System.out.println("10. Посетить библиотеку для чтения книг");
                System.out.println("11. Провести консультацию для заключенных");
                System.out.println("12. Завершить программу");

                int choice = Integer.parseInt(scanner.nextLine());

                switch (choice) {
                    case 1:
                        registerPrisoner();
                        break;
                    case 2:
                        conductRandomSearch();
                        break;
                    case 3:
                        provideMeal();
                        break;
                    case 4:
                        calculateVariableSentenceDuration();
                        break;
                    case 5:
                        assignWork();
                        break;
                    case 6:
                        transferPrisonerToRandomCell();
                        break;
                    case 7:
                        releasePrisoner();
                        break;
                    case 8:
                        conductInterrogation();
                        break;
                    case 9:
                        prisonSystem.conductExercise();
                        break;
                    case 10:
                        prisonSystem.visitLibrary();
                        break;
                    case 11:
                        prisonSystem.conductCounselingSession();
                        break;
                    case 12:
                        exitProgram();
                        continueProgram = false;
                        break;
                    default:
                        printCustomMessage("Некорректный выбор.");
                }

                System.out.println("Желаете продолжить? (да/нет)");
                String continueChoice = scanner.nextLine();
                if (!continueChoice.equalsIgnoreCase("да")) {
                    continueProgram = false;
                    exitProgram();
                }
            }

            scanner.close();
        }

    public static void registerPrisoner() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите данные нового заключенного:");
        String input = scanner.nextLine();
        if (isValidName(input)) {
            int prisonerId = (int) (Math.random() * 1000);
            System.out.println("Заключенный " + input + " зарегистрирован. ID: " + prisonerId);
        } else {
            System.out.println("Неверный ввод. Пожалуйста, введите имя заключенного.");
            registerPrisoner();
        }
    }

    private static boolean isValidName(String input) {
        return input.matches("[а-яА-Я\\s]+");
    }

    public static void provideMeal() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите прием пищи:");
        System.out.println("1. Завтрак");
        System.out.println("2. Обед");
        System.out.println("3. Ужин");

        int choice = Integer.parseInt(scanner.nextLine());

        switch (choice) {
            case 1:
                System.out.println("Выдаем завтрак:");
                provideFood();
                System.out.println("Завтрак выдан.");
                break;
            case 2:
                System.out.println("Выдаем обед...");
                provideFood();
                System.out.println("Обед выдан.");
                break;
            case 3:
                System.out.println("Выдаем ужин...");
                provideFood();
                System.out.println("Ужин выдан.");
                break;
            default:
                System.out.println("Неверный выбор.");
        }
    }

    public static void assignWork() {
        System.out.println("Назначаем работу заключенному...");
        System.out.println("Работа назначена.");
    }

    public static void exitProgram() {
        System.out.println("Программа завершена.");
        System.exit(0);
    }

    public static void printCustomMessage(String message) {
        System.out.println(message);
    }

    public static void releasePrisoner() {
        System.out.println("Освобождаем заключенного...");
        System.out.println("Заключенный освобожден.");
    }

    public static void conductInterrogation() {
        System.out.println("Проводим допрос...");
        System.out.println("Допрос завершен.");
    }
    public void conductExercise() {
        System.out.println("Проводим физические упражнения для заключенных...");
        System.out.println("Упражнения завершены.");
    }

    public void visitLibrary() {
        System.out.println("Посещаем библиотеку для чтения книг...");
        System.out.println("Чтение завершено.");
    }

    public void conductCounselingSession() {
        System.out.println("Проводим консультацию для заключенных...");
        System.out.println("Консультация завершена.");
    }
    public static void conductRandomSearch() {
        Random random = new Random();
        boolean contrabandFound = random.nextBoolean();

        if (contrabandFound) {
            System.out.println("Контрабанда найдена!");
        } else {
            System.out.println("Контрабанды не найдено.");
        }
    }

    public static void provideFood() {
        Random random = new Random();
        String[] meals = {"Кашу", "Суп", "Чай"};
        String food = meals[random.nextInt(meals.length)];
        System.out.println("Выдаем: " + food);
    }

    public static void calculateVariableSentenceDuration() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длительность наказания (в днях):");
        String input = scanner.nextLine();
        if (isValidNumber(input)) {
            int baseDuration = Integer.parseInt(input);
            int variableDuration = baseDuration * 24;
            System.out.println("Длительность наказания: " + variableDuration + " часов.");
        } else {
            System.out.println("Неверный ввод. Пожалуйста, введите число.");
            calculateVariableSentenceDuration();
        }
    }

    private static boolean isValidNumber(String input) {
        try {
            Integer.parseInt(input);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static void transferPrisonerToRandomCell() {
        System.out.println("Переводим заключенного в случайную камеру...");
        Random random = new Random();
        int randomCell = random.nextInt(10) + 1;
        System.out.println("Заключенный переведен в камеру " + randomCell + ".");
    }
}