package bankoop;

import bankoop.bankiszolgaltatas.kartya.Kartya;
import bankoop.bankiszolgaltatas.szamla.Hitelszamla;
import bankoop.bankiszolgaltatas.szamla.Szamla;
import tulajdonos.Tulajdonos;

public class BankOOP{

    public static void main(String[] args) {
        Bank khb = new Bank();
        Tulajdonos nyl = new Tulajdonos("Nyírő Levente");
        
        /*Szamla nylsz = new Hitelszamla(nyl,200000);*/
        Tulajdonos gizi = new Tulajdonos("Nyírőné Gizella");
        Szamla nylsz = khb.Szamlanyitas(nyl, 200000);
        Kartya gizikekartya = nylsz.UjKartya("111111111");
        Kartya nylkartya = nylsz.UjKartya("315135135135");
        nylsz.Betesz(20000);
        nylsz.Kivesz(100000);
        System.out.println(nylsz.getEgyenleg());
    }
    
}
