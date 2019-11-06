package bankoop.bankiszolgaltatas.szamla;

import tulajdonos.Tulajdonos;

public class Hitelszamla extends Szamla{

    private int hitelkeret;
    
    public Hitelszamla(Tulajdonos tulajdonos, int hitelkeret) {
        super(tulajdonos);
        this.hitelkeret = hitelkeret;
    }

    @Override
    public boolean Kivesz(int osszeg) {
        boolean sikeresPenzFelvetel = false;
        if((super.egyenleg+this.hitelkeret) >= osszeg){
            super.egyenleg -= osszeg;
            sikeresPenzFelvetel = true;
        }
        return sikeresPenzFelvetel;
    }
}
