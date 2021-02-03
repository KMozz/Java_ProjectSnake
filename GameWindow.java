import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;


@SuppressWarnings("serial")
public class GameWindow extends JFrame {
	
	private Rect background;
	private Rect rect;
	private Rect rect2;
	private Rect rect3;
	private Rect rect4;
	
	public GameWindow() {
		background = new Rect(0, 0, Constants.WINDOW_WIDTH, Constants.WINDOW_HEIGHT, Constants.BACKGROUND_COLOR);
		rect = new Rect(30, 70, 200, 80, Color.GREEN);
		rect2 = new Rect(270, 70, 200, 80, Color.RED);
		rect3 = new Rect(30, 190, 200, 80, Color.YELLOW);
		rect4 = new Rect(270, 190, 200, 80, Color.BLUE);
		
		
		setTitle(Constants.GAME_TITLE);
		setSize(Constants.WINDOW_WIDTH, Constants.WINDOW_HEIGHT);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setVisible(true);
	}
	
	@Override
	public void paint(Graphics g) {
		background.draw(g);
		rect.draw(g);
		rect2.draw(g);
		rect3.draw(g);
		rect4.draw(g);
	}
	
}
