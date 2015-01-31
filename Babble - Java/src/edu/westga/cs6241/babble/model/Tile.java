/**
 * 
 */
package edu.westga.cs6241.babble.model;

/** 
 * Defines a Tile in a game of Babble
 * 
 * @author April Parmer
 * @version November 7, 2014
 *
 */
public class Tile {
	private char letter;
	private int pointValue;
	
	/**
	 * Initialize instance variables.
	 * @param letter of the Tile
	 * @param pointValue of the Tile
	 */
	public Tile(char letter, int pointValue) {
		if (Character.isLetter(letter) && Character.isUpperCase(letter)) {
		this.letter = letter;
		} else {
			throw new IllegalArgumentException("Tile must have upper case letter");
		}
		
		if (pointValue < 1) {
			throw new IllegalArgumentException("Tile must have a point value greater than zero");
		} else {
		this.pointValue = pointValue;
		}
	}
	
	/**
	 * Gets the letter of the tile.
	 * @return letter of the tile
	 */
	 public char getLetter() {
		 return this.letter;
	 }
	 
	 /**
	  * Gets the point value for the tile.
	  * @return point value for the tile
	  */
	 public int getPointValue() {
		 return this.pointValue;
	 }

}
