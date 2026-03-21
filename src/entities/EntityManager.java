package entities;

import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.List;

import tiles.Tile;
import worlds.RenderObject;
import worlds.World;

public class EntityManager {
	
	private List<Entity> entities = new ArrayList<>();
	private List<TileEntity> tileEntities = new ArrayList<>();
	
	public void addEntity(Entity e) {
		entities.add(e);
	}
	
	public void addTileEntity(TileEntity te) {
		tileEntities.add(te);
	}
	
	public List<TileEntity> getTileEntities(){
		return tileEntities;
	}
	
	public void tick() {
		for(Entity e : entities) {
			e.tick();
		}
		for(TileEntity te : tileEntities) {
			te.tick();
		}
	}
	
	
	public boolean collidesWithEntity(Entity self, double nextX, double nextY) {
	    for(Entity e : entities) {
	        if(e == self) continue; // skip self
	        //if(!e.isSolid()) continue; // skip non-solid entities
	        
	        Rectangle selfBounds = new Rectangle(
	            (int)nextX + self.bounds.x, 
	            (int)nextY + self.bounds.y, 
	            self.bounds.width, 
	            self.bounds.height
	        );
	        
	        if(selfBounds.intersects(e.getWorldBounds())) {
	            return true;
	        }
	    }
	    for(TileEntity te : tileEntities) {
	        if(te == self) continue; // skip self
	        //if(!e.isSolid()) continue; // skip non-solid entities
	        
	        Rectangle selfBounds = new Rectangle(
	            (int)nextX + self.bounds.x, 
	            (int)nextY + self.bounds.y, 
	            self.bounds.width, 
	            self.bounds.height
	        );
	        
	        if(selfBounds.intersects(te.getWorldBounds())) {
	            return true;
	        }
	    }
	    return false;
	}
	
	public void addEntitiesToRenderList(List<RenderObject> list) {

	    for(Entity e : entities) {

	        int[] iso = World.toIso(e.x, e.y, e.z);
	        //iso[1] -= e.height;
	        //int depth = (int)((e.x / ));
	        //int depth = ((int)((e.x + e.width / 2) / Tile.TILEWIDTH) + (int)((e.y + e.height / 2) / Tile.TILEHEIGHT)) + (int)(e.z  / Tile.TILEHEIGHT) + 1;
	        
	        int tx = (int) (e.x + (e.width / 2)) / Tile.TILEWIDTH;
	        int ty = (int) (e.y + (e.height / 2)) / Tile.TILEHEIGHT;
	        int tz = (int) e.z / Tile.TILEHEIGHT;
	        
	        int depth = ((tx + ty) + (int)Math.floor(tz) * 2) * 2 + 1; // odd numbers for entities

	   


	        list.add(new RenderObject(e, iso[0], iso[1], depth));
	    }
	    
	    for(TileEntity te : tileEntities) {
	    	int[] iso = World.toIso(te.x, te.y, te.z);
	    	//iso[1] = te.height;
	        //int depth = (int)((e.x / ));
	        //int depth = ((int)((e.x + e.width / 2) / Tile.TILEWIDTH) + (int)((e.y + e.height / 2) / Tile.TILEHEIGHT)) + (int)(e.z  / Tile.TILEHEIGHT) + 1;
	        
	    	for(int sz = 0; sz < te.footZ; sz++) {
				for(int sy = 0; sy < te.footY; sy++) {
					for(int sx = 0; sx < te.footX; sx++) {
//						int ix = World.toIso(te.x + (tx * Tile.TILEWIDTH), te.y + (ty * Tile.TILEHEIGHT), te.z + (ty * Tile.TILEHEIGHT), Tile.TILEWIDTH, Tile.TILEHEIGHT, Tile.TILEHEIGHT)[0];
//						int iy = World.toIso(te.x + (tx * Tile.TILEWIDTH), te.y + (ty * Tile.TILEHEIGHT), te.z + (ty * Tile.TILEHEIGHT), Tile.TILEWIDTH, Tile.TILEHEIGHT, Tile.TILEHEIGHT)[1];
//						int depth = ((tx + ty) + (int)Math.floor(tz) * 2) * 2 + 1;
						int tx = (int) (te.x + (te.width / 2)) / Tile.TILEWIDTH;
					    int ty = (int) (te.y + (te.height / 2)) / Tile.TILEHEIGHT;
					    int tz = (int) te.z / Tile.TILEHEIGHT;
					        
					    int depth = ((tx + ty) + (int)Math.floor(tz) * 2) * 2; // odd numbers for entities
						
					    list.add(new RenderObject(te, iso[0], iso[1], depth));
					}
				}
			}
	    	
	    	
//	        int tx = (int) (e.x + (e.width / 2)) / Tile.TILEWIDTH;
//	        int ty = (int) (e.y + (e.height / 2)) / Tile.TILEHEIGHT;
//	        int tz = (int) e.z;
//	        
//	        int depth = ((tx + ty) + (int)Math.floor(tz) * 2) * 2 + 1; // odd numbers for entities
//
//	   
//
//
//	        list.add(new RenderObject(e, iso[0], iso[1], depth));
	    }
	}
	
	


}
