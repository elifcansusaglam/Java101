import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        double number1,number2,result;
        int process;
        System.out.print("Lütfen 1. sayıyı giriniz : ");
        number1=input.nextDouble();
        System.out.print("Lütfen 2. sayıyı giriniz : ");
        number2=input.nextDouble();
        System.out.print("Toplama işlemi için '1' Çıkarma işlemi için '2' Bölme işlmei için '3' Çarpma işlemi için '4' tuşuna basınız : " );
        process=input.nextInt();

        switch (process){
            case 1:
                result=number1+number2;
                System.out.println("Toplama İşlemi Sonucunuz : "+result);
                break;
            case 2:
                result=number1-number2;
                System.out.println("Çıkarma İşlemi Sonucunuz : "+result);
                break;
            case 3:
                result=number1/number2;
                if(number2==0)
                    System.out.println("Sayı 0'a bölünemez : ");
                else
                    System.out.println("Bölme İşlemi Sonucunuz : "+result);
                break;
            case 4:
                result=number1*number2;
                System.out.println("Çarpma İşlemi Sonucunuz : "+result);
                break;
            default:
                System.out.println("Yanlış işlem seçtiniz!");
                break;
        }

    }
}
