public class Piano extends Instrument {


    public Piano(String colour, String family){
        super(colour, family);
    }

    public String play(String noise) {
        return "Piano makes a plinkyplonky noise";
    }
}
