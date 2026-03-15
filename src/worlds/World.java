package worlds;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

import dev.Config;
import dev.Utils;
import entities.Entity;
import tiles.Tile;


public class World {
	
	private int width, height, layers;
	private int spawnX, spawnY;
	private int[][][] tiles;
	
	public static final int OFFSETX = (Config.WIDTH / 2) - (Tile.TILEWIDTH / 2) - Config.SCALE_FACTOR;
	public static final int OFFSETY = (Tile.TILEHEIGHT);
	
	public World(String path) {
		loadWorld(path);
	}
	
	public void tick() {
		
	}
	
	public static int[] toIso(double x, double y, double z) {
		
		int[] isoCoords = new int[2];
		double tx = x / Tile.TILEWIDTH;
		double ty = y / Tile.TILEHEIGHT;
		int ix = OFFSETX + (int)((tx - ty) * (Config.HALF_W));
		int iy = OFFSETY + (int)(((tx + ty) * (Config.HALF_H)) - (z * Config.HALF_H * 2) - (z * Config.SCALE_FACTOR));
		
//		int snap = 2;
//		isoCoords[0] = (Math.round(ix / 6)) * 6;
//		isoCoords[1] = (Math.round(iy / 6)) * 6;
		
		isoCoords[0] = ix;
		isoCoords[1] = iy;
		
		
		return isoCoords;
	}
	
	public void addTilesToRenderList(List<RenderObject> renderList) {
		for(int z = 0; z < layers; z++) {
			for(int y = 0; y < height; y++) {
				for(int x = 0; x < width; x++) {
					
					if(getTile(x, y, z).getId() != 0) {
						int[] iso = toIso(x * Tile.TILEWIDTH, y * Tile.TILEHEIGHT, z);
						//int depth = (int)((x + y) * 1000 + z * 100000);
						int depth = (x + y) + (int)Math.floor((z));

						
						renderList.add(new RenderObject(getTile(x, y, z), iso[0], iso[1], depth));
						
						//getTile(x, y, z).render(g, toIso(x, y, z)[0], toIso(x, y, z)[1]);
					}
				}
			}
		}
	}
	
	public void render(Graphics g) {
				
		
	}
	
	public Tile getTile(int x, int y, int z) {
		 if(x < 0 || y < 0 || z < 0 || x >= width || y >= height || z >= layers) {
		        return Tile.airTile;
		}
		
		Tile t = Tile.tiles[tiles[x][y][z]];
		if(t == null) {
			return Tile.stoneTile;
		}
		return t;
	}
	
	private void loadWorld(String path) {
		String file = Utils.loadFileAsString(path);
		String[] tokens = file.split("\\s+");
		width = Utils.parseInt(tokens[0]);
		height = Utils.parseInt(tokens[1]);
		layers = Utils.parseInt(tokens[2]);
		spawnX = Utils.parseInt(tokens[3]);
		spawnY = Utils.parseInt(tokens[4]);
		
		tiles = new int[width][height][layers];
		for(int z = 0; z < layers; z++) {
			for(int y = 0; y < height; y++) {
				for(int x = 0; x < width; x++) {
					tiles[x][y][z] = Utils.parseInt(tokens[(z * width * height) + (x + y * width) + 5]);
				}
			}
		}
	}

}
