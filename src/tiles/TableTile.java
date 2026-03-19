package tiles;

import java.awt.image.BufferedImage;

import graphics.Assets;

public class TableTile extends Tile{

	public TableTile(int id) {
		super(Assets.table, id, Tile.TILEWIDTH, Tile.TILEWIDTH, Tile.TILEWIDTH);
	}

}
