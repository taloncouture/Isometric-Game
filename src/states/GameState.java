package states;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

import dev.Handler;
import entities.BurgerStation;
import entities.Door;
import entities.EntityManager;
import entities.Foodbar;
import entities.FryStation;
import entities.Player;
import entities.Rack;
import tiles.Tile;
import worlds.RenderObject;
import worlds.World;

public class GameState extends State{
	
	private World world;
	private EntityManager entityManager;
	
	private Player player;
	
	
	public GameState(Handler handler) {
		super(handler);
		world = new World("res/worlds/mainroom.txt");
		handler.setWorld(world);
		
		player = new Player(handler, 4 * Tile.TILEWIDTH, 4 * Tile.TILEWIDTH, 1 * Tile.TILEWIDTH);
		entityManager = new EntityManager();
		handler.setEntityManager(entityManager);
		entityManager.addEntity(player);
		
		Foodbar foodbar = new Foodbar(handler, 4 * Tile.TILEWIDTH, 1 * Tile.TILEWIDTH, 1 * Tile.TILEWIDTH);
		entityManager.addTileEntity(foodbar);
		
		Foodbar foodbar2 = new Foodbar(handler, 3 * Tile.TILEHEIGHT, 8 * Tile.TILEHEIGHT, 1 * Tile.TILEHEIGHT);
		entityManager.addTileEntity(foodbar2);
		
		FryStation frystation = new FryStation(handler, 1 * Tile.TILEWIDTH, 8 * Tile.TILEHEIGHT, 1 * Tile.TILEHEIGHT);
		entityManager.addTileEntity(frystation);
		
		BurgerStation burgerStation = new BurgerStation(handler, 5 * Tile.TILEWIDTH, 8 * Tile.TILEHEIGHT, 1 * Tile.TILEHEIGHT);
		entityManager.addTileEntity(burgerStation);
		
		Rack rack = new Rack(handler, 3 * Tile.TILEWIDTH, 8 * Tile.TILEHEIGHT, 2 * Tile.TILEHEIGHT);
		entityManager.addTileEntity(rack);
		
		Door door = new Door(handler, 12 * Tile.TILEWIDTH, 4 * Tile.TILEHEIGHT, 1 * Tile.TILEHEIGHT);
		entityManager.addTileEntity(door);
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
