package hu.petrik.rekurzivadatszerkezet;

public class BinarisFa <T extends Comparable> {
    private Node gyoker;

    public void hozzaAd(T ertek){
        if (this.gyoker == null){
            this.gyoker = new Node(ertek);
        }else {
            this.gyoker.hozzaAd(ertek);
        }
    }

    @Override
    public String toString(){
        if (this.gyoker == null){
            return  "";
        }
        return this.gyoker.toString();
    }

    private class Node{
        private T ertek;
        private Node bal;
        private Node jobb;


        public Node(T ertek) {
            this.ertek = ertek;
            this.bal = null;
            this.jobb = null;
        }

        public void hozzaAd(T ertek) {
            if (ertek.compareTo(this.ertek) < 0){
                if (this.bal == null){
                    this.bal = new Node(ertek);
                }else {
                    this.bal.hozzaAd(ertek);
                }
            }else {
                if (this.jobb == null){
                    this.jobb = new Node(ertek);
                } else {
                    this.jobb.hozzaAd(ertek);
                }
            }
        }
            @Override
            public String toString(){
                String s = "";
                if (this.bal != null){
                    s+=this.bal + ",";
                }
                s+=this.ertek;
                if (this.jobb != null){
                    s+= "," + this.jobb;
                }

                return s;
        }
    }
}
