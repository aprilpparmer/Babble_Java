package edu.westga.cs6241.babble.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.westga.cs6241.babble.model.Tile;
import edu.westga.cs6241.babble.model.TileRack;

/**
 * Tests if the word HEAVY is removed from the TileRack.
 * 
 * @author april_000
 * @version November 21, 2014
 * 
 */
public class ShouldRemoveWordHeavyFromTileRack {

	/**
	 * Creates a TileRack with Tiles "HEAVYHX", removes the word "HEAVY", and assures that
	 * the number of Tiles needed equals 5 and the TileRack can no longer make the word.
	 */
	@Test
	public void testShouldRemoveWordHeavyFromTileRack() {
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
		
		rack.removeWord("HEAVY");
		
		assertEquals(5, rack.getNumberOfTilesNeeded());
		assertFalse(rack.canMakeWordFrom("HEAVY"));
	}

}
