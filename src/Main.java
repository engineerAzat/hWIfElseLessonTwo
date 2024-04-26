public class Main {
    public static void main(String[] args) {

        // Первое задание

        System.out.println("\nTask 1 \n");
        byte clientOS = 3;      // Объявляем переменную clientOS  1 это iOS; 2 это android
        if (clientOS == 1) {    // Оператор if выполняется в случае если у оператора iOS
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 2) {   // Оператор else if выполняется в случае если у оператора Android
            System.out.println(("Установите версию приложения для Android по ссылке"));
        }
        else {    // Оператор else выполняется в случае если введено другая цифра в отличии от 1 или 2
            System.out.println("Не корректный ввод!");
        }

        // Второе задание

        System.out.println("\nTask 2 \n");
        int clientOSTwo = 1;      // Объявляем переменную clientOSTwo  1 это iOS; 2 это android
        int clientDeviceYear = 2016;  // Объявляем переменную clientDeviceYear (год выпуска телефона)
        if (clientDeviceYear > 2015 && clientOSTwo == 1) {  // Оператор if выполняется в случае если у оператора iOS и телефон выпущен после 2015 года
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientDeviceYear > 2015 && clientOSTwo == 2) { // Оператор else if выполняется в случае если у оператора android и телефон выпущен после 2015 года
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientDeviceYear <= 2015 && clientOSTwo == 1) {  // Оператор else if выполняется в случае если у оператора iOS и телефон выпущен d 2015 году или ранее
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientDeviceYear <= 2015 && clientOSTwo == 2) {  // Оператор else if выполняется в случае если у оператора android и телефон выпущен d 2015 году или ранее
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {  // Оператор else выполняется в случае если введено другая цифра в отличии от 1 или 2
            System.out.println("Не корректный ввод!");
        }

        // Третье задание

        System.out.println("\nTask 3 \n");

        int year = 1900;     // Объявляем переменную year
        if (year < 1584) { // Условный оператор if выполняется в случае если год меньше 1584 года
            System.out.println(year + " год не является високосным ");
        } else if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) { // Условный оператор  else if выполняется в случае если год больше 1584 года, кратен 4 и не кратен 100 или кратен 400
            System.out.println(year + " год является високосным "); //
        } else
            System.out.println(year + " год не является високосным");


        // Четвертое задание задание

        System.out.println("\nTask 4 \n");
        int deliveryDistance = 95; // Объявляем переменную магазина до клиента
        if (deliveryDistance <= 20) {  // Условный оператор if выполняется в случае если растояние 20 км и меньше
            System.out.println("Потребуется дней: 1");
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) { // Условный оператор else if выполняется в случае если растояние от 20 до 60 км
            System.out.println("Потребуется дней: 2");
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) { // Условный оператор else if выполняется в случае если растояние от 60 до 100 км
            System.out.println("Потребуется дней: 3");
        } else {  // Условный оператор else  выполняется в случае если растояние более 100 км
            System.out.println("Доставки нет");
        }

        // Четвертое задание задание

        System.out.println("\nTask 4 \n");
        int monthNumber = 12;

        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println(monthNumber + "-й месяц принадлежит к сезону зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println(monthNumber + "-й месяц принадлежит к сезону весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println(monthNumber + "-й месяц принадлежит к сезону лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println(monthNumber + "-й месяц принадлежит к сезону осень");
                break;
            default:
                System.out.println("Такого месяца не существует!");



        }

    }
}