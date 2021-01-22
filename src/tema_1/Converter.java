/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author YaIlushaMolodec
 */
public class Converter {

    public void convert() throws IOException {
        double a, b, g;
        System.out.println("Конвертер температур.");
        System.out.println("Если вы хотите узнать температуру в Фаренгейтах, введите 1, если в Цельсиях введите  2. нажмите enter");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String d = reader.readLine();
        a = Float.parseFloat(d);

        if (a == 1) {
            System.out.println("Введите количество градусов в Цельсиях и нажмите enter: ");
            String s = reader.readLine();
            b = Float.parseFloat(s);
            b = b * 1.8 + 32;
            System.out.println("Температура в Фаренгейтах равна: " + b + "F");
        } else if (a == 2) {
            System.out.println("Введите количество градусов в Фаренгейтах и нажмите enter: ");
            String s = reader.readLine();
            g = Float.parseFloat(s);
            g = (g - 32) * 5 / 9;
            System.out.println("Температура в Цельсиях равна: " + g + "C");
        } else if (a >= 2 || a <= 0) {
            System.out.println("Ошибка! Нужно ввести 1 или 2");
        }
         Figure[] figure = {new Rectangle(8, 12), 
                           new Triangle(5, 8, 5), 
                           new Circle(10)};
        
        for(Figure fig : figure)
            System.out.println(fig.getName() + ": area = " + fig.getArea());
    }
    

}
