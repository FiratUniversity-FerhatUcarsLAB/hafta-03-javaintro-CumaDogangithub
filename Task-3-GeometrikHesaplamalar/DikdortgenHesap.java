public class DikdortgenHesap {
    public static void main(String[] args){
        double en = 4.5;
        double boy = 7.9;
        // Dikdörtgenin alanını hesapla
        double dikAlan = en * boy;

        // Dikdörtgenin çeviresini hesapla
        double dikCevre = (2*en) + (2*boy);

        //Hesaplamaları Ekrana Yazdır
        System.out.println("Dikdörtgen'in Alanı : " + dikAlan);
        System.out.println("Dikdörtgen'in Çevresi : " + dikCevre);

    }
}
