package ab411_02_collatz;

import ch.gibb.algorithmen.ab411_02_collatz.Collatz;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCollatz {

    private Collatz c;

    @BeforeEach
    public void setup() {
        c = new Collatz();
    }

    @Test
    public void testProceduralCollatz() {
        c.main(null);
        assertEquals(c.getInvocations(), 22, "Funktionen wurden nicht aufgerufen!");
    }
}
