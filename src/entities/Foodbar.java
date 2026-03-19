package entities;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import dev.Handler;
import graphics.Assets;
import tiles.Tile;

public class Foodbar extends TileEntity{
	

	public Foodbar(Handler handler, double x, double y, double z) {
		super(handler, x, y, z, Assets.foodbar, Tile.TILEWIDTH * 2, Tile.TILEHEIGHT, Tile.TILEHEIGHT, 2, 1, 1);
		bounds.height = Tile.TILEHEIGHT;
	}

	@Override
	public void tick() {
		
	}

}
