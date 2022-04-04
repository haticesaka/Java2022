package day03_scanner;

public class Hat_02 {
    public static void main(String[] args) {


        int sayi1 = 3;
        int sayi2 = 7;
        System.out.println("Swap'dan önce sayi1: " + sayi1 + "sayi2:" + sayi2);
        int temp= sayi1;
        sayi1=sayi2;
        sayi2= temp;
        System.out.println("Swap'dan sonra sayi1: " + sayi1  + "sayi2: "  + sayi2);

    }
}