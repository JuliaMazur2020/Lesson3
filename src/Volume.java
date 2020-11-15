import java.util.Scanner;

public class Volume {
    public static void main(String[] args) {
        double p=3.14;
        System.out.print("Введите радиус");
        Scanner scan=new Scanner(System.in);
        double r=scan.nextDouble();
        System.out.print("Введите высоту");
        double h=scan.nextDouble();
        System.out.println("Площадь поверхности конуса="+(2*p*r*(r+h)));
        System.out.println("Объем цилиндра="+(p*h*(r*r)));
    }
}
