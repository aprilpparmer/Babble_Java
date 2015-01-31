/**
 * 
 */
package edu.westga.cs6241.babble.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.westga.cs6241.babble.model.Tile;
import edu.westga.cs6241.babble.model.TileRack;

/**
 * Tests if duplicate Tiles are removed from the TileRack.
 * 
 * @author April Parmer
 * @version November 21, 2014
 *
 */
public class ShouldNotRemoveDuplicateTilesFromTileRack {

	/**
	 * Creates a TileRack with "CATAAAA", removes word "CAT", and asserts that "AAAA" can be
	 * made with the remaining tiles, and that 3 tiles are needed to make a full TileRack.
	 */
	@Test
	public void testShouldNotRemoveDuplicateTilesFromTileRack() {
		TileRack rack = new TileRack(7);
		
		Tile c = new Tile('C', 3);
		Tile a = new Tile('A', 1);
		Tile t = new Tile('T', 1);
		Tile a2 = new Tile('A', 1);
		Tile a3 = new Tile('A', 1);
		Tile a4 = new Tile('A', 1);
		Tile a5 = new Tile('A', 1);
		
		rack.append(c);
		rack.append(a);
		rack.append(t);
		rack.append(a2);
		rack.append(a3);
		rack.append(a4);
		rack.append(a5);
		
		rack.removeWord("CAT");
		
		assertTrue(rack.canMakeWordFrom("AAAA"));
		assertEquals(3, rack.getNumberOfTilesNeeded());
	}

}
