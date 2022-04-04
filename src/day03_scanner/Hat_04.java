package day03_scanner;

import java.util.Scanner;

public class Hat_04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen isminizi giriniz");
        String kullaniciIsmi= scan.nextLine();
        System.out.println("Kullanicinin girdigi isim: " + kullaniciIsmi);
    }
}
