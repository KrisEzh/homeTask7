package com.company;

public abstract class Homework {

    static int[] arr = generateRandomArray();

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr; }

    public static void main(String[] args) {

        //homeTask1
        int year = 2021;
        task1(year);

        //homeTask2
        int clientOs = 1;
        int phoneYear = 2021;
        task2(clientOs, phoneYear);

        //homeTask3
        int deliveryDistance = 95;
        task3(deliveryDistance);

        //homeTask4
        String abc = "aabccddefgghiijjkk";
        task4(abc);

        //homeTask5
        int[] numbers = {3, 2, 1, 6, 5};
        task5(numbers);

        //homeTask6
        task6();

    }


    public static void task1(int year) {
        if (year % 400 == 0 || year % 100 ==0 || year % 4 == 0)
            System.out.println("Год является високосным");
        else
            System.out.println("Год не является високосным");
    }
    public static void task2(int clientOs, int phoneYear) {
        if (clientOs == 1 && phoneYear <= 2018)
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        if (clientOs == 1 && phoneYear > 2018)
            System.out.println("Установите обычную версию приложения для iOS по ссылке");
        if (clientOs == 0 && phoneYear <= 2018)
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        if (clientOs == 0 && phoneYear > 2018)
            System.out.println("Установите обычную версию для Android по ссылке");
    }
    public static void task3(int deliveryDistance) {
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней : 1");
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Потребуется дней: 2");
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется дней: 3");
    } }

    public static void task4(String abc) {
            char[] lettres = abc.toCharArray();
        for (int i = 0; i < abc.length(); i++) {
            for (int j = i + 1; j < abc.length(); j++)
                  if (lettres[i] == lettres[j]) {
                    System.out.print(lettres[j]); break;
                }
                 }
System.out.println();
        }



    public static void task5(int[] numbers) {
        for(int i = numbers.length - 1; i >=0; i--)
            System.out.print(numbers[i]);
        System.out.println();
    }

    public static void task6() {
        float all = 0f;
        for (float i : arr) {
            all += i;
        }
        float mothMiddleSpending = all / arr.length;
        System.out.println("Средняя сумма трат за месяц составила " + mothMiddleSpending + " рублей"); }

}









