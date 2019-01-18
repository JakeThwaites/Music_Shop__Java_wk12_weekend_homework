import Play.PlayString;
import org.junit.Before;

public class InstrumentTest {

    Instrument guitar;

    @Before
    public void before(){
        guitar = new Instrument(PlayString, 100,  );
    }
}
