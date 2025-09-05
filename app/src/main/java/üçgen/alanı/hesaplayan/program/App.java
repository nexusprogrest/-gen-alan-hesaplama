package üçgen.alanı.hesaplayan.program;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        double alan , b , a , c ;
        Scanner girdi = new Scanner(System.in);
        double  u;
        System.out.println("köşe uzunluk 1");
        a = girdi.nextInt();

        System.out.println("köşe uzunluk 2");
        b = girdi.nextInt();

        System.out.println("köşe uzunluk 3");
        c = girdi.nextInt();
          
        u = (a + b + c) / 2.00;
        alan= Math.sqrt( u * (u - a)* (u - b) * (u - c));
        System.out.println(alan);   
    }
}

