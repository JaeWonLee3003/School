package RPGgame;

import RPGgame.*;

public class RPGgame {

	public static void main(String[] args) {

		Player P = new Player();
		Warrior w = new Warrior();
		Magician S = new Magician();
		Rogue R = new Rogue();
		Monster M = new Monster();

		Game[] G = new Game[5];
		G[0] = new Player();
		G[1] = new Magician();
		G[2] = new Warrior();
		G[3] = new Rogue();
		G[4] = new Monster();

		

		showGame(G);

	}

	private static void showGame(Game[] G) {
		for (int i = 0; i < G.length; i++) {
			G[i].Attack();
		}
		
	}

}
