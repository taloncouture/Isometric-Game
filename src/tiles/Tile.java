package tiles;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import dev.Config;
import graphics.Assets;

public class Tile {
	
	public static Tile[] tiles = new Tile[1024];
	public static Tile airTile = new AirTile(0);
	public static Tile floorTile = new FloorTile(1);
	public static Tile stoneTile = new StoneTile(2);
	public static Tile tableTile = new TableTile(3);
	public static Tile terminalTile = new TerminalTile(4);
	public static Tile wallRight = new Wall(1000);
	public static Tile wallLeft = new Wall(1001, Assets.wallLeft);
	public static Tile wallCorner = new Wall(1002, Assets.wallCorner);
	public static Tile wallCornerInner = new Wall(1003, Assets.wallCornerInner);
	
	public static final int TILEWIDTH = 26 * Config.SCALE_FACTOR;
	public static final int TILEHEIGHT = 26 * Config.SCALE_FACTOR;
	
	protected BufferedImage texture;
	protected final int id;
	
	public int width, height, depth;
	
	public Tile(BufferedImage texture, int id, int width, int height, int depth) {
		this.texture = texture;
		this.id = id;
		
		tiles[id] = this;
		this.width = width;
		this.height = height;
		this.depth = depth;
	}
	
	public void tick() {
		
	}
	
	public void generate(Tile[][] neighbors) {
		
	}
	
	public void render(Graphics g, int x, int y) {
	    g.drawImage(texture, x, y - (depth - TILEHEIGHT), width, depth, null);

	}
	
	public int getId() {
		return id;
	}

	public void generate() {
		// TODO Auto-generated method stub
		
	}

}
