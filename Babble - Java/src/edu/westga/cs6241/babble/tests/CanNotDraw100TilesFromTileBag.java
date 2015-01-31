/**
 * 
 */
package edu.westga.cs6241.babble.tests;

import org.junit.Test;

import edu.westga.cs6241.babble.model.TileBag;

/**
 * Tests if the user can not draw 100 tiles from a TileBag.
 * 
 * @author April Parmer
 * @version November 21, 2014
 *
 */
public class CanNotDraw100TilesFromTileBag {

	/**
	 * Creates a TileBag with 98 Tiles, and attempts to draw 100 Tiles. IllegalStateException expected.
	 * 
	 * @throws IllegalStateException
	 */
	@Test(expected=IllegalStateException.class)
	public void testCanNotDraw100TilesFromTileBag() throws IllegalStateException {
		TileBag bag = new TileBag();
		
		for (int i = 0; i < 100; i++) {
			bag.drawTile();
		}
	}

}
