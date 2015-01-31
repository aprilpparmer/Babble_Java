package edu.westga.cs6241.babble.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.westga.cs6241.babble.model.TileRack;

/**
 * Tests if an empty TileRack contains the word "DWELL".
 * 
 * @author April Parmer
 * @version November 21, 2014
 *
 */
public class EmptyTileRackShouldNotContainDwell {

	/**
	 * Creates an empty TileRack, and asserts that it can NOT make a word from "DWELL".
	 */
	@Test
	public void testEmptyTileRackShouldNotContainDwell() {
		TileRack rack = new TileRack(7);
		
		assertFalse(rack.canMakeWordFrom("DWELL"));
	}

}
