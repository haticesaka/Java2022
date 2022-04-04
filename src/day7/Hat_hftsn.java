package day7;

import java.util.Locale;
import java.util.Scanner;

public class Hat_hftsn {
    public static void main(String[] args) {
        //Soru 3) Kullanicidan gun ismini alin ve haftaici veya hafta sonu oldugunu yazdirin
        //  Ornek:      gun=Pazar output = “Hafta sonu”
        //      gun=Sali output = “Hafta ici”
        //  *** String icin equals method’unu kullanin
        // pazar veya cumartesi ise ===> hafta sonu
        // pazartesi veya sali veya carsamba veya persembe veya cuma ise ==> hafta ici
        // String case sensitive'dir
        // yani pazar, PAZAR,Pazar, PAzar bunlar hep farkli kelimelerdir
        // bu durumda String methodlarindan yardim aliriz
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen gün ismini  yaziniz");
        String günIsmi = scan.next().toLowerCase();
        if (günIsmi.equals("pazar")|| günIsmi.equals("cumartesi"))
        {
            String girdiginiz;
            System.out.println("girdiginiz gün haftasonu");}
        if (günIsmi.equals("pazartesi") || günIsmi.equals("sali")|| günIsmi.equals("carsamba")||
                günIsmi.equals("persembe") || günIsmi.equals("cuma"))
        {System.out.println("girdiginiz gün hafta ici");}
    }
}
