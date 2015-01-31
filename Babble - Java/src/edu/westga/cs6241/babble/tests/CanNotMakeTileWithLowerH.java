package edu.westga.cs6241.babble.tests;

import org.junit.Test;

import edu.westga.cs6241.babble.model.Tile;

/**
 * Tests if a Tile with the letter 'h' can be made.
 * 
 * @author April Parmer
 * @version November 21, 2014
 *
 */
public class CanNotMakeTileWithLowerH {

	/**
	 * Creates a Tile with the letter 'h' and point value of 4. Should throw IllegalArgumentException.
	 */
	@Test(expected=IllegalArgumentException.class)
	public void testCanNotMakeTileWithLowerH() throws IllegalArgumentException {
		Tile h = new Tile('h', 4);
		
	}

}
