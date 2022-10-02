package com.hayatitastan;
/**
 * Created by Dr. Hayati TAŞTAN on 2.10.2022
 */
public class Main {
    public static void main(String[] args) {

        // if blocks

        // find the largest number
        int sayi1 = 20;
        int sayi2 = 25;
        int sayi3 = 28;
        int enBuyuk = sayi1;

        if (enBuyuk<sayi2){
            enBuyuk = sayi2;
        }
        if (enBuyuk<sayi3){
            enBuyuk=sayi3;
        }
        System.out.println("En Büyük Sayı = " + enBuyuk);

        // switch blocks
        char grade = 'K';
        switch (grade) {
            case 'A':
            case 'B':
            case 'C':
            case 'D':
                System.out.println("Geçtiniz");
                break;
            case 'F':
                System.out.println("Kaldınız");
                break;
            default:
                System.out.println("Geçersiz not girdiniz");
        }

    }
}
