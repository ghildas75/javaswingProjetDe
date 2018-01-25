import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;

import javax.swing.JPanel;

public class PanelPhoto extends JPanel {
private BufferedImage bi;
	public void paintComponent (Graphics g){
		g.drawImage(bi,0,0,this);
	}
	public BufferedImage getBi() {
		return bi;
	}
	public void setBi(BufferedImage bi) {
		this.bi = bi;
	}

}
