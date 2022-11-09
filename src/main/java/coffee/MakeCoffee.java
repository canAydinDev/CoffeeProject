package coffee;

import java.util.Scanner;

public class MakeCoffee {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("Hangi Kahveyi istersiniz?\n1)Turk kahvesi icin ==> t\n2)Filtre kahve icin ==> f\n3)Espresso icin ==> e\ngiriniz");
        String kahveKodu=input.nextLine();
        System.out.println(KahveMetodlar.kahveYap(kahveKodu)+" hazirlaniyor...");

        System.out.println("Süt eklememizi ister misiniz ? (Evet veya Hayır olarak cevaplayınız)");
        String sutVarMi= input.nextLine();
        System.out.println(KahveMetodlar.sutEkleme(sutVarMi));

        System.out.println("Şeker ister misiniz ? (Evet veya hayır cevabını veriniz) : ");
        String sekerIsterMi=input.nextLine();
        KahveMetodlar.sekerIsteme(sekerIsterMi);

        System.out.println("Hangi boyutta olsun? (Büyük boy - orta boy - küçük boy olarak giriniz.) : ");
        String boyut=input.nextLine();
        KahveMetodlar.boyutSecimi(boyut);

        System.out.println(KahveMetodlar.kahveYap(kahveKodu)+boyut+ " olarak hazirlaniyor\nAfiyet olsun...");




    }

}
