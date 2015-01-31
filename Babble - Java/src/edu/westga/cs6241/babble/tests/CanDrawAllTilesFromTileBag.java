/**
 * 
 */
package edu.westga.cs6241.babble.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.westga.cs6241.babble.model.TileBag;

/**
 * Tests if the user can draw all 98 tiles from a TileBag.
 * 
 * @author April Parmer
 * @version November 21, 2014
 *
 */
public class CanDrawAllTilesFromTileBag {

	/**
	 * Sets up a TileBag with a full set of 98 tiles, draws all 98 tiles from the bag,
	 * and tests that the bag is empty.
	 */
	@Test
	public void testCanDrawAllTilesFromTileBag() {
		TileBag bag = new TileBag();
		
		for (int i = 0; i < 98; i++) {
			bag.drawTile();
		}
		
		assertTrue(bag.isEmpty());
	}
}
