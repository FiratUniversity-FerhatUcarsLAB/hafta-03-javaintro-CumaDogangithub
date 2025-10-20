public class UcgenAlanHesap {
    public static void main (String[] args){
        //Üçgenin Kenarları
        int a=3,b=4,c=5,kokIci;

        kokIci = ((a+b+c)/2)*(((a+b+c)/2) - a)*(((a+b+c)/2) - b)*(((a+b+c)/2) - c);

        //Math.sqrt() içerisine girilen sayının karekökünü alır
        // Math.pow(İstenilensayı,Kökün derecesi) da kullanılabilir
        System.out.println ("İstenilen Üçgenin Alanı : " + Math.sqrt(kokIci));

    }
}
