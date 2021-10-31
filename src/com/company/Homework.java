package com.company;

import java.time.LocalDate;
import java.util.Arrays;

public class Homework {

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
        isLeapYear(year);

        //homeTask2
        int clientOs = 0; //0-IOs, 1-Android
        int phoneYear = 2021;
        checkVersion(clientOs, phoneYear);


        //homeTask3
       int deliveryDistance = 95;
       countDays(deliveryDistance);

        //homeTask4
        String abc = "aabccddefgghiijjkk";
        findDuplicates(abc);

        //homeTask5
        int[] numbers = {3, 2, 1, 6, 5};
        numbers = reverseArray(numbers);
        System.out.println(Arrays.toString(numbers));

        //homeTask6
        int [] array = generateRandomArray();
        float averageSum = mothMiddleSpendingFrom(array);
        System.out.println(averageSum + " - средняя сумма трат за месяц");

    }


    public static void isLeapYear(int year) {
        if (year % 400 == 0 || year % 100 ==0 || year % 4 == 0)
            System.out.println("Год является високосным");
        else
            System.out.println("Год не является високосным");
    }

    public static boolean checkPhoneYear(int phoneYear) {
        int currentYear = LocalDate.now().getYear();
        return phoneYear < currentYear; }

    public static void checkVersion(int clientOs, int phoneYear) {
        boolean deviceIsOld = checkPhoneYear(phoneYear);
        System.out.print("Установите ");
        if(deviceIsOld == true) {
            System.out.print(" LITE ");
        }
        if (clientOs == 0) {
                System.out.println(" версию для iOS");
            } else {
                    System.out.println(" версию для Android"); } }


    public static void countDays(int deliveryDistance) {
      if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней : 1");
      } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
           System.out.println("Потребуется дней: 2");
      } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется дней: 3"); } }

    public static void findDuplicates(String abc) {
        char[] letters = abc.toCharArray();
        char prevChar = Character.MAX_VALUE;
        for (char letter:letters) {
            if(letter == prevChar) {
                System.out.println("Найден дубликат " + letter);
                return; }
                prevChar=letter; }
                System.out.print("Дубликаты не найдены");   }


    public static int[] reverseArray(int[] numbers) {
      int head = 0;
      int tail = numbers.length - 1;
      while (head<tail) {
          int temp = numbers[head];
          numbers[head++] = numbers[tail];
          numbers[tail--] = temp;
      }
       return numbers; }

    public static float mothMiddleSpendingFrom(int[] arr) {
        int sum = calculateSum(arr);
        return mothMiddleSpending(sum, arr.length); }

    public static int calculateSum(int[] arr) {
        int sum = 0;
        for (int i : Homework.arr) {
            sum += i; }
        return sum;
    }
    public static float mothMiddleSpending(int sum, int elementAmount) {
        return sum /(float) elementAmount;
    }

}










