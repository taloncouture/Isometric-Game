package tiles;

import java.awt.image.BufferedImage;

import graphics.Assets;

public class TerminalTile extends Tile{

	public TerminalTile(int id) {
		super(Assets.terminal2, id, Tile.TILEWIDTH, Tile.TILEWIDTH, Tile.TILEWIDTH);
	}

}
