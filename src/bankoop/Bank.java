package bankoop;

import bankoop.bankiszolgaltatas.szamla.Hitelszamla;
import bankoop.bankiszolgaltatas.szamla.Megtakaritasiszamla;
import java.util.List;
import bankoop.bankiszolgaltatas.szamla.Szamla;
import java.util.LinkedList;
import tulajdonos.Tulajdonos;

public class Bank {
    private List<Szamla> bankszamlak;

    public Bank() {
        this.bankszamlak = new LinkedList<>();
    }
    
    public Szamla Szamlanyitas(Tulajdonos tulajdonos, int hitelkeret){
        Szamla szamla;
        if(hitelkeret > 0){
            szamla = new Hitelszamla(tulajdonos, hitelkeret);
        }
        else{
            szamla = new Megtakaritasiszamla(tulajdonos);
        }
        this.bankszamlak.add(szamla);
        return szamla;
    }
    
    public long Osszegyenleg(){
        long sum = 0;
        for (Szamla szamla : bankszamlak) {
            sum += szamla.getEgyenleg();
        }
        return sum;
    }
}
