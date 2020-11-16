package pangramChecker;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class PangramCheckerTest {

	@Test
    public void test1() {
      String pangram1 = "The quick brown fox jumps over the lazy dog";
      PangramChecker pc = new PangramChecker();
      assertEquals(true, pc.check(pangram1));
    }
    @Test
    public void test2() {
      String pangram2 = "not quite";
      PangramChecker pc = new PangramChecker();
      assertEquals(false, pc.check(pangram2));
    }

}
