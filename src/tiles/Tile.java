package tiles;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import dev.Config;

public class Tile {
	
	public static Tile[] tiles = new Tile[256];
	public static Tile airTile = new AirTile(0);
	public static Tile grassTile = new GrassTile(1);
	public static Tile stoneTile = new StoneTile(2);
	public static Tile tableTile = new TableTile(3);
	public static Tile terminalTile = new TerminalTile(4);
	
	public static final int TILEWIDTH = 26 * Config.SCALE_FACTOR;
	public static final int TILEHEIGHT = 26 * Config.SCALE_FACTOR;
	
	protected BufferedImage texture;
	protected final int id;
	
	public Tile(BufferedImage texture, int id) {
		this.texture = texture;
		this.id = id;
		
		tiles[id] = this;
	}
	
	public void tick() {
		
	}
	
	public void render(Graphics g, int x, int y) {
		g.drawImage(texture, x, y, TILEWIDTH, TILEHEIGHT, null);
	}
	
	public int getId() {
		return id;
	}

}
