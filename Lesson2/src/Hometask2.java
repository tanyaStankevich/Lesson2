import java.lang.reflect.Array;
import java.util.List;
import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import java.io.File;

// // Задание 1
// public class Hometask2 {

//     /**
//      * @param args
//      */
//     public static void main(String[] args) {
//         int[] mas = { 23, 6, 2, 0, 56, 99 };

//         for (int i = 0; i <= mas.length; i++) {
//             if (i > i + 1) {
//                 mas[i + 1] = mas[i];
//             }
//         }

//         System.out.println(mas);
//     }
// }

// Задание 2

public class Hometask2 {

    static int sum(int a, int b) {
        return a + b;
    }

    static int raz(int a, int b) {
        return a - b;
    }

    static int pr(int a, int b) {
        return a * b;
    }

    static int del(int a, int b) {
        return a / b;
    }

    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        try{
            String pathProject = System.getProperty("user.dir");
            
            
            Logger logger = Logger.getLogger(Hometask2.class.getName());
            logger.setLevel(Level.INFO);
            ConsoleHandler ch = new ConsoleHandler();
            logger.addHandler(ch);
            SimpleFormatter sFormat = new SimpleFormatter();
            ch.setFormatter(sFormat);

            Scanner iScanner = new Scanner(System.in);
            System.out.println("Введите первое число");
            int a = iScanner.nextInt();
            logger.log(Level.INFO, "Пользователь ввел число а");
            System.out.println("Введите второе число");

            logger.log(Level.INFO, "Пользователь ввел число b");
            int b = iScanner.nextInt();
            System.out.println("Выберите арифметическую операцию: сложение +, вычитание -, умножение *, деление /");
            String op = iScanner.next();

            logger.log(Level.INFO, "Пользователь выбрал арифметическую операцию ");

            switch (op) {
                case "+":
                    System.out.println(sum(a, b));
                    logger.log(Level.INFO, "Результат операции " + sum(a, b));
                    break;
                case "-":
                    System.out.println(raz(a, b));
                    logger.log(Level.INFO, "Результат операции " + raz(a, b));
                    break;
                case "/":
                    System.out.println(del(a, b));
                    logger.log(Level.INFO, "Результат операции " + del(a, b));
                    break;
                case "*":
                    System.out.println(pr(a, b));
                    logger.log(Level.INFO, "Результат операции " + pr(a, b));
                    break;
            }
        }
        catch{

        }
        

    }
}
