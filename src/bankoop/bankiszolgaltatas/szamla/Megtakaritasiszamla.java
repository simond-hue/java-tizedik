package bankoop.bankiszolgaltatas.szamla;

import tulajdonos.Tulajdonos;

public class Megtakaritasiszamla extends Szamla{

    private double kamat;
    
    public static double alapertelmezettKamat;
    
    public Megtakaritasiszamla(Tulajdonos tulajdonos) {
        super(tulajdonos);
        this.kamat = alapertelmezettKamat;
    }

    public void Kamatjovairas(){
        super.egyenleg += (super.egyenleg*this.kamat);
    }
    
    @Override
    public boolean Kivesz(int osszeg) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
