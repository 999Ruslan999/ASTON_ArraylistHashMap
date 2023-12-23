package arraylist;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        // Реализация Arraylist. (Заметки)
        // Создал несколько элементов в коллекцию экземпляра класса Affairs
        // Создал 5 методов:
        // 1) Добавление новой заметки.
        // 2) Удаление заметки по её индексу.
        // 3) Редактирование элемента по индексу.
        // 4) Вывод элемента по индексу.
        // 5) Вывод элементов с их индексами.
        // Реализовал с использованием всех методов.
        // Для удобства выполнения программы использовал Scanner.

        Affairs affairs1 = new Affairs("Купить молоко");
        Affairs affairs2 = new Affairs("Зайти на почту");
        Affairs affairs3 = new Affairs("Приготовить ужин");
        Affairs affairs4 = new Affairs("Поставить будильник");

        List<Affairs> list = new ArrayList<>();

        list.add(affairs1);
        list.add(affairs2);
        list.add(affairs3);
        list.add(affairs4);

        addAffairs(list);
        deleteAffairs(list);
        updateAffairs(list);
        printAffairByIndex(list);

    }

    public static Scanner scanner;

    // Метод для добавления новой заметки в коллекцию
    public static List<Affairs> addAffairs(List<Affairs> list) {
        scanner = new Scanner(System.in);
        System.out.println("Добавьте новую заметку");
        String name = scanner.nextLine();
        Affairs affairs = new Affairs(name);
        list.add(affairs);
        System.out.println("Заметка успешно добавлена");
        demonstrationList(list);
        return list;
    }

    // Метод для удаления замметки по индексу
    public static List<Affairs> deleteAffairs(List<Affairs> list) {

        scanner = new Scanner(System.in);
        System.out.println("Введите номер заметки, которую хотите удалить");
        int index = scanner.nextInt();
        scanner.nextLine();
        if (index < 0 || index > list.size()) {
            System.out.println("Такой заметки нет");
        } else {
            list.remove(index);
            System.out.println("Заметка успешно удалена");

            demonstrationList(list);
        }
        return list;
    }


    // Метод для редактирования заметок
    public static List<Affairs> updateAffairs(List<Affairs> list) {

        scanner = new Scanner(System.in);
        System.out.println("Введите номер заметки, которую хотите редактировать");
        int index = scanner.nextInt();
        scanner.nextLine();
        if (index < 0 || index > list.size()) {
            System.out.println("Такой заметки нет");
        } else {
            System.out.println("Редактируйте заметку");
            String name = scanner.nextLine();
            Affairs updateAffairs = new Affairs(name);
            list.set(index, updateAffairs);
            System.out.println("Заметка успешно отредактирована");


            demonstrationList(list);
        }
        return list;

    }


    // Метод вывода элемента по индексу
    public static void printAffairByIndex(List<Affairs> list) {

        System.out.println("Введите номер заметки");
        int index = scanner.nextInt();
        if (index < 0 || index > list.size()) {
            System.out.println("Такой заметки нет");
        } else {
            Affairs affairs = list.get(index);
            System.out.println(affairs);
        }


    }


    // Метод для вывода коллекции с индексами элементов
    public static void demonstrationList(List<Affairs> list) {
        int i = 0;
        for (Affairs affairs : list) {
            System.out.println(i + ": " + affairs);
            i++;
        }
    }
}