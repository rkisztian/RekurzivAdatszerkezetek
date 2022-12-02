package hu.petrik.rekurzivadatszerkezet;

public class Main {
    public static void main(String[] args) {
        BinarisFa<Integer> bifa = new BinarisFa<>();
        int min = 0;
        int max = 20000;
        int elemszam =100;
        for (int i = 0; i < elemszam; i++) {
            int ertek = ((int) (Math.random() * (max - min + 1)))+ min;
            bifa.hozzaAd(ertek);
        }
        System.out.println(bifa);
    }
}
