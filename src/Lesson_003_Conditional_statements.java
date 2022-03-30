public class Lesson_003_Conditional_statements {
    public static void main(String[] args) {
//Task_01  Ссылка на скачивания приложения банка для смартфонов.

        System.out.println("*** Задание 1 \n");

        int clientOS = 1; // Переменная для определения ПО клиента банка.

        // Если у клиента IOS
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для IOS по ссылке");
            // Если у клиента Android
        } else if (clientOS == 0) {
            System.out.println("Установите версию приложения для Android по ссылке");
            // Если у клиента неизвестное ПО
        } else {
            System.out.println("Неизвестное ПО");
        }



//Task_02  Ссылки на скачивания приложения банка для смартфонов  ранее 2020 или старше.

        System.out.println("\n*** Задание 2 \n");

        int clientDeviceYear = 2015;
        String phoneIOS = "IOS";
        String phoneAndroid = "Android";

        if (phoneIOS == "IOS" && clientDeviceYear >= 2020) {
            System.out.println("Установите версию приложения для IOS по ссылке");
        } else if (phoneIOS == "IOS" && clientDeviceYear < 2020) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        if (phoneAndroid == "Android" && clientDeviceYear >= 2020) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        if (phoneAndroid == "Android" && clientDeviceYear < 2020) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }

//Task_03  Является ли год високосным.

        System.out.println("\n*** Задание 3 \n");

        int year = 2024; // Переменная для хранения числового значения года
        // год нужно разделить на 4 и если остаток будет равен 0 то год високосный!
        if(year % 4 == 0 ){
            System.out.println(year + " год является високосным.");
        }else{
            System.out.println(year + " год не является високосным.");
        }

//Task_04  Доставка банковских карт.

        System.out.println("\n*** Задание 4 \n");

        int deliveryDistance = 75; // Дистанция до клиента
        int deliveryTime = 1;      // Время доставки

        if(deliveryDistance > 0) {

            if (deliveryDistance <= 20) {
                System.out.println("Для доставки вашей банковской карты потребуется " + deliveryTime + " день.");
            } else if (deliveryDistance > 20 && deliveryDistance < 60) {

                System.out.println("Для доставки вашей банковской карты потребуется " + (deliveryTime + 1) + " дня ");
            } else {
                System.out.println("Для доставки вашей банковской карты потребуется " + (deliveryTime + 2) + " дня ");

            }

        }
        if(deliveryDistance < 0) {
            System.out.println("Введите корректно расстояние до адреса доставки");
        }

//Task_05  12 Месяцев.

        System.out.println("\n*** Задание 5 \n");

        int monthNumber = 12;

        switch (monthNumber){
            case 1:
                System.out.println("January - winter");
                break;
            case 2:
                System.out.println("February - winter");
                break;
            case 3:
                System.out.println("March - spring");
                break;
            case 4:
                System.out.println("April - spring");
                break;
            case 5:
                System.out.println("May - spring");
                break;
            case 6:
                System.out.println("Jun - summer");
                break;
            case 7:
                System.out.println("July - summer");
                break;
            case 8:
                System.out.println("August - summer");
                break;
            case 9:
                System.out.println("September - autumn");
                break;
            case 10:
                System.out.println("October - autumn");
                break;
            case 11:
                System.out.println("November - autumn");
                break;
            case 12:
                System.out.println("December - winter");
                break;
            default:
                System.out.println("Такого месяца на планете 'Земля' не существует!");


        }


    }
}
