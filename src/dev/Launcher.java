package dev;

import display.Display;

public class Launcher {
	
	public static void main(String[] args) {
		
	    System.setProperty("sun.java2d.opengl", "true");

		
		Game game = new Game("Iso game", Config.WIDTH, Config.HEIGHT);
		game.start();
	}

}
