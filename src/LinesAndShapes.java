import java.awt.*;

import javax.swing.ImageIcon;


public class LinesAndShapes extends DrawableAdapter {
	static LinesAndShapes ga = new LinesAndShapes();
	static GameBoard gb = new GameBoard(ga, "Lines and Shapes");
	
	public static void main(String[] args) {
		showGameBoard(gb);
	}
	
	public void draw (Graphics g){
		Color myNewNavy = new Color (0, 93, 186);
		g.setColor(myNewNavy);
		g.fillRect(0,  0, 600, 550);
		
		g.setColor(Color.YELLOW);
		g.fillOval(20, 20, 460, 460);
		
		g.setColor(myNewNavy);
		g.fillOval(100, 0, 400, 400);
		
		g.setColor(Color.YELLOW);
		int xValue = 200;
		int yValue = 100;
		int x [] = {xValue, xValue+40, xValue+50, xValue+60, xValue+100, xValue+60, xValue+50, xValue+40};
		int y [] = {yValue, yValue-10, yValue-50, yValue-10, yValue, yValue+10, yValue+50, yValue+10};
		g.fillPolygon(x, y, 8);
		
		for (int i = 0; i < x.length; i++) {
			x[i]+=150;
			y[i]+=150; 
		}
		g.fillPolygon(x, y, 8);
		
		g.setFont(new Font("Serif", Font.ITALIC, 62));
		g.drawString("Stellar", 150, 225);
		g.drawString("Studio", 190, 290);
		
		ImageIcon i = new ImageIcon ("seal.png");
		Image image = i.getImage();
		g.drawImage(image, 160, 278, 210, 210, null);
		
		
		
		/*g.setColor(Color.GREEN);
		g.fillRect(0, 0, 500, 550);
		
		g.drawLine(100, 75, 260, 75);
		g.drawLine(300, 50, 400, 100);
		
		g.setColor(Color.DARK_GRAY);
		g.drawRect(100, 170, 100, 600);
		g.fillRect(280, 170, 150, 140);
		
		g.setColor(Color.RED);
		g.drawOval(55, 300, 180, 80);
		g.setColor(Color.BLUE);
		g.fillOval(280, 300, 100, 100); */
	}

}
