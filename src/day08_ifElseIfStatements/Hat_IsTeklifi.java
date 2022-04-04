package day08_ifElseIfStatements;

import java.util.Scanner;

public class Hat_IsTeklifi {
    public static void main(String[] args) {
        /*Kullanicidan maas icin bir teklif isteyin ve asagidaki degerlere gore cevap azdirin.

        Teklif 80.000’in uzerinde ise “Kabul ediyorum” ,
        60 – 80.000 arasinda ise “Konusabiliriz”,
        60.000’nin altinda ise “Maalesef Kabul edemem” yazdirin*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen teklifinizi yaziniz");
        int maas= scanner.nextInt();
        if(maas>=80000){
            System.out.println("Kabul ediyorum");
    }else if(maas>=60000){
            System.out.println("Konusabiliriz");
}else {
            System.out.println("Malesef");}}}
