package coffee;

import java.util.Scanner;

public class KahveMetodlar {
    public static String kahveYap(String kahveKodu){
        String hangiKahve="";
        if (kahveKodu.equalsIgnoreCase("t")){
            hangiKahve="Turk kahvesi";
        } else if (kahveKodu.equalsIgnoreCase("f")) {
            hangiKahve="Filtre kahve";
        } else if (kahveKodu.equalsIgnoreCase("e")) {
            hangiKahve="Espresso";
        }
        return hangiKahve;

    }
    public static String sutEkleme(String sutVarMi){
        String sutEkleme="";
        if (sutVarMi.equalsIgnoreCase("Evet")){
            sutEkleme="Sut ekleniyor";
        } else if (sutVarMi.equalsIgnoreCase("hayir")) {
            sutEkleme="Sut eklenmiyor";
        }
        return sutEkleme;

    }
    public static void sekerIsteme(String sekerIsterMi){
        Scanner input=new Scanner(System.in);
        String sekerEkle="";
        int kacSeker=0;
        if (sekerIsterMi.equalsIgnoreCase("evet")){
            System.out.println("Kaç şeker olsun?");
            kacSeker=input.nextInt();
            System.out.println(kacSeker+" seker ekleniyor...");

        } else if (sekerIsterMi.equalsIgnoreCase("hayir")) {
            System.out.println("seker eklenmiyor...");
        }

    }
    public static void boyutSecimi(String boyut){
        System.out.println("Kahveniz "+boyut+ " olarak hazirlaniyor");
    }
}
