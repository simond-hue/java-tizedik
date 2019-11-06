package bankoop.bankiszolgaltatas.kartya;

import bankoop.bankiszolgaltatas.BankiSzolgaltatas;
import bankoop.bankiszolgaltatas.szamla.Szamla;
import tulajdonos.Tulajdonos;

public class Kartya extends BankiSzolgaltatas {
    
    private String kartyaszam;
    private Szamla szamla;
    
    public Kartya(Tulajdonos tulajdonos, Szamla szamla, String kartyaszam) {
        super(tulajdonos);
        this.kartyaszam = kartyaszam;
        this.szamla = szamla;
    }

    public String getKartyaszam() {
        return kartyaszam;
    }

    public Szamla getSzamla() {
        return szamla;
    }
    
    public boolean Vasarlas(int osszeg){
        return this.szamla.Kivesz(osszeg);
    }
    
}
