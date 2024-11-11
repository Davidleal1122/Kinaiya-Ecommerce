package JOptionPaneCustomize;

import java.awt.BasicStroke;
import java.awt.Font;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.Area;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JPanel;

import com.kinaiya.swing.button;

public class Background extends JPanel {

	JOptionPaneExit JOption;
	JDialog dialog;
	public button OKAY_BUTTON = new button();
	public button noButton = new button();
    public button yesButton = new button();
    Font font = new Font("Segoe UI Semibold", Font.PLAIN, 14);
	
    public Background() {
        init();
    }

    private void init() {
        setOpaque(false);
        setLayout(null);
        setBackground(new Color(245, 245, 245));
        setForeground(new Color(118, 118, 118));
        yesButton.setBounds(70, 150, 70, 20);
        yesButton.setText("YES");
        yesButton.addMouseListener(new MouseAdapter() {
        	public void mouseClicked(MouseEvent e) {
        		System.exit(0);
        	}
        });
		add(yesButton);
		
		noButton.setBounds(170, 150, 70, 20);
		noButton.setText("NO");
		
		add(noButton);
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        int x = 0;
        int y = 40;
        int width = getWidth();
        int height = getHeight();
        int iconSpace = 7;
        int totalIconSpace = iconSpace * 2;
        int iconSize = y * 2;
        int iconX = (width - (iconSize + totalIconSpace)) / 2;
        int iconY = 0;
        g2.setColor(Color.black);
        Area area = new Area(new Rectangle2D.Double(x, y, width, height - y));
        area.subtract(new Area(new Ellipse2D.Double(iconX, iconY - iconSpace, iconSize + totalIconSpace, iconSize + totalIconSpace)));
        g2.fillOval(iconX + iconSpace, 0, iconSize - 1, iconSize - 1);
        area.add(new Area(new Ellipse2D.Double((iconX + iconSpace) + 2, 2, iconSize - 5, iconSize - 5)));
        area.add(new Area(new Ellipse2D.Double((iconX + iconSpace), 100, iconSize - 5, iconSize - 5)));
        g2.setColor(new Color(240, 240, 240));
        g2.fill(area);
        g2.setColor(Color.black);
        g2.setFont(font);
        g2.fillRect(width - 2, y, 10, height);
        g2.fillRect(0, height - 2, width, 10);
        g2.fillRect(0, y, 2, height);
        g2.fillRect(0, y, 102, 2);
        g2.fillRect(getWidth() - 102, y, 102, 2);
        g2.setStroke(new BasicStroke(2));
        g2.drawArc(102, -4, iconSize + 15, iconSize + 10, 0, -180);
        g2.drawString("Are you sure you want to exit?", getWidth()/2-90, getHeight()/2 + 40);
        
        ImageIcon icon = new ImageIcon("C:\\Users\\cabre\\eclipse-workspace\\ELearning\\img\\questionLogo.png");
		icon.paintIcon(this, g, 125, 20);
        g2.dispose();
        super.paintComponent(g);
    }
}
