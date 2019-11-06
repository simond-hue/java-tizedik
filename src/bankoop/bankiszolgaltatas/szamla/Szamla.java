package bankoop.bankiszolgaltatas.szamla;

import bankoop.bankiszolgaltatas.BankiSzolgaltatas;
import bankoop.bankiszolgaltatas.kartya.Kartya;
import tulajdonos.Tulajdonos;

public abstract class Szamla extends BankiSzolgaltatas {
    
    protected int egyenleg;
    
    public Szamla(Tulajdonos tulajdonos) {
        super(tulajdonos);
        this.egyenleg = 0;
    }

    public int getEgyenleg() {
        return egyenleg;
    }
    
    public void Betesz(int osszeg){
        this.egyenleg += osszeg;
    }
    
    public abstract boolean Kivesz(int osszeg);
    
    public Kartya UjKartya(String kartyaszam){
        return new Kartya(super.tulajdonos,this,kartyaszam);
    }
}
