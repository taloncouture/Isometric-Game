package tiles;

import java.awt.image.BufferedImage;

public abstract class WallTile extends Tile{
	
	protected int height;

	public WallTile(BufferedImage texture, int id) {
		super(texture, id, Tile.TILEWIDTH, Tile.TILEWIDTH, Tile.TILEHEIGHT * 2);
	}

}
