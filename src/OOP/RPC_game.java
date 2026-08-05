package OOP;

class Game {
	void play () {
		System.out.println("Lets Play ");
	}
}
class RPS extends Game{
	void play() {
		System.out.println("Playing a game ...!");
	}
	void showRules() {
		System.out.println("1.Rock beat scissor\n2.paper beats Rock\n3.Scissor beats Paper ");
	}
}

public class RPC_game {
	
	public static void main(String[] args) {
	
		//upcasting 
		Game g = new RPS();
		g.play();
		
		//downcasting 
		
		Game h = new RPS();
		RPS i =(RPS) h;
		i.play();
		i.showRules();
		
		
		Game y = new Game();
		y.play();
	}
	

}
