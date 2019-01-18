import java.util.ArrayList;

public class MusicShop {
    ArrayList<Instrument> instruments;
    String name;

    public MusicShop(String name){
        this.instruments = new ArrayList<>();
        this.name = name;
    }

    public ArrayList<Instrument> getInstruments() {
        return instruments;
    }

    public String getName() {
        return name;
    }
}
