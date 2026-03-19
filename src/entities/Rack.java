package entities;

import java.awt.image.BufferedImage;

import dev.Handler;
import graphics.Assets;
import tiles.Tile;

public class Rack extends TileEntity{

	public Rack(Handler handler, double x, double y, double z) {
		super(handler, x, y, z, Assets.rack, Tile.TILEWIDTH * 2, Tile.TILEHEIGHT, Tile.TILEHEIGHT, 2, 1, 1);
	}

	@Override
	public void tick() {
		
	}

}
