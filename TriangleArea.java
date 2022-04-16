import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args){
        //Üç𝑔𝑒𝑛𝑖𝑛 ç𝑒𝑣𝑟𝑒𝑠𝑖 = 2𝑢
        //𝑢 = (a+b+c) / 2
        //Alan * Alan = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐)

        double triangleArea,trianglePerimeter,first,second,third,u;

        Scanner input =new Scanner(System.in);

        System.out.print("Üçgenin birinci kenarını giriniz : ");
        first=input.nextDouble();
        System.out.print("Üçgenin ikinci kenarını giriniz : ");
        second=input.nextDouble();
        System.out.print("Üçgenin üçüncü kenarını giriniz : ");
        third=input.nextDouble();

        trianglePerimeter=first+second+third;
        u=trianglePerimeter/2;
        triangleArea=Math.sqrt(u*(u-first)*(u-second)*(u-third));

        System.out.println("Üçgenin Alanı : "+triangleArea );

    }
}
