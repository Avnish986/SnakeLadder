package com.play;

public class SnakeLadder {
	public static final int player_count=1;
	public static void main(String[] args) {
		System.out.println("Welcome to Snake and Ladder game");
		
		int position = 0;
		System.out.println("Player at : "+position);
		
		int valDice=(int)(Math.floor(Math.random()*10)%6)+1;
		System.out.println("player rolled no. "+valDice);

	}

}
