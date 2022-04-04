package day08_ifElseIfStatements;

import java.util.Scanner;

public class Hat_HarfCntrl {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        char karakter = scan.next().charAt(0);
        if ((karakter>='A' && karakter<='Z') || (karakter>='a' &&
                karakter<='z')){
            System.out.println("Girdiginiz karakter bir harf");
        }
        else{
            System.out.println("Girdiginiz karakter harf degil");
        }

    }
}
