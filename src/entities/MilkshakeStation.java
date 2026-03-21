package entities;

import java.awt.image.BufferedImage;

import dev.Handler;
import graphics.Assets;
import tiles.Tile;

public class MilkshakeStation extends TileEntity{

	public MilkshakeStation(Handler handler, int x, int y, int z) {
		super(handler, x, y, z, Assets.milkshakeStation, Tile.TILEWIDTH, Tile.TILEHEIGHT * 2, Tile.TILEHEIGHT, 1, 2, 2);
	}

	@Override
	public void tick() {
		
	}

}
