package entities;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.util.List;

import dev.Handler;
import tiles.Tile;
import worlds.World;

public abstract class TileEntity extends Entity {
	
	protected BufferedImage[] textures;
	protected int footX, footY, footZ;
	

	public TileEntity(Handler handler, double x, double y, double z, BufferedImage[] textures, int width, int height, int depth, int footX, int footY, int footZ) {
		super(handler, x, y, z, textures[0], width, height);
		
		bounds.width = width;
		bounds.height = height;
		this.textures = textures;
		this.footX = footX;
		this.footY = footY;
		this.footZ = footZ;
	}
	
	
	@Override
	public void render(Graphics g) {
//		int ix = World.toIso(x, y, z, Tile.TILEWIDTH, Tile.TILEWIDTH, Tile.TILEWIDTH)[0];
//		int iy = World.toIso(x, y, z, Tile.TILEWIDTH, Tile.TILEWIDTH, Tile.TILEWIDTH)[1];
		for(int tz = 0; tz < footZ; tz++) {
			for(int ty = 0; ty < footY; ty++) {
				for(int tx = 0; tx < footX; tx++) {
					int iso[] = World.toIso(x + ((tx - tz) * Tile.TILEWIDTH), y + ((ty - tz) * Tile.TILEHEIGHT), z + (tz * Tile.TILEHEIGHT));

					g.drawImage(textures[tx + ty + (tz * footX * footY)], iso[0], iso[1], Tile.TILEWIDTH, Tile.TILEHEIGHT, null);
				}
			}
		}
		
		
	}

}
