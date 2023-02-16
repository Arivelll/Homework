import java.util.Arrays;
import java.util.Random;
import java.lang.System;
public class Main {
  public static void main(String[] args) {

    Phone phone = new Phone(94);
    System.out.println(phone.battery);


    int[] phoneNumber = new int[12];
    Random rand = new Random();
    for (int i = 0; i < phoneNumber.length; i++) {
      phoneNumber[i]= rand.nextInt(10);
      phoneNumber[0]=3;
      phoneNumber[1]=7;
      phoneNumber[2]=5;
      phoneNumber[3]=2;
      phoneNumber[4]=9;
    }
    System.out.println("Вывод массива в строку");
    System.out.println(Arrays.toString(phoneNumber));
    System.out.println("Вывод длины массива");
    System.out.println(phoneNumber.length);

    System.out.println("Тоже вывод массива в строку");
    String phoneNumberString = Arrays.toString(phoneNumber);
    System.out.println(phoneNumberString);

    System.out.print("Номер телефона: +");
    for (int i = 0; i < phoneNumber.length; i++){
      System.out.print(phoneNumber[i]);
    }
    /*
    System.out.print("Номер телефона: +");
    for (int c : phoneNumber){
      System.out.print(c);
    }
    */

    // Сортировка массива через sort
    int[] array = {5,3,9,7,1};
    System.out.println();
    System.out.println();
    System.out.println(Arrays.toString(array));
    Arrays.sort(array);
    System.out.println(Arrays.toString(array));



    // Сортировка массива пузырьком
    System.out.println();
    int[] array1 = {5,3,9,7,1};
    System.out.println(Arrays.toString(array1));
    boolean sorted = false;
    while (!sorted) {
      sorted = true;
      for (int i = 0; i < array1.length - 1; i++) {
        int j = i + 1;
        if (array1[i] > array1[j]) {
          int n = array1[i];
          array1[i] = array1[j];
          array1[j] = n;
          sorted = false;
        }
      }
      // Вывод массива в процессе сортировки
      System.out.println(Arrays.toString(array1));
    }

    // Сортировка массива по убыванию
    System.out.println();
    int[] array2 = {5,3,9,7,1};
    System.out.println(Arrays.toString(array2));
    boolean sorted2 = false;
    while (!sorted2) {
      sorted2 = true;
      for (int i = 0; i < array2.length - 1; i++) {
        int j = i + 1;
        if (array2[i] < array2[j]) {
          int m = array2[i];
          array2[i] = array2[j];
          array2[j] = m;
          sorted2 = false;
        }
      }
    }
    System.out.println(Arrays.toString(array2));

    // Сортировка char
    System.out.println();
    char[] name = {'I','v','a','n'};
    System.out.println(Arrays.toString(name));
    for(int i=0; i< name.length; i++) {
      System.out.print(name[i]);
    }
    System.out.println();
    for(char element: name) {
      System.out.print(element);
    }
    System.out.println();

    System.out.println();
    Phone.call();
    phone.charge();
    System.out.println(Phone.colour);
    Phone.colour = "White";
    System.out.println(Phone.colour);

    System.out.println();
    Circle.area();
  }
}