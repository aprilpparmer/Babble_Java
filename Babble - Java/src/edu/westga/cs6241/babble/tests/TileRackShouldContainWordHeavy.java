/**
 * 
 */
package edu.westga.cs6241.babble.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.westga.cs6241.babble.model.Tile;
import edu.westga.cs6241.babble.model.TileRack;

/**
 * Tests if a TileRack with the tiles "HEAVYHX" contain the word "HEAVY".
 * 
 * @author April Parmer
 * @version November 21, 2014
 *
 */
public class TileRackShouldContainWordHeavy {

	/**
	 * Creates a TileRack, adding the letters "HEAVYHX", and asserts that the word
	 * "HEAVY" CAN be made from the Tiles on the rack.
	 */
	@Test
	public void testTileRackShouldContainWordHeavy() {
		TileRack rack = new TileRack(7);
		
		Tile h1 = new Tile('H', 4);
		Tile e = new Tile('E', 1);
		Tile a = new Tile('A', 1);
		Tile v = new Tile('V', 4);
		Tile y = new Tile('Y', 4);
		Tile h2 = new Tile('H', 4);
		Tile x = new Tile('X', 8);
		
		rack.append(h1);
		rack.append(e);
		rack.append(a);
		rack.append(v);
		rack.append(y);
		rack.append(h2);
		rack.append(x);
		
		assertTrue(rack.canMakeWordFrom("HEAVY"));
		
	}

}
