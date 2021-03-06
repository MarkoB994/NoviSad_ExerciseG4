import java.util.ArrayList;
import java.util.List;

// Before you commit and push write your student ID and finish time here.
// Finish time: 9:00
// Student ID: IT17-2015

public class BowlingGame {
	//a bowling game is made of (at least) 10 frames
	private List<Frame> frames = new ArrayList<Frame>();
	private Frame bonus;
	private boolean bonusZaSpare, bonusZaStrike;
	private int rezultat = 0;
	
	public BowlingGame(){}
	
	// adds a frame to the game
	public void addFrame(Frame frame) throws BowlingException{
		if(frames.size() == 10)
			throw new BowlingException("Igra je zavrsena");
		frames.add(frame);
		//Pozivam metodu setBonus da proveri da li je ostvaren neki od bonusa pri ovom frejmu
		setBonus(frame.getFirstThrow(), frame.getSecondThrow());
	}
	
	// Sets the bonus throws at the end of the game
	/* Koristio sam kao metodu koja se pozove prilikom dodavanja svakog frejma
	 * i proverava da li je ostvaren neki od bonusa za Strike ili za Spare
	 */
	public void setBonus(int firstThrow, int secondThrow) {
		if(bonusZaSpare){
			rezultat += firstThrow;
			bonusZaSpare = false;
		}
		if(bonusZaStrike){
			rezultat += (firstThrow + secondThrow);
			bonusZaStrike = false;
		}
		if(firstThrow + secondThrow == 10 && firstThrow != 10){
			bonusZaSpare = true;
		}
		if(firstThrow == 10){
			bonusZaStrike = true;
		}
		rezultat += (firstThrow + secondThrow);
	}
	
	// Returns the game score
	public int score(){
		//to be implemented: should return game score 
		return rezultat;
	}
	
	public String getNumberOfFrames(){
		return frames.size() + "";
	}
	
	public String getScore(){
		return score() + "";
	}
	
}
