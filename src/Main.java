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

        int year = 2021;     // Объявляем переменную year
        if (year < 1584) { // Условный оператор if выполняется в случае если год меньше 1584 года
            System.out.println(year + " год не является високосным ");
        } else if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным ");
        } else
            System.out.println(year + " год не является високосным");




    }
}