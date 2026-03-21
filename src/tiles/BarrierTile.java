package tiles;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import graphics.Assets;

public class BarrierTile extends Tile{

	public BarrierTile(int id) {
		super(Assets.stone, id, Tile.TILEWIDTH, Tile.TILEWIDTH, Tile.TILEHEIGHT);
	}
	
	@Override
	public void render(Graphics g, int x, int y) {
		
	}

}
