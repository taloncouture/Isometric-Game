package graphics;

import java.awt.image.BufferedImage;

public class Assets {
	
	private static final int width = 26, height = 26;
	
	public static BufferedImage grass, stone, table;
	public static BufferedImage[] player;
	public static BufferedImage terminal, terminal2, terminal3, terminal4;
	
	public static void init() {
		//SpriteSheet playerSheet = new SpriteSheet(ImageLoader.loadImage, ("/textures/frontright.png"));
		SpriteSheet grassSheet = new SpriteSheet(ImageLoader.loadImage("/textures/grass.png"));
		
		//player = playerSheet.crop(0, 0, width, height);
		player = new BufferedImage[8];
		player[0] = ImageLoader.loadImage("/textures/frontright.png");
		player[1] = ImageLoader.loadImage("/textures/frontleft.png");
		player[2] = ImageLoader.loadImage("/textures/backleft.png");
		player[3] = ImageLoader.loadImage("/textures/backright.png");
		player[4] = ImageLoader.loadImage("/textures/front.png");
		player[5] = ImageLoader.loadImage("/textures/right.png");
		player[6] = ImageLoader.loadImage("/textures/back.png");
		player[7] = ImageLoader.loadImage("/textures/left.png");
		
		grass = grassSheet.crop(0, 0, width, height);
		stone = ImageLoader.loadImage("/textures/stone.png");
		table = ImageLoader.loadImage("/textures/table.png");
		
		terminal = ImageLoader.loadImage("/textures/computer4.png");
		terminal2 = ImageLoader.loadImage("/textures/computer2_black.png");
		terminal3 = ImageLoader.loadImage("/textures/computer3.png");
		terminal4 = ImageLoader.loadImage("/textures/computer5.png");
	}

}
