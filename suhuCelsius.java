import java.util.Scanner;

public class suhuCelsius {
    public static void main(String[] args) {
        
        Scanner x = new Scanner(System.in);

        System.out.println("add Celsius");
        double C = x.nextDouble();

        System.out.println("opsi: ");
        System.out.println("1. Fahrenheit: ");
        System.out.println("2. Reamur: ");
        System.out.println("3. Kelvin: ");

        int opsi = x.nextInt();

        if (opsi == 1) {
            double F = (C * 9/5) + 32;
            System.out.println(C + " hasilnya " + F);
        }

        else if (opsi == 2) {
            double R = (C * 4/5);
            System.out.println(C + " hasilnya " + R);
        }
         else if (opsi == 3) {
            double K = (C + 273);
            System.out.println(C + " hasilnya " + K);
         }

         else{
            System.out.println("Not Valid");
         }
    }
    
}
