package entities;

import java.awt.image.BufferedImage;

import dev.Handler;
import graphics.Assets;
import tiles.Tile;

public class BurgerStation extends TileEntity{

	public BurgerStation(Handler handler, int x, int y, int z) {
		super(handler, x, y, z, Assets.burgerStation, Tile.TILEWIDTH * 2, Tile.TILEHEIGHT, Tile.TILEHEIGHT, 2, 1, 1);
	}

	@Override
	public void tick() {
		
	}

}
