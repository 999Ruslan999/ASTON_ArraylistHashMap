package hashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Реализация HashMap
        // Создал не большое приложение для доставки заказов по миру.
        // Создал мапу и заполнил её, ключом является экземпляр класса Address, а значением цена за 1 кг заказа.
        // Нам нужно ввести в консоль Страну, Город и вес доставки.
        // После каждого ввода заказа, нам программа выводит стоимость доставки одного заказа.
        // Для выхода из программы нам нужно ввести в место страны слово "выход".
        // После выхода программа выведет общую стоимость всех доставок.

        Scanner scanner = new Scanner(System.in);

        // Создал 3 адресса для доставки, эти адресса нужно вводить в консоль.
        Address address1 = new Address("Россия", "Санкт-Петербург");
        Address address2 = new Address("Франция", "Париж");
        Address address3 = new Address("Германия", "Берлин");


        Map<Address, Integer> costPerAddress = new HashMap<>();

        costPerAddress.put(address1, 30);
        costPerAddress.put(address2, 50);
        costPerAddress.put(address3, 90);


        int totalCost = 0;
        while (true) {
            System.out.println("Создание нового заказа: / для выхода введите - выход");
            System.out.println("Введите страну:");
            String country = scanner.nextLine();
            if (country.equals("выход")) break;
            System.out.println("Введите город:");
            String city = scanner.nextLine();
            System.out.println("Введите вес заказа (кг): ");
            Integer weight = scanner.nextInt();
            scanner.nextLine();
            Address address = new Address(country, city);
            Integer cost = costPerAddress.get(address);
            if (cost == null) {
                System.out.println("Доставка по такому адрессу не осуществляется");
            } else {
                int deliveryCost = weight * cost;
                System.out.println("Стоимость доставки: " + deliveryCost + "р.");
                totalCost += deliveryCost;

            }

        }
        System.out.println("Общая стоимость всех доставок: " + totalCost + "р.");

    }
}
