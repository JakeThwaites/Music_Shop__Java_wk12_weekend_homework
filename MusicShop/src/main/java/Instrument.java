import Play.IPlay;

public class Instrument {

    IPlay playBehaviour;
    Integer price;
    InstrumentType instrumentType;

    public Instrument(IPlay playBehaviour, Integer price, InstrumentType instrumentType) {
        this.playBehaviour = playBehaviour;
        this.price = price;
        this.instrumentType = instrumentType;
    }

    public IPlay getPlayBehaviour() {
        return playBehaviour;
    }

    public int getPrice() {
        return price;
    }

    public InstrumentType getInstrumentType() {
        return instrumentType;
    }



    public String play(){
        return playBehaviour.play();
    }
}
