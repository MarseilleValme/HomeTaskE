import java.util.Scanner;

//Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
//Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str;
        System.out.println("Введите строку");
        str = scanner.nextLine();
        if (str.isEmpty()){
            throw new IllegalArgumentException("Пустые строки вводить нельзя");
            }
        else
            System.out.println(str);
    }
}
