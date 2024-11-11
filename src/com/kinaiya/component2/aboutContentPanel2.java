package com.kinaiya.component2;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class aboutContentPanel2 extends JPanel {

	int PanelWidth = 1100;
	int PanelHeight = 500;
	
	public aboutContentPanel2() {
		
		setBounds(50, 150, PanelWidth, PanelHeight);
		setLayout(null);
		setOpaque(false);
		setVisible(false);
		
	}
	public void paintComponent(Graphics g) {

		Graphics2D g2 = (Graphics2D) g;
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		
		ImageIcon elevateFont = new ImageIcon(
				"C:\\Users\\David\\eclipse-workspace\\kkkk\\ELearning\\img\\about2.png");
		
		elevateFont.paintIcon(this, g2, 0, 0);
		

		super.paintComponent(g);
	}
}
