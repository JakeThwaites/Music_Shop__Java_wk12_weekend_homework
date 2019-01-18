import Play.IPlay;
import Play.PlayString;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InstrumentTest {

    Instrument guitar;
    IPlay playString;

    @Before
    public void before(){
        playString = new PlayString();
        guitar = new Instrument(playString, 100, InstrumentType.String);
    }

    @Test
    public void canPlay(){
        assertEquals("string-a-ling!", guitar.play());
    }

    @Test
    public void hasPrice(){
        assertEquals(100, guitar.getPrice());
    }

    @Test
    public void hasType(){
        assertEquals(InstrumentType.String, guitar.getInstrumentType());
    }
}
