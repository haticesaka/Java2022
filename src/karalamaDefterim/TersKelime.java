package karalamaDefterim;

import java.util.Scanner;

public class TersKelime {
    public static void main(String[] args) {

        /*Kullanicidan bir String isteyin ve Stringi tersine ceviren

        bir method yazin.*/
        Scanner scan= new Scanner (System.in);
        String str= "Hayalim var";
        for (int i = str.length()-1; i>=0 ; i--) {
            System.out.print(str.substring(i,i+1));

        }

        }

}
