import java.util.Scanner;

public class Main {
    public static void main(String[] args)

    {
        Scanner inp = new Scanner(System.in);

        String userName,password,newPassword,yon;

        System.out.println("Kullanıcı adınızı giriniz: ");
        userName = inp.nextLine();

        System.out.println("Şifrenizi giriniz: ");
        password = inp.nextLine();

        //Sisteme kayıtlı Kullanıcı adı ve şifre: hadron / 1234

        switch (userName) {

            case "hadron":
                if (password.equals("1234")){

                    System.out.println("Giriş başarılı. Sisteme hoşgeldin "+userName+"!");
                }

                else{
                    System.out.println("Şifreniz yanlıştır. Sıfırlamak ister misiniz? (Evet için 'Y' / Hayır için 'N')");
                    yon = inp.nextLine();

                    if (yon.equals("Y")) {

                        System.out.println("Yeni şifreniz unuttuğunuzla aynı olmamalıdır, Lütfen yeni şifrenizi girin: ");
                        newPassword = inp.nextLine();

                        if (newPassword.equals("1234")){

                            System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                        }

                        else {
                            System.out.println("Şifre oluşturuldu.");
                        }
                    }

                    else if(yon.equals("N")){

                        System.out.println("Programdan çıkış yapılıyor.. ");
                    }

                    else{
                        System.out.println("Yanlış seçim yaptınız. Programdan çıkılıyor..");
                    }
                }
                break;

            default:
                System.out.println("Bilgilerinizi yanlış girdiniz. Lütfen tekrar deneyiniz.");
        }
    }
}