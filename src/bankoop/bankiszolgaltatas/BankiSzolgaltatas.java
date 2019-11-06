package bankoop.bankiszolgaltatas;

import tulajdonos.Tulajdonos;

public abstract class BankiSzolgaltatas {
    protected Tulajdonos tulajdonos;

    public BankiSzolgaltatas(Tulajdonos tulajdonos) {
        this.tulajdonos = tulajdonos;
    }

    public Tulajdonos getTulajdonos() {
        return tulajdonos;
    }
    
    
}
