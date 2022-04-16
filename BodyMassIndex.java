import java.util.Scanner;
public class BodyMassIndex {
     public static void main(String[] args) {
        // vücut kitle indeksi= Kilo (kg) / Boy(m) * Boy(m)

         double weight, height,bodyMassIndex;
         Scanner input =new Scanner(System.in);
         System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz :");
         height=input.nextDouble();
         System.out.print("Lütfen kilonuzu giriniz : ");
         weight=input.nextDouble();

         bodyMassIndex=weight/Math.pow(height,2);
         System.out.println("Vücut Kitle İndeksiniz : "+bodyMassIndex);


    }
}
