public class Instrument {
    private String colour;
    private String family;

    public Instrument(String colour, String family){
        this.colour = colour;
        this.family = family;
    }

    public String getColour(){
        return this.colour;
    }

    public String getFamily(){
        return this.family;
    }
}
