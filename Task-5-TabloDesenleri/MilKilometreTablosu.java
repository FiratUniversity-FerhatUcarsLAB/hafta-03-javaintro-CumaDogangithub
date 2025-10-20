public class MilKilometreTablosu {
    public static void main(String[] args) {
        double milToKm=1.609;
        int mil1=1,mil2=5,mil3=10,mil4=20,mil5=50;
        double km1=(double) mil1*milToKm;
        double km2=(double) mil2*milToKm;
        double km3=(double) mil3*milToKm;
        double km4=(double) mil4*milToKm;
        double km5=(double) mil5*milToKm;

        System.out.println("Mil'den Km ye Dönüşüm Tablosu (1 Mil = 1,609)");
        System.out.println("Mil        Km");
        System.out.println(mil1+"  ------> "+km1);
        System.out.println(mil2+"  ------> "+km2);
        System.out.println(mil3+" ------> "+km3);
        System.out.println(mil4+" ------> "+km4);
        System.out.println(mil5+" ------> "+km5);

    }
}
