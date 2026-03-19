package dev;

import entities.EntityManager;
import input.KeyManager;
import worlds.World;

public class Handler {
	
	private Game game;
	private World world;
	private EntityManager entityManager;
	
	public Handler(Game game) {
		this.game = game;
	}
	
	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
	
	public EntityManager getEntityManager() {
		return entityManager;
	}
	
	public KeyManager getKeyManager() {
		return game.getKeyManager();
	}
	
	public Game getGame() {
		return game;
	}
	
	public void setGame(Game game) {
		this.game = game;
	}
	
	public World getWorld() {
		return world;
	}
	
	public void setWorld(World world) {
		this.world = world;
	}

}
