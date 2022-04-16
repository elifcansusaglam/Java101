import java.util.Scanner;
public class CircleArea {
    public static void main(String[] args){
        //Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.
        //𝜋 sayısını = 3.14 alınız.
        //Formül : (𝜋 * (r*r) * 𝛼) / 360

        double area,pi=3.14,centerAngle,radius;
        Scanner input =new Scanner(System.in);

        System.out.print("Dairenin yarıçapını giriniz : ");
        radius=input.nextDouble();
        System.out.print("Dairenin merkez açısının ölçüsünü giriniz : ");
        centerAngle=input.nextDouble();

        area = pi* Math.pow(radius,2)*centerAngle/360;
        System.out.println("Daire diliminin alanı : "+area);
    }
}
