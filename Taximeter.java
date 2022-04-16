import java.util.Scanner;

public class Taximeter {
    public static void main(String[] args){
        //Taksimetre KM başına 2.20 TL tutmaktadır.
        //Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
        //Taksimetre açılış ücreti 10 TL'dir.

        double km,taxiFare,kmPrice=2.2;
        int openingPrice=10;

        Scanner input = new Scanner(System.in);
        System.out.print("Kaç kilometre gideceğinizi giriniz : ");
        km = input.nextDouble();

        taxiFare= openingPrice + (km*kmPrice);
        if(taxiFare<=20){
            taxiFare=20;
            System.out.println("Taksi ücretiniz : "+taxiFare);
        }
        else {
            System.out.println("Taksi ücretiniz : "+taxiFare);
        }
    }
}
