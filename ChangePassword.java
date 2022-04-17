import java.util.Scanner;

public class ChangePassword {
    public static void main(String[] args) {
        // Girilen şifre yanlış ise kullanıcıya şifresini sıfırlayıp sıfırlamayacağını soran,
        // Eğer kullanıcı sıfırlamak isterse yeni girdiği şifrenin hatalı girdiğini ve unuttuğu şifre ile aynı olmaması gerektiğini kontrol edip
        // şifreler aynı ise ekrana "Şifre oluşturulamadı, lütfen başka şifre giriniz." sorun yoksa "Şifre oluşturuldu" yazan program

        String password,newPassword,controller;
        Scanner input = new Scanner(System.in);

        System.out.print("Parolanızı giriniz : ");
        password=input.nextLine();
        if (password.equals("1234")){
            System.out.println("Giriş yaptınız!");
        }
        else{
            System.out.print("Şifrenizi sıfırlamak istiyorsanız e tuşuna basınız : ");
            controller=input.nextLine();
            if (controller.equals("E") || controller.equals("e")) {
                System.out.print("Yeni şifre giriniz:");
                newPassword=input.nextLine();
                if (newPassword.equals("1234")) {
                    System.out.println("Şifreniz önceki şifre ile aynı olamaz");
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                } else if (password.equals(newPassword)) {
                    System.out.println("Tekrar aynı hatalı şifreyi girdiniz!");
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                }
                else{
                    System.out.println("Şifre oluşturuldu");
                }
            }
            else{
                System.out.println("Şifreniz aynı kaldı.");
            }

        }
    }
}
