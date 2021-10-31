package com.company;

import java.util.Arrays;

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
        isLeapYear(year);

        //homeTask2
        int clientOs = 1; //0-IOs, 1-Android
        int phoneYear = 2021;
        checkPhoneYear(phoneYear);
        checkClientOs(clientOs);

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
        mothMiddleSpending();

    }


    public static void isLeapYear(int year) {
        if (year % 400 == 0 || year % 100 ==0 || year % 4 == 0)
            System.out.println("Год является високосным");
        else
            System.out.println("Год не является високосным");
    }

    public static void checkPhoneYear(int phoneYear) {
        if (phoneYear < 2019) {
            System.out.print("Установите облегченную версию ");}
        else { System.out.print("Установите обычную версию ");
        } }

    public static void checkClientOs(int clientOs) {
        if (clientOs == 0) {
                System.out.println("для iOS");
            } else {
                    System.out.println("для Android"); } }


    public static void countDays(int deliveryDistance) {
      if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней : 1");
      } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
           System.out.println("Потребуется дней: 2");
      } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется дней: 3"); } }

    public static void findDuplicates(String abc) {
        char[] lettres = abc.toCharArray();
        for (int i = 0; i < abc.length(); i++) {
          for (int j = i + 1; j < abc.length(); j++)
              if (lettres[i] == lettres[j]) {
                  System.out.print(lettres[j]); return;
                } else { System.out.print("Дубликаты не найдены"); return; } } }
    { System.out.println(); }

    public static int[] reverseArray(int[] numbers) {
        System.out.println();
      int head = 0;
      int tail = numbers.length - 1;
      while (head<tail) {
          int temp = numbers[head];
          numbers[head++] = numbers[tail];
          numbers[tail--] = temp;
      }
       return numbers; }


    public static float allSum() {
        float allSum = 0f;
        for (float i : arr) {
            allSum += i; }
        return allSum;
    }
    public static float mothMiddleSpending() {

        float mothMiddleSpending =  allSum() /  arr.length;
     System.out.println("Средняя сумма трат за месяц составила " + mothMiddleSpending + " рублей");
    return mothMiddleSpending; } }










