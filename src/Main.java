public class Main {
    public static void main(String[] args) {

        System.out.println("задание 1");
        int clientOS = 0;
        if (clientOS == 0) System.out.println("Установите версию приложения для iOS по ссылке.");
        else {
            System.out.println("Установите версию приложения для Android по ссылке.");
        }

        System.out.println("задание 2");
        clientOS = 0;
        int clientDeviceYear = 2015;
        if (clientOS == 0) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегчённую версию приложения для iOS по ссылке.");
            } else {
                if (clientDeviceYear >= 2015) {
                    System.out.println("Установите версию приложения для iOS по ссылке.");
                }
            }
        } else {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегчённую версию приложения для Android по ссылке.");
            } else {
                if (clientDeviceYear >= 2015) {
                    System.out.println("Установите версию приложения для Android по ссылке.");
                }
            }
        }

        System.out.println("задание 3");
        int year = 2021;
        if (year > 1584) {
            if (year % 4 == 0) {
                if (year % 100 != 0 || year % 400 == 0) {
                    System.out.println(year + " год является високосным.");
                } else {
                    System.out.println(year + " год не является високосным.");
                }
            } else {
                System.out.println(year + " год не является високосным.");
            }
        } else {
            System.out.println("Год должен быть больше 1584.");
        }

        System.out.println("задание 4");
        int deliveryDistance = 95;
        int deliveryDays;
        if (deliveryDistance <= 20) {
            deliveryDays = 1;
        } else if (deliveryDistance <= 60) {
            deliveryDays = 2;
        } else if (deliveryDistance <= 100) {
            deliveryDays = 3;
        } else {
            System.out.println("Доставка отсутствует.");
            return;
        }
        System.out.println("Потребуется дней: " + deliveryDays);

        System.out.println("задание 5");
        int monthNumber = 12;
        if (monthNumber > 12) {
            System.out.println("Номер месяца не может быть больше 12.");
            return;
        }
        switch (monthNumber) {
            case 12: case 1: case 2:
                System.out.println("Зима");
                break;
            case 3: case 4: case 5:
                System.out.println("Весна");
                break;
            case 6: case 7: case 8:
                System.out.println("Лето");
                break;
            case 9: case 10: case 11:
                System.out.println("Осень");
                break;
            default:
                break;
        }
    }
}


