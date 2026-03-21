package entities;

import java.awt.image.BufferedImage;

import dev.Handler;
import graphics.Assets;
import tiles.Tile;

public class DrinkStation extends TileEntity{

	public DrinkStation(Handler handler, int x, int y, int z) {
		super(handler, x, y, z, Assets.drinkStation, Tile.TILEWIDTH, Tile.TILEHEIGHT, Tile.TILEHEIGHT, 1, 1, 2);
	}

	@Override
	public void tick() {
		
	}

}
