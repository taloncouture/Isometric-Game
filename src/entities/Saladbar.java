package entities;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import dev.Handler;
import graphics.Assets;
import tiles.Tile;

public class Saladbar extends TileEntity{
	

	public Saladbar(Handler handler, int x, int y, int z) {
		super(handler, x, y, z, Assets.saladBar, Tile.TILEWIDTH * 2, Tile.TILEHEIGHT, Tile.TILEHEIGHT, 2, 1, 1);
		bounds.height = Tile.TILEHEIGHT;
	}

	@Override
	public void tick() {
		
	}

}
