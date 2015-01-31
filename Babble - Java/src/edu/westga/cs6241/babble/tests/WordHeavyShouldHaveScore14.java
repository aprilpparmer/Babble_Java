/**
 * 
 */
package edu.westga.cs6241.babble.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.westga.cs6241.babble.model.Tile;
import edu.westga.cs6241.babble.model.Word;

/**
 * Tests if getScore() functions properly.
 * 
 * @author April Parmer
 * @version November 21, 2014
 *
 */
public class WordHeavyShouldHaveScore14 {

	/**
	 * Creates Tiles "HEAVY", adds to Word, and gets the score of 14.
	 */
	@Test
	public void testWordHeavyShouldHaveScore14() {
		Tile h = new Tile('H', 4);
		Tile e = new Tile('E', 1);
		Tile a = new Tile('A', 1);
		Tile v = new Tile('V', 4);
		Tile y = new Tile('Y', 4);
		
		Word word = new Word();
		
		word.append(h);
		word.append(e);
		word.append(a);
		word.append(v);
		word.append(y);
		
		assertEquals(14, word.getScore());
	}
}
