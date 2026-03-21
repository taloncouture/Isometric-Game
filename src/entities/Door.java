package entities;

import java.awt.image.BufferedImage;

import dev.Config;
import dev.Handler;
import graphics.Assets;
import tiles.Tile;

public class Door extends TileEntity{

	public Door(Handler handler, int x, int y, int z) {
		super(handler, x, y, z, Assets.door_right, Tile.TILEWIDTH, Tile.TILEHEIGHT, Tile.TILEHEIGHT, 1, 1, 2);
		bounds.x = 8 * Config.SCALE_FACTOR;
		bounds.width = 11 * Config.SCALE_FACTOR;
	}

	@Override
	public void tick() {
		
	}
	
	@Override
	public boolean isInteractive() {
		return true;
	}

}
