import java.time.LocalDate;

public class Main {
    public static void checkYear(int year) {
        if (year % 4 == 0 && year > 1584 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }
    public static void checkOsAndDeviceYear(int os, int deviceYear) {
        int currentYear = LocalDate.now().getYear();
        var appType = deviceYear < currentYear ? "облегченную " : "";
        if (os == 0) {
            System.out.println("Установите " + appType + " версию приложения для iOS по ссылке" );
        } else if (os == 1) {
            System.out.println("Установите " + appType + "версию приложения для Android по ссылке" );
        } else {
            System.out.println("Операционная система введена некорректно");
        }
    }
    public static int checkDelivery (int distance) {
        int deliveryDays = 0;
        if (distance <= 20) {
            deliveryDays = 1;
        } if (distance > 20 && distance <= 60) {
            deliveryDays = 2;
        } if (distance > 60 && distance <= 100) {
            deliveryDays = 3;
        }
        return deliveryDays;
    }


    public static void main(String[] args) {
        System.out.println("Задание 1");
        int year = 2025;
        checkYear(year);
        System.out.println("Задание 2");
        int os = 1;
        int deviceYear = 2022;
        checkOsAndDeviceYear(os,deviceYear);
        System.out.println("Задание 3");
        int distance = 5;
        int deliveryDays = checkDelivery(distance);
        if (distance < 0 || distance > 100) {
            System.out.println("На такое расстояние доставка не осуществляется");
        }
        else {
            System.out.println("Потребуется дней : " + deliveryDays);
        }
    }
}
