import static org.junit.Assert.*;

import org.junit.Test;

public class TestBowling {

	@Test
	public void test_PocetakPartije() {
		Frame frame = new Frame();
		String rezultat =  frame.getScore();
		assertEquals("Rezultat prvog frejma na samom pocetku", "0", rezultat);
	}
	
	@Test 
	public void test_PoeniPrvogFrejma(){
		Frame frame = new Frame(6,3);
		String rezultat = frame.getScore();
		assertEquals("Poeni ostvareni u prvom frejmu", "9", rezultat);
	}

}
