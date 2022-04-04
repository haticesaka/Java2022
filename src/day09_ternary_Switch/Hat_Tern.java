package day09_ternary_Switch;

import java.util.Scanner;

public class Hat_Tern {
    public static void main(String[] args) {
        // Ternary ile yapilan tum islemler if else ile de yapilabilir
        // If else yerine ternary tercih etme sebebi yapinin basit ve anlasilabilir olmasidir
        // Ternary icerisinde kompleks kodlar olmaz
        // sadece sonuc veya bizi sonuca goturen basit islemler olabilir
        // kullanicidan bir tamsayi alip tek mi cift mi yazdiran bir kod y
        Scanner scan=new Scanner(System.in);
        System.out.println("tam sayi giriniz");
        int sayi = scan.nextInt();
        System.out.println("Lutfen pozitif bir sayi giriniz");
        if (sayi%2==0){
            System.out.println("sayi cift");

    }
        else{
            System.out.println("Sayi tek");

}
        System.out.println(sayi%2==0 ? "sayi cift" : "sayi tek");
    }}
