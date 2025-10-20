public class HesapOzeti {
    public static void main(String[] args) {
        String listTitle =" Alışveriş Listesi: ";

        // Ürün Başlakları
        String proTitle1 = "NVIDIA 5070 Ti Ekran Kartı";
        String proTitle2 = "AMD Ryzen 7 9800X3D";
        String proTitle3 = "XPG Lancer Ram DDR5 32GB";

        // Ürün Miktarları
        int proCount1 = 1;
        int proCount2 = 1;
        int proCount3 = 4;

        // Adet Ürün Fiyatları
        int proPrice1 = 41000;
        int proPrice2 = 21576;
        int proPrice3 = 3700;

        //Alışveriş Sepeti Tablo

        System.out.println (listTitle);
        System.out.println ("Ürün Adı                      |   Ürün Miktarı   |   Ürün Adet Fiyatı");
        System.out.println ("---------------------------------------------------------------------");
        System.out.println (proTitle1 +"             "+proCount1 + "                 " + proPrice1 +" TL");
        System.out.println (proTitle2 +"                    "+proCount2 + "                 " + proPrice2 +" TL");
        System.out.println (proTitle3 +"               "+proCount3 + "                 " + proPrice3 +" TL");
        System.out.println ("");
        System.out.println ("Toplam Ürün Fiyatı ---> "+ (proCount1 * proPrice1 + proCount2 * proPrice2 + proCount3 * proPrice3) + " TL" );



    }
}
