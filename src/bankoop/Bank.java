package bankoop;

import bankoop.bankiszolgaltatas.szamla.Hitelszamla;
import java.util.List;
import bankoop.bankiszolgaltatas.szamla.Szamla;
import java.util.LinkedList;
import tulajdonos.Tulajdonos;

public class Bank {
    private List<Szamla> bankszamlak;

    public Bank() {
        this.bankszamlak = new LinkedList<>();
    }
    
    public void Szamlanyitas(Tulajdonos tulajdonos, int hitelkeret){
        Szamla szamla;
        if(hitelkeret > 0){
            szamla = new Hitelszamla(tulajdonos, hitelkeret);
        }
        else{
            szamla = new Megtakaritasszamla
        }
    }
}
