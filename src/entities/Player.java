package entities;

import java.awt.Color;
import java.awt.Graphics;

import dev.Config;
import dev.Handler;
import graphics.Assets;
import tiles.Tile;
import worlds.World;

public class Player extends Entity{
	
	private double speed = Config.SCALE_FACTOR * 1.5;
	private double[] velocity = {0, 0};
	

	public Player(Handler handler, double x, double y, double z) {
		super(handler, x, y, z, Assets.player[0], Tile.TILEWIDTH, Tile.TILEHEIGHT);
		bounds.x = Config.SCALE_FACTOR * 4;
		bounds.y = Config.SCALE_FACTOR * 4;
		bounds.width = width - Config.SCALE_FACTOR * 8;
		bounds.height = height - Config.SCALE_FACTOR * 8;
	}


	@Override
	public void tick() {
		
		double dx = 0;
		double dy = 0;
	

		
		if(handler.getKeyManager().right) {
			dx += 1;
			texture = Assets.player[0];
		}
		if(handler.getKeyManager().left) {
			dx -= 1;
			texture = Assets.player[2];
		}
		if(handler.getKeyManager().up) {
			dy -= 1;
			texture = Assets.player[3];
		}
		if(handler.getKeyManager().down) {
			dy += 1;
			texture = Assets.player[1];
		}
		if(handler.getKeyManager().down && handler.getKeyManager().right) {
			texture = Assets.player[4];
		}
		if(handler.getKeyManager().right && handler.getKeyManager().up) {
			texture = Assets.player[5];
		}
		if(handler.getKeyManager().up && handler.getKeyManager().left) {
			texture = Assets.player[6];
		}
		if(handler.getKeyManager().left && handler.getKeyManager().down) {
			texture = Assets.player[7];
		}
		
		
		if(dx != 0 || dy != 0) {
			double length = Math.sqrt(dx * dx + dy * dy);
			dx /= length;
			dy /= length;
		}
		
		double nextX = x + dx * speed;
		double nextY = y + dy * speed;

		boolean collisionX = 
		    tileCollision((int)(nextX + bounds.x),                (int)(y + bounds.y),                 (int)z) ||
		    tileCollision((int)(nextX + bounds.x + bounds.width), (int)(y + bounds.y),                 (int)z) ||
		    tileCollision((int)(nextX + bounds.x),                (int)(y + bounds.y + bounds.height), (int)z) ||
		    tileCollision((int)(nextX + bounds.x + bounds.width), (int)(y + bounds.y + bounds.height), (int)z) ||
	    	handler.getEntityManager().collidesWithEntity(this, nextX, y);


		boolean collisionY = 
		    tileCollision((int)(x + bounds.x),                (int)(nextY + bounds.y),                 (int)z) ||
		    tileCollision((int)(x + bounds.x + bounds.width), (int)(nextY + bounds.y),                 (int)z) ||
		    tileCollision((int)(x + bounds.x),                (int)(nextY + bounds.y + bounds.height), (int)z) ||
		    tileCollision((int)(x + bounds.x + bounds.width), (int)(nextY + bounds.y + bounds.height), (int)z) ||
	    	handler.getEntityManager().collidesWithEntity(this, x, nextY);


		if(!collisionX) x = nextX;
		if(!collisionY) y = nextY;
		
	}
	
	protected boolean tileCollision(int x, int y, int z) {
		
		int tileX = (int) x / Tile.TILEWIDTH;
		int tileY = (int) y / Tile.TILEHEIGHT;
		int tileZ = (int) z / Tile.TILEHEIGHT;
		
		if(handler.getWorld().getTile(tileX, tileY, tileZ) != Tile.airTile) {
			return true;
		}
		return false;
	}

	@Override
	public void render(Graphics g) {
		
		int ix = World.toIso(x, y, z)[0];
		int iy = World.toIso(x, y, z)[1];
		
		g.drawImage(this.texture, World.toIso(x, y, z)[0], World.toIso(x, y, z)[1], Tile.TILEWIDTH, Tile.TILEHEIGHT, null);
		
		//g.setColor(Color.blue);
		//g.fillRect((int)x, (int)y, width, height);
		//g.setColor(Color.pink);
		//g.fillRect((int)x + bounds.x, (int)y + bounds.y, bounds.width, bounds.height);
	}

}
