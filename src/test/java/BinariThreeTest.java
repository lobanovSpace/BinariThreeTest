import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BinariThreeTest {
    @Test
    void main() {
        BinariThree.Three binariThree = new BinariThree.Three(21, new BinariThree.Three(7), new BinariThree.Three(8));
        int expected = 36;
        assertEquals(expected, binariThree.sum());
    }
}