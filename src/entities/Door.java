package entities;

import java.awt.image.BufferedImage;

import dev.Config;
import dev.Handler;
import graphics.Assets;
import tiles.Tile;

public class Door extends TileEntity{

	public Door(Handler handler, double x, double y, double z) {
		super(handler, x, y, z, Assets.door_right, Tile.TILEWIDTH, Tile.TILEHEIGHT, Tile.TILEHEIGHT, 1, 1, 2);
		bounds.x = 8 * Config.SCALE_FACTOR;
		bounds.width = 11 * Config.SCALE_FACTOR;
	}

	@Override
	public void tick() {
		
	}

}
