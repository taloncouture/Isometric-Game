package tiles;

import java.awt.image.BufferedImage;

import graphics.Assets;

public class StoneTile extends Tile{

	public StoneTile(int id) {
		super(Assets.stone, id, Tile.TILEWIDTH, Tile.TILEWIDTH, Tile.TILEWIDTH);
	}

}
