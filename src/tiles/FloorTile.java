package tiles;

import java.awt.image.BufferedImage;

import graphics.Assets;

public class FloorTile extends Tile{

	public FloorTile(int id) {
		super(Assets.floor, id, Tile.TILEWIDTH, Tile.TILEWIDTH, Tile.TILEWIDTH);
	}
	

}
