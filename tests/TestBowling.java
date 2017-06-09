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
	public void test_PoeniPrvogFrejma() throws BowlingException{
		Frame frame = new Frame(6,3);
		String rezultat = frame.getScore();
		assertEquals("Poeni ostvareni u prvom frejmu", "9", rezultat);
	}
	
	@Test
	public void test_ProveraStrajkaFrejma() throws BowlingException{
		Frame frame = new Frame(10,0);
		assertTrue("Provera strajka", frame.isStrike());
	}
	
	@Test
	public void test_ProveraSperaFrejma() throws BowlingException{
		Frame frame = new Frame(6,4);
		assertTrue("Provera spera", frame.isSpare());
	}
	
	@Test(expected = BowlingException.class)
	public void test_ProveraPogresnihVrednostiPrvogBacanjaUFrejmu() throws BowlingException{
		Frame frame = new Frame(11,5);
	}
	
	@Test(expected = BowlingException.class)
	public void test_ProveraPogresnihVrednostiDrugogBacanjaUFrejmu() throws BowlingException{
		Frame frame = new Frame(7,5);
	}
	
	@Test(expected = BowlingException.class)
	public void test_ProveraNegativnihVrednostiPrvogBacanjaUFrejmu() throws BowlingException{
		Frame frame = new Frame(-7,5);
	}

}
