package Main;

import java.awt.event.KeyEvent;

import org.division.GameLoop;
import org.division.GameObject;
import org.division.Script;

public class CharacterScript extends Script{
	
	//this script signifies the functions and properties of the player character
	
	public GameObject player;
	
	private int moveSpeed = 7;
	private int velY = 0;
	private boolean canJump = false;
	public int jumpAmount = 15;
	public int gravity = 1;
	private boolean isPhysEnabled = true;
	
	String imgPath = "imgs/char.png";
	
	public CharacterScript() {
		
		player = new GameObject(0, 0, imgPath);
		GameLoop.addGameObject(player);
		player.isSolid = true;
		player.checkForCollisions = true;
		
		
	}

	@Override
	public void init() {
		
	}

	@Override
	public void update() {
		
		if(MainGame.input.isKeyDown(KeyEvent.VK_D)) {
			
			player.moveTo(player.x + moveSpeed, player.y);
		}
		
		if(MainGame.input.isKeyDown(KeyEvent.VK_A)) {
			
			player.moveTo(player.x - moveSpeed, player.y);
		}
		
		if(isPhysEnabled) {
			
			velY -= gravity;
		}
		
		if(player.checkCollisions(player.rect)) {
			
			velY = 0;
			canJump = true;
		}
		
		if(MainGame.input.isKeyDown(KeyEvent.VK_SPACE) && canJump == true) {
			
			velY = jumpAmount;
			canJump = false;
		}
		
		player.moveTo(player.x, player.y - velY);
	}

}
