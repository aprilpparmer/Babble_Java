/**
 * 
 */
package edu.westga.cs6241.babble.tests;

import org.junit.Test;

import edu.westga.cs6241.babble.model.Tile;

/**
 * Tests if a Tile with a -4 point value can be made.
 * 
 * @author April Parmer
 * @version November 21, 2014
 *
 */
public class CanNotMakeTileWithPointValueNeg4 {

	/**
	 * Creates a Tile with the letter 'H' and a point value of -4. Should throw IllegalArgumentException,
	 */
	@Test(expected=IllegalArgumentException.class)
	public void testCanNotMakeTileWithPointValueNeg4() throws IllegalArgumentException {
		Tile h = new Tile('H', -4);
	}
}
