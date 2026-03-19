package graphics;

import java.awt.image.BufferedImage;

public class Assets {
	
	private static final int width = 26, height = 26;
	
	public static BufferedImage grass, stone, table, floor, wallRight, wallLeft, wallCorner, wallCornerInner, counter;
	public static BufferedImage[] player;
	public static BufferedImage[] customer;
	public static BufferedImage terminal, terminal2, terminal3, terminal4;
	public static BufferedImage[] foodbar;
	public static BufferedImage[] fryStation;
	public static BufferedImage[] rack;
	public static BufferedImage[] burgerStation;
	public static BufferedImage[] door_right;
	public static BufferedImage[] drinkStation;
	public static BufferedImage[] milkshakeStation;
	public static BufferedImage[] saladBar;
	
	public static void init() {
		//SpriteSheet playerSheet = new SpriteSheet(ImageLoader.loadImage, ("/textures/frontright.png"));
		SpriteSheet grassSheet = new SpriteSheet(ImageLoader.loadImage("/textures/grass.png"));
		
		//player = playerSheet.crop(0, 0, width, height);
		player = new BufferedImage[8];
		player[0] = ImageLoader.loadImage("/textures/frontright2.png");
		player[1] = ImageLoader.loadImage("/textures/frontleft2.png");
		player[2] = ImageLoader.loadImage("/textures/backleft2.png");
		player[3] = ImageLoader.loadImage("/textures/backright2.png");
		player[4] = ImageLoader.loadImage("/textures/front2.png");
		player[5] = ImageLoader.loadImage("/textures/right2.png");
		player[6] = ImageLoader.loadImage("/textures/back2.png");
		player[7] = ImageLoader.loadImage("/textures/left2.png");
		
		customer = new BufferedImage[8];
		customer[0] = ImageLoader.loadImage("/textures/customer_frontright.png");
		customer[1] = ImageLoader.loadImage("/textures/customer_frontleft.png");
		customer[2] = ImageLoader.loadImage("/textures/customer_backleft.png");
		customer[3] = ImageLoader.loadImage("/textures/customer_backright.png");
		customer[4] = ImageLoader.loadImage("/textures/customer_front.png");
		customer[5] = ImageLoader.loadImage("/textures/customer_right.png");
		customer[6] = ImageLoader.loadImage("/textures/customer_back.png");
		customer[7] = ImageLoader.loadImage("/textures/customer_left.png");
		
		grass = grassSheet.crop(0, 0, width, height);
		stone = ImageLoader.loadImage("/textures/stone.png");
		table = ImageLoader.loadImage("/textures/table.png");
		floor = ImageLoader.loadImage("/textures/floor.png");
		wallRight = ImageLoader.loadImage("/textures/wall_right.png");
		wallLeft = ImageLoader.loadImage("/textures/wall_left.png");
		wallCorner = ImageLoader.loadImage("/textures/wall_corner.png");
		wallCornerInner = ImageLoader.loadImage("/textures/wall_corner_inner.png");
		counter = ImageLoader.loadImage("/textures/counter.png");
		
		foodbar = new BufferedImage[2];
		foodbar[0] = ImageLoader.loadImage("/textures/foodbar_0.png");
		foodbar[1] = ImageLoader.loadImage("/textures/foodbar_1.png");
		
		saladBar = new BufferedImage[2];
		saladBar[0] = ImageLoader.loadImage("/textures/saladbar_0.png");
		saladBar[1] = ImageLoader.loadImage("/textures/saladbar_1.png");
		
		fryStation = new BufferedImage[2];
		fryStation[0] = ImageLoader.loadImage("/textures/fry_station0.png");
		fryStation[1] = ImageLoader.loadImage("/textures/fry_station1.png");
		
		burgerStation = new BufferedImage[2];
		burgerStation[0] = ImageLoader.loadImage("/textures/burgerstation_0.png");
		burgerStation[1] = ImageLoader.loadImage("/textures/burgerstation_1.png");
		
		rack = new BufferedImage[2];
		rack[0] = ImageLoader.loadImage("/textures/rack0.png");
		rack[1] = ImageLoader.loadImage("/textures/rack1.png");
		
		door_right = new BufferedImage[2];
		door_right[0] = ImageLoader.loadImage("/textures/door_right_0.png");
		door_right[1] = ImageLoader.loadImage("/textures/door_right_1.png");
		
		drinkStation = new BufferedImage[2];
		drinkStation[0] = ImageLoader.loadImage("/textures/drinkstation_0.png");
		drinkStation[1] = ImageLoader.loadImage("/textures/drinkstation_1.png");
		
		milkshakeStation = new BufferedImage[4];
		milkshakeStation[0] = ImageLoader.loadImage("/textures/milkshakestation_0.png");
		milkshakeStation[1] = ImageLoader.loadImage("/textures/milkshakestation_1.png");
		milkshakeStation[2] = ImageLoader.loadImage("/textures/milkshakestation_2.png");
		milkshakeStation[3] = ImageLoader.loadImage("/textures/milkshakestation_3.png");
		
		
		terminal = ImageLoader.loadImage("/textures/computer4.png");
		terminal2 = ImageLoader.loadImage("/textures/computer2_black.png");
		terminal3 = ImageLoader.loadImage("/textures/computer3.png");
		terminal4 = ImageLoader.loadImage("/textures/computer5.png");
	}

}
