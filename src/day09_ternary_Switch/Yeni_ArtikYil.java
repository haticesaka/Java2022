package day09_ternary_Switch;

import java.util.Scanner;

public class Yeni_ArtikYil {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen yil yaziniz");
        int yil=scan.nextInt();
        if(yil%4==0 && yil%100!=0 || yil%4==0 && yil%400==0){
            System.out.println("Artik yildir");
        }
        else{
            System.out.println("Artik yil degildir");
        }

    }
}
