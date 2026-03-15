package entities;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import dev.Handler;
import tiles.Tile;


public abstract class Entity {
	
	protected double x, y, z;
	protected BufferedImage texture;
	protected Handler handler;
	
	protected Rectangle bounds;
	protected int width, height;
	
	public Entity(Handler handler, double x, double y, double z, BufferedImage texture, int width, int height) {
		this.x = x;
		this.y = y;
		this.z = z;
		this.texture = texture;
		this.handler = handler;
		this.width = width;
		this.height = height;
		
		bounds = new Rectangle(0, 0, width, height);
		
		int[] renderLayers = {(int)z / Tile.TILEHEIGHT, (int)(z / Tile.TILEHEIGHT) + 1};
	}
	
	public abstract void tick();
	
	public abstract void render(Graphics g);

}
