/**
 * 
 */
package edu.westga.cs6241.babble.model;

import java.util.ArrayList;

/** 
 * Abstract class used to manipulate collections of Tiles.
 * 
 * @author April Parmer
 * @version November 7, 2014
 * 
 */
public abstract class TileGroup {
	protected ArrayList<Tile> tiles = new ArrayList<Tile>();
	
	/**
	 * Adds a tile to the group.
	 * @param tile to add
	 */
	public void append(Tile tile) {
		this.tiles.add(tile);
	}
	
	/**
	 * Removes a tile from the group.
	 * @param tile to remove
	 */
	public void remove(Tile tile) {
		this.tiles.remove(tile);
	}
	
	/**
	 * Returns a string representation of the tile group.
	 * @return string of tiles
	 */
	public String toString() {
		String out = "";
		for (int i = 0; i < this.tiles.size(); i++) {
			out += this.tiles.get(i).getLetter();
		}
		return out;
	}
	
	/**
	 * Gets the tiles in the group.
	 * @return tiles
	 */
	public ArrayList<Tile> getTiles() {
		return tiles;
	}
	
}
