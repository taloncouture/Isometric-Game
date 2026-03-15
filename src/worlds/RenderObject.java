package worlds;

import java.awt.Graphics;

import entities.Entity;
import tiles.Tile;

public class RenderObject {
	
	Tile tile;
	Entity entity;
	int x, y;
	public int depth;
	
	public RenderObject(Tile tile, int x, int y, int depth){
		this.tile = tile;
		this.x = x;
		this.y = y;
		this.depth = depth;
	}
	
	public RenderObject(Entity entity, int x, int y, int depth){
		this.entity = entity;
		this.x = x;
		this.y = y;
		this.depth = depth;
	}
	
		
	public void render(Graphics g) {
		if(tile != null) {
			tile.render(g, x, y);
		}
		if(entity != null) {
			entity.render(g);
		}
	}

}
