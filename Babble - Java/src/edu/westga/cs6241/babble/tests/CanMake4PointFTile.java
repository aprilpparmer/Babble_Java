package edu.westga.cs6241.babble.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.westga.cs6241.babble.model.Tile;

/**
 * Tests that a 4-point 'F' Tile is made.
 * 
 * @author April Parmer
 * @version November 21, 2014
 *
 */
public class CanMake4PointFTile {

	/**
	 * Creates a Tile with letter of 'F' and a point value of 4.
	 */
	@Test
	public void testCanMake4PointFTile() {
		Tile f = new Tile('F', 4);
		
		assertEquals('F', f.getLetter());
		assertEquals(4, f.getPointValue());
	}

}
