import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        double p=3.14;
        System.out.print("Введите радиус");
        Scanner scan=new Scanner(System.in);
        double r=scan.nextDouble();
        System.out.println("Площадь круга="+p*(r*r) );

    }
}
