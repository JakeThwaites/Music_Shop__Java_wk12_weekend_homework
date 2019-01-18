import Play.IPlay;
import Play.PlayString;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MusicShopTest {

    MusicShop musicShop;
    Instrument guitar;
    IPlay playBehaviour;


    @Before
    public void before(){
        musicShop = new MusicShop("Jake's music things");
        playBehaviour = new PlayString();
        guitar = new Instrument(playBehaviour, 100, InstrumentType.String);
    }

    @Test
    public void hasName(){
        assertEquals( "Jake's music things", musicShop.getName() );
    }

    @Test
    public void startsWithNoInstruments(){
        assertEquals(0, musicShop.getInstruments().size());
    }
}
