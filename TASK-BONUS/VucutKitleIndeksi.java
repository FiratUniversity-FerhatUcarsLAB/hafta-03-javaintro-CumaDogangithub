public class VucutKitleIndeksi {
    public static void main(String[] args) {
        //Kilonuzu kilogram cinsinden giriniz
        int kilo = 80;
        //boyunuzu metre cinsinden giriniz
        double boy = 1.80;
        double Bmi = (double) kilo / (boy * boy);
        System.out.println("Vücut Kitle İndeksiniz : " + String.format("%.2f",Bmi));
    }
}
