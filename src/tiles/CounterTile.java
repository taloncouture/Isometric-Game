package tiles;

import java.awt.image.BufferedImage;

import graphics.Assets;

public class CounterTile extends Tile{

	public CounterTile(int id) {
		super(Assets.counter, id, Tile.TILEWIDTH, Tile.TILEWIDTH, Tile.TILEWIDTH);
	}

}
