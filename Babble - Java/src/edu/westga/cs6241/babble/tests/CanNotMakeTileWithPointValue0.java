/**
 * 
 */
package edu.westga.cs6241.babble.tests;

import org.junit.Test;

import edu.westga.cs6241.babble.model.Tile;

/**
 * Tests if a Tile with a point value of 0 can be made.
 * 
 * @author April Parmer
 * @version November 21, 2014
 *
 */
public class CanNotMakeTileWithPointValue0 {

	/**
	 * Creates a Tile with the letter 'H' and point value of 0. Should throw IllegalArgumentException.
	 */
	@Test(expected=IllegalArgumentException.class)
	public void testCanNotMakeTileWithPointValue0() throws IllegalArgumentException {
		Tile h = new Tile('H', 0);
	}

}
