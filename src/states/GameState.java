package states;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

import dev.Handler;
import entities.EntityManager;
import entities.Player;
import tiles.Tile;
import worlds.RenderObject;
import worlds.World;

public class GameState extends State{
	
	private World world;
	private EntityManager entityManager;
	
	private Player player;
	
	
	public GameState(Handler handler) {
		super(handler);
		world = new World("res/worlds/world1_0.txt");
		handler.setWorld(world);
		
		player = new Player(handler, 2 * Tile.TILEWIDTH, 2 * Tile.TILEHEIGHT, 1);
		entityManager = new EntityManager();
		entityManager.addEntity(player);
	}

	@Override
	public void tick() {

		entityManager.tick();
	}

	@Override
	public void render(Graphics g) {
//		world.render(g);
//		player.render(g);
		List<RenderObject> renderList = new ArrayList<>();

		world.addTilesToRenderList(renderList);
		entityManager.addEntitiesToRenderList(renderList);

		renderList.sort((a, b) -> Integer.compare(a.depth, b.depth));

		for(RenderObject obj : renderList)
		    obj.render(g);
		
		
	}

}
