package tiles;

import java.awt.image.BufferedImage;

import graphics.Assets;

public class Wall extends WallTile{

	public Wall(int id) {
		super(Assets.wallRight, id);
	}
	
	public Wall(int id, BufferedImage texture) {
		super(texture, id);
	}
	
	@Override
	public void generate(Tile[][] neighbors) {
		if(neighbors[0][1] == null) {
			this.texture = Assets.wallRight;
		}
		else if(neighbors[1][0] == null) {
			this.texture = Assets.wallLeft;
		}
	}
	
	

}
