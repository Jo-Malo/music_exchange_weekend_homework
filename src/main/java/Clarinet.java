import Enums.InstrumentType;
import Interfaces.IPlay;
import Interfaces.ISell;

public class Clarinet extends Instrument implements IPlay{
    String reedMaterial;


    public Clarinet(String colour, String family, String reedMaterial, InstrumentType type){
        super(colour, family, 300.00, 100.00, type);
        this.reedMaterial = reedMaterial;
    }

    public String play(String noise) {
        return "Clarinet makes a rootytooty noise";
    }

    public void addToIstock(ISell stock) {
    }

    public String getReedMaterial() {
        return this.reedMaterial;
    }

    public InstrumentType getInstrumentType() {
        return this.type;
    }
}
