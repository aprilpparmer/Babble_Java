/**
 * 
 */
package edu.westga.cs6241.babble.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.westga.cs6241.babble.model.Tile;
import edu.westga.cs6241.babble.model.TileRack;

/**
 * Tests if a word can be removed from the TileRack when its Tiles are out of order.
 * 
 * @author April Parmer
 * @version November 21, 2014
 *
 */
public class ShouldRemoveWordWhenTilesOutOfOrder {

	/**
	 * Creates a TileRack with Tiles "TAACAAA" and removes the word "CAT" with "AAAA" left.
	 */
	@Test
	public void testShoudlRemoveWordWhenTilesOutOfOrder() {
		TileRack rack = new TileRack(7);
		

		Tile t = new Tile('T', 1);
		Tile a = new Tile('A', 1);		
		Tile a2 = new Tile('A', 1);	
		Tile c = new Tile('C', 3);
		Tile a3 = new Tile('A', 1);
		Tile a4 = new Tile('A', 1);
		Tile a5 = new Tile('A', 1);
		
		rack.append(t);
		rack.append(a);
		rack.append(a2);
		rack.append(c);
		rack.append(a3);
		rack.append(a4);
		rack.append(a5);
		
		rack.removeWord("CAT");
		
		assertTrue(rack.canMakeWordFrom("AAAA"));
		assertEquals(3, rack.getNumberOfTilesNeeded());
	}

}
