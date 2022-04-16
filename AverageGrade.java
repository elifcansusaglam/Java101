import java.util.Scanner;

public class AverageGrade {
    public static void main(String[] args){
       // Java ile Matematik, Fizik, Kimya, Türkçe, Tarih, Müzik derslerinin sınav puanlarını kullanıcıdan alan ve ortalamalarını hesaplayıp ekrana bastırılan programı yazın.
       // Aynı program içerisinde koşullu ifadeler kullanılarak, eğer kullanıcının ortalaması 60'dan büyük ise ekrana "Sınıfı Geçti" , küçük ise "Sınıfta Kaldı" yazsın.

        int math,physic,chemistry,turkish,history,music;
        Scanner input = new Scanner(System.in);

        System.out.print("Matematik Notunuz : ");
        math = input.nextInt();

        System.out.print("Fizik Notunuz : ");
        physic = input.nextInt();

        System.out.print("Kimya Notunuz : ");
        chemistry = input.nextInt();

        System.out.print("Türkçe Notunuz : ");
        turkish = input.nextInt();

        System.out.print("Tarih Notunuz : ");
        history = input.nextInt();

        System.out.print("Müzik Notunuz : ");
        music = input.nextInt();

        int sum = (math+physic+chemistry+turkish+history+music);
        double average = sum / 6.0;
        System.out.println("Ortalamanız : " + average);

        String result;
        result = (average > 60) ? "Sınıfı Geçti" : "Sınıfta Kaldı";
        System.out.print(result);

    }
}
