package day03_scanner;

public class Hatice_swap {
    public static void main(String[] args) {
      int  sayi1=5;
      int sayi2=8;
        System.out.println("swap'dan önce sayi1:" + sayi1 + "swap'dan önce sayi2:"+sayi2);
        int temp=sayi1;
        sayi1=sayi2;
        sayi2=temp;
        System.out.println(("swap'dan sonra sayi1:")+sayi2 +("swap'dan sonra sayı2:"+sayi2));
    }
}
