package ab411_02_collatz;

import ch.gibb.algorithmen.ab411_02_collatz.Collatz;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCollatz {

    // private Collatz c;

    @BeforeEach
    public void setup() { }

    @Test
    public void testProceduralCollatz() {
        Collatz c = new Collatz();
        c.main(new String[] {"19"});
        assertEquals(c.getInvocations(), 0, "Funktionen wurden nicht aufgerufen!");
    }
}
