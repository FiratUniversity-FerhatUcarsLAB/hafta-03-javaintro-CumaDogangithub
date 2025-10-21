public class ParaBozma {
    public static void main(String[] args) {
        // Üç Basamaklı bir sayı giriniz
        int money = 648;
        int yuzlerBas= Math.floorDiv(money,100);
        int onlarBas= Math.floorDiv(money % 100,10);
        int birlerBas= money % 100 % 10;
        System.out.println (money + " TL = "+yuzlerBas+"x100 + "+onlarBas+"x10 + "+birlerBas+"x1 " );
    }
}
