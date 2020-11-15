import java.util.Scanner;

public class ArithmeticAverage {
    public static void main(String[] args) {
        System.out.print("Введите 1 число");
        Scanner scan =new Scanner(System.in);
        int x= scan.nextInt();
        System.out.print("Введите 2 число");
        int y=scan.nextInt();
        System.out.print("Введите 3 число");
        int z=scan.nextInt();
        System.out.println("Среднее арифметическое="+((x+y+z)/3));

    }
}
