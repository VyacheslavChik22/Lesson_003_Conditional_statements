public class Lesson_003_Conditional_statements {
    public static void main(String[] args) {
//Task_01  ������ �� ���������� ���������� ����� ��� ����������.

        System.out.println("*** ������� 1 \n");

        int clientOS = 1; // ���������� ��� ����������� �� ������� �����.

        // ���� � ������� IOS
        if (clientOS == 1) {
            System.out.println("���������� ������ ���������� ��� IOS �� ������");
            // ���� � ������� Android
        } else if (clientOS == 0) {
            System.out.println("���������� ������ ���������� ��� Android �� ������");
            // ���� � ������� ����������� ��
        } else {
            System.out.println("����������� ��");
        }



//Task_02  ������ �� ���������� ���������� ����� ��� ����������  ����� 2020 ��� ������.

        System.out.println("\n*** ������� 2 \n");

        int clientDeviceYear = 2015;
        String phoneIOS = "IOS";
        String phoneAndroid = "Android";

        if (phoneIOS == "IOS" && clientDeviceYear >= 2020) {
            System.out.println("���������� ������ ���������� ��� IOS �� ������");
        } else if (phoneIOS == "IOS" && clientDeviceYear < 2020) {
            System.out.println("���������� ����������� ������ ���������� ��� iOS �� ������");
        }
        if (phoneAndroid == "Android" && clientDeviceYear >= 2020) {
            System.out.println("���������� ������ ���������� ��� Android �� ������");
        }
        if (phoneAndroid == "Android" && clientDeviceYear < 2020) {
            System.out.println("���������� ����������� ������ ���������� ��� Android �� ������");
        }

//Task_03  �������� �� ��� ����������.

        System.out.println("\n*** ������� 3 \n");

        int year = 2024; // ���������� ��� �������� ��������� �������� ����
        // ��� ����� ��������� �� 4 � ���� ������� ����� ����� 0 �� ��� ����������!
        if(year % 4 == 0 ){
            System.out.println(year + " ��� �������� ����������.");
        }else{
            System.out.println(year + " ��� �� �������� ����������.");
        }

//Task_04  �������� ���������� ����.

        System.out.println("\n*** ������� 4 \n");

        int deliveryDistance = 75; // ��������� �� �������
        int deliveryTime = 1;      // ����� ��������

        if(deliveryDistance > 0) {

            if (deliveryDistance <= 20) {
                System.out.println("��� �������� ����� ���������� ����� ����������� " + deliveryTime + " ����.");
            } else if (deliveryDistance > 20 && deliveryDistance < 60) {

                System.out.println("��� �������� ����� ���������� ����� ����������� " + (deliveryTime + 1) + " ��� ");
            } else {
                System.out.println("��� �������� ����� ���������� ����� ����������� " + (deliveryTime + 2) + " ��� ");

            }

        }
        if(deliveryDistance < 0) {
            System.out.println("������� ��������� ���������� �� ������ ��������");
        }

//Task_05  12 �������.

        System.out.println("\n*** ������� 5 \n");

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
                System.out.println("������ ������ �� ������� '�����' �� ����������!");


        }


    }
}
