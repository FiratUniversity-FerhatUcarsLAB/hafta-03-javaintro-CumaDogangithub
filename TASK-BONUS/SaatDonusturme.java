public class SaatDonusturme {
    public static void main(String[] args) {
        int girdiSaniye = 86251;

        // floorDiv girilen sayının tam kısmını alır
        int saat = Math.floorDiv(girdiSaniye, 3600);
        int kalan = girdiSaniye % 3600;
        int dakika = Math.floorDiv(kalan, 60);
        int saniye = kalan % 60;

        System.out.println("Girilen Saniyenin saat:dakika:saniye Formatı ---> " + saat + ":" + dakika + ":" + saniye);

    }
}
