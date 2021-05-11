package business.concretes;

import business.abstracts.GameService;
import entities.Game;

public class GameManager implements GameService{

	@Override
	public void gameAdd(Game game) {
		System.out.println("Oyun eklendi !! " + game.getGameName());
		
	}

	@Override
	public void gameDelete(Game game) {
		System.out.println("Oyun silindi !! " + game.getGameName());
		
	}

	@Override
	public void gameUpdate(Game game) {
		System.out.println("Oyun güncellendi !! "+ game.getGameName());
		
	}

	
}
