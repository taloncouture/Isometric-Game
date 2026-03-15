package entities;

import java.util.ArrayList;
import java.util.List;

import tiles.Tile;
import worlds.RenderObject;
import worlds.World;

public class EntityManager {
	
	private List<Entity> entities = new ArrayList<>();
	
	public void addEntity(Entity e) {
		entities.add(e);
	}
	
	public void tick() {
		for(Entity e : entities) {
			e.tick();
		}
	}
	
	public void addEntitiesToRenderList(List<RenderObject> list) {

	    for(Entity e : entities) {

	        int[] iso = World.toIso(e.x, e.y, e.z);
	        //int depth = (int)((e.x / ));
	        //int depth = ((int)((e.x + e.width / 2) / Tile.TILEWIDTH) + (int)((e.y + e.height / 2) / Tile.TILEHEIGHT)) + (int)(e.z  / Tile.TILEHEIGHT) + 1;
	        
	        int tx = (int) (e.x + (e.width / 2)) / Tile.TILEWIDTH;
	        int ty = (int) (e.y + (e.height / 2)) / Tile.TILEHEIGHT;
	        int tz = (int) e.z;
	        
	        int depth = (tx + ty) + (int)Math.floor(tz);
	   


	        list.add(new RenderObject(e, iso[0], iso[1], depth));
	    }
	}
	
	


}
