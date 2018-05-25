import Interfaces.IPlay;

public class Guitar extends Instrument implements IPlay{


    public Guitar(String colour, String family){
        super(colour, family);
    }

    public String play(String noise) {
        return "Guitar makes a twang noise";
    }

}
