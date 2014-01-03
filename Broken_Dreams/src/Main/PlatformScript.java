package Main;

import org.division.GameLoop;
import org.division.GameObject;
import org.division.Script;

public class PlatformScript extends Script {
	
	//this script signifies the properties of a wood platform.
	
	public GameObject platform;
	public int x;
	public int y;
	String imgPath = "imgs/woodPlatform.png";
	
	public PlatformScript(int x, int y) {
		
		this.x = x;
		this.y = y;
	}
	

	@Override
	public void init() {
		
		platform = new GameObject(x, y, imgPath);
		GameLoop.addGameObject(platform);
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}

}
