//Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
//и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению
//приложения, вместо этого, необходимо повторно запросить у пользователя ввод данных.

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

//        System.out.println(floatNumberRecursion());
        System.out.println(floatNumberWhile());
    }
    public static float floatNumberRecursion() {
        float number = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите дробное число");

        try {
            number = scanner.nextFloat();
        } catch (InputMismatchException e) {
            floatNumberRecursion();
        }
// При вводе числа после попыток ввода строки метод возвращает 0. Победить не смог.
        return number;
    }

    public static float floatNumberWhile() {
        Float number = null;
        String str;
        Scanner scanner = new Scanner(System.in);

        while (number == null){
            System.out.println("Введите дробное число");
            str = scanner.nextLine();

            if (!(new Scanner(str).hasNextFloat())) {
                System.out.println("Введены некорректные данные");
            } else {
                number = Float.parseFloat(str);
            }
        }

        return number;
    }
}