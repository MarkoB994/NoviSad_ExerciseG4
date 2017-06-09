import static org.junit.Assert.*;

import org.junit.Test;

public class TestBowling {

	@Test
	public void test_PocetakPartije() {
		Frame frame = new Frame();
		String rezultat =  frame.getScore();
		assertEquals("Rezultat prvog frejma na samom pocetku", "0", rezultat);
	}

}
