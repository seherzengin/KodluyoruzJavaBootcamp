public class DizininHarmonikOrtalamasiniBulma {
    public static void main(String[] args) {

        int[] sayilar = {1,2,3,4,5};
        double sonuc=0.0;
        int i;

        for(i = 1 ; i <=sayilar.length; i++){
            sonuc += (1/i);
        }

        double ortalama = sayilar.length / sonuc;

        System.out.println("Sonuc : " + ortalama);
    }
}
