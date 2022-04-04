package day08_ifElseIfStatements;

import java.util.Scanner;

public class Hat_Emekli {
    public static void main(String[] args) {

        // Eger calisan kadinsa 60 yasindan buyuk oldugunda emekli olabilir,
        // calisan erkekse 65 yasindan buyukse emekli olabilir
        Scanner scan =new Scanner(System.in);
        System.out.println("Lutfen cinsiyetinizi yaziniz" +" \nKadin icin K" +
                " \n Erkek icin E harfini giriniz");
        char cinsiyet=scan.next().toUpperCase().charAt(0);
        System.out.println("Lutfen yasinizi giriniz");
        double yas=scan.nextDouble();
        if(cinsiyet=='K'){
            if(yas<0 || yas>120){
                System.out.println("girdiğiniz degeri kontrol ediniz");
            }
            else if(yas<60){
                System.out.println("Emekli olamazsiniz \nDaha "
                        + (60-yas)+ "yil calısman gerekir");
            }
            else{
                System.out.println("Emekli olabilirsin");
            }
        }
        else if (cinsiyet=='E'){
            if(yas<0 || yas>120)
                System.out.println("girdiginiz degeri kontrol ediniz");


        else if(yas<65){
            System.out.println("Emekli olamazsiniz\nDaha"
                    +(65-yas) +"caliman gerekir" );
        }
        else{
            System.out.println("Emekli olabilirsin");
        }

        }
        else{
        System.out.println("Lutfen gecerli bir harf giriniz");
    }}
}
