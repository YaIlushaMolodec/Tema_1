/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema_1;


import java.io.IOException;
import java.net.Socket;
import java.util.Arrays;
import java.util.Scanner;
public class Tema_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        int counter, num, array[];
 
        //Создаем объект Scanner для считывания чисел, введенных пользователем
        Scanner input = new Scanner(System.in);
        System.out.println("Введите количество элементов массива и нажмите enter: ");
        num = input.nextInt();
 
        // Создаем массив введенного пользователем размера
        array = new int[num];
 
        System.out.println("Введите " + num + " чисел через пробел и нажмите enter");
 
        //Заполняем массив, вводя элементы в консоль
        for (counter = 0; counter < num; counter++) {
            array[counter] = input.nextInt();
        }
 
        // печатаем массив перед пузырьковой сортировкой
        System.out.println("массив перед пузырьковой сортировкой : " + Arrays.toString(array));
 
        // сортируем массив
        bubbleSort(array);
 
        // печатаем массив после пузырьковой сортировки
        System.out.println("массив после пузырьковой сортировки : " + Arrays.toString(array));
    }
 
    // метод пузырьковой сортировки
    public static void bubbleSort(int[] num) throws IOException {
        int j;
        boolean flag = true;   // устанавливаем наш флаг в true для первого прохода по массиву
        int temp;   // вспомогательная переменная
 
        while (flag) {
            flag = false;    // устанавливаем флаг в false в ожидании возможного свопа (замены местами)
            for (j = 0; j < num.length - 1; j++) {
                if (num[j] < num[j + 1]) { // измените на > для сортировки по возрастанию
                    temp = num[j];         // меняем элементы местами
                    num[j] = num[j + 1];
                    num[j + 1] = temp;
                    flag = true;  // true означает, что замена местами была проведена
                }
            }
        }
        Converter c = new Converter();
        c.convert();
    
   
}
}