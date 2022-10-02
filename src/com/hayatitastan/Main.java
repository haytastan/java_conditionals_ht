package com.hayatitastan;
/**
 * Created by Dr. Hayati TAŞTAN on 2.10.2022
 */
public class Main {
    public static void main(String[] args) {

        //int sayi = 1918;
        //int sayi = 1923;
        int sayi = 1962;
        //int sayi = 2024;

        if(sayi<1920) {
            System.out.println("Henüz Türkiye Cumhuriyeti kurulmadı");
        }else if (sayi==1920 || sayi==1923) {
            System.out.println("Türkiye Cumhuriyeti kuruldu");
        }else if (sayi>1923 && sayi<=2023 ) {
            System.out.println("Türkiye Cumhuriyeti'nin ilk yüzyılı içindeyiz (1923-2023)");
        }else {
            System.out.println("\"Türkiye Cumhuriyeti'nin ikinci yüzyılı içindeyiz (2023 sonrası)");
        }

    }
}
