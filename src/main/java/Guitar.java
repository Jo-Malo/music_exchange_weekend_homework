import Interfaces.IPlay;
import Interfaces.ISell;

public class Guitar extends Instrument implements IPlay{
    int numberOfStrings;


    public Guitar(String colour, String family, int numberOfStrings){
        super(colour, family, 150.00, 80.00);
        this.numberOfStrings = numberOfStrings;
    }

    public String play(String noise) {
        return "Guitar makes a twang noise";
    }

    public void addToIstock(ISell stock) {
    }

    public int getNumberOfStrings() {
        return this.numberOfStrings;
    }
}
