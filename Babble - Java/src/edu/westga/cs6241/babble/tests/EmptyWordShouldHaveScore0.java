/**
 * 
 */
package edu.westga.cs6241.babble.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.westga.cs6241.babble.model.Word;

/**
 * Tests if a Word containing no letters has a score.
 * 
 * @author April Parmer
 * @version November 21, 2014
 *
 */
public class EmptyWordShouldHaveScore0 {

	/**
	 * Creates a Word with no letters, and assures that it has a score of 0.
	 */
	@Test
	public void testEmptyWordShouldHaveScore0() {
		Word word = new Word();
		
		assertEquals(0, word.getScore());
	}

}
