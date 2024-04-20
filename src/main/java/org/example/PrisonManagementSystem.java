package org.example;

import java.util.Scanner;

public class PrisonManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

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
        System.out.println("9. Завершить программу");

        int choice = Integer.parseInt(scanner.nextLine());

        switch (choice) {
            case 1:
                registerPrisoner();
                break;
            case 2:
                conductSearch();
                break;
            case 3:
                provideMeal();
                break;
            case 4:
                calculateSentenceDuration();
                break;
            case 5:
                assignWork();
                break;
            case 6:
                transferCell();
                break;
            case 7:
                releasePrisoner();
                break;
            case 8:
                conductInterrogation();
                break;
            case 9:
                exitProgram();
                break;
            default:
                printCustomMessage("Некорректный выбор.");
        }

        scanner.close();
    }

    // Статические функции
    public static void registerPrisoner() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите данные нового заключенного:");
        String prisonerName = scanner.nextLine();
        int prisonerId = (int) (Math.random() * 1000);
        System.out.println("Заключенный " + prisonerName + " зарегистрирован. ID: " + prisonerId);
    }

    public static void conductSearch() {
        System.out.println("Проводим обыск...");
        System.out.println("Обыск завершен.");
    }

    public static void provideMeal() {
        System.out.println("Выдаем прием пищи...");
        System.out.println("Прием пищи выдан.");
    }

    public static void calculateSentenceDuration() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длительность наказания (в днях):");
        int duration = Integer.parseInt(scanner.nextLine());
        System.out.println("Длительность наказания: " + duration + " дней.");
    }

    public static void assignWork() {
        System.out.println("Назначаем работу заключенному...");
        System.out.println("Работа назначена.");
    }

    public static void transferCell() {
        System.out.println("Переводим заключенного в другую камеру...");
        System.out.println("Заключенный переведен в другую камеру.");
    }

    // Функции, относящиеся к ответлению от стандартных функций
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
}