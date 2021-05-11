package business.abstracts;

import entities.Game;

public interface GameService {
	
	void gameAdd(Game game);
	void gameDelete(Game game);
	void gameUpdate(Game game);
	
}
