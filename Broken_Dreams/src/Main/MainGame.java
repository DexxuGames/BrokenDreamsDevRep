package Main;

import java.awt.Graphics;

import org.division.Game;
import org.division.GameApplication;
import org.division.GameLoop;
import org.division.Scenery;

public class MainGame extends Game {
	
	//this class is the main setting and properties/mechanics of the game.

	public static void main(String[] args) {
		
		MainGame main = new MainGame();
		main.title = "BrokenDreams";
		main.gameObjectCount = 3;
		main.sceneObjectCount = 1;
		main.scriptCount = 3;
		GameApplication.start(main);
		
	}

	@Override
	public void draw(Graphics arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void init() {
		
		Scenery background = new Scenery(0, 0, 1, "imgs/fez.jpg");
		GameLoop.addSceneObject(background);
		
		CharacterScript playerScript = new CharacterScript();
		GameLoop.addScript(playerScript);
		
		PlatformScript pl1 = new PlatformScript(0, 100);
		GameLoop.addScript(pl1);
		
		PlatformScript pl2 = new PlatformScript(150, 200);
		GameLoop.addScript(pl2);
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}

}
