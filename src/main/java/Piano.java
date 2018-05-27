import Enums.InstrumentType;
import Interfaces.IPlay;
import Interfaces.ISell;

public class Piano extends Instrument implements IPlay{
    String description;


    public Piano(String colour, String family, String description, InstrumentType type){
        super(colour, family, 2000.00, 800.00, type);
        this.description = description;
    }

    public String play(String noise) {
        return "Piano makes a plinkyplonky noise";
    }

    public String getDescription(){
        return "This piano is one of a kind";
    }

    public void addToIstock(ISell stock) {
    }

    public InstrumentType getInstrumentType() {
        return this.type;
    }
}
