import java.util.Scanner;
public class GroceryStore {
    public  static void main(String[] args) {
        //Kullanıcıların manavdan almış oldukları ürünlerin kilogram değerlerine göre toplam tutarını ekrana yazdıran program.
        //Meyveler ve KG Fiyatları : Armut : 2,14 TL,Elma : 3,67 TL,Domates : 1,11 TL,Muz: 0,95 TL,Patlıcan : 5,00 TL

        double pear,apple,tomato,banana,eggplant;
        double pearPrice=2.14,applePrice=3.67,tomatoPrice=1.11,bananaPrice=0.95,eggplantPrice=5.0,totalPrice;
        Scanner input = new Scanner(System.in);

        System.out.print("Armutun kilogramı : ");
        pear=input.nextDouble();
        System.out.print("Elmanın kilogramı : ");
        apple=input.nextDouble();
        System.out.print("Domatesin kilogramı : ");
        tomato=input.nextDouble();
        System.out.print("Muzun kilogramı : ");
        banana=input.nextDouble();
        System.out.print("Patlıcanın kilogramı : ");
        eggplant=input.nextDouble();

        totalPrice=pear*pearPrice+apple*applePrice+tomato*tomatoPrice+banana*bananaPrice+eggplant*eggplantPrice;
        System.out.println("Toplam tutar : "+totalPrice);
    }
}
