package com.kinaiya.component2;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

import com.kinaiya.swing.lightBrownButton;

public class homeContentPanel2 extends JPanel{
	
	int PanelWidth = 1100;
	int PanelHeight = 500;
	
	public static lightBrownButton shopNow;
	
	public homeContentPanel2() {
		
		setBackground(new Color(0, 0, 0, 0));
		setBounds(50, 150, PanelWidth, PanelHeight);
		setLayout(null);
		setOpaque(false);
		setVisible(false);
		
		shopNow = new lightBrownButton(C2D8EB, "SHOP NOW",  font, fontColor);
		shopNow.setBounds(PanelWidth - 500, PanelHeight - 100, 250, 40);
		add(shopNow);

	}

	public void paintComponent(Graphics g) {

		ImageIcon modelHome2 = new ImageIcon("C:\\Users\\David\\eclipse-workspace\\kkkk\\ELearning\\img\\modelHome2.png");
		ImageIcon lookBest = new ImageIcon("C:\\Users\\David\\eclipse-workspace\\kkkk\\ELearning\\img\\lookBest.png");
		ImageIcon starKeme = new ImageIcon("C:\\Users\\David\\eclipse-workspace\\kkkk\\ELearning\\img\\starKeme.png");
		ImageIcon kinaiya = new ImageIcon("C:\\Users\\David\\eclipse-workspace\\kkkk\\ELearning\\img\\kinaiya.png");
		
		int iconsWidth = -kinaiya.getIconWidth() / 3 - 15;
		int iconsHeight = -kinaiya.getIconHeight() / 2 + 30;
		
		
		
		Graphics2D g2 = (Graphics2D) g;
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

		g2.setColor(C2D8EB);
		g2.fillRoundRect(PanelWidth / 2 + 220, 100, 220, 50, 20, 20);
		kinaiya.paintIcon(this, g, iconsWidth + PanelWidth / 2 + 200, iconsHeight + 50);
		lookBest.paintIcon(this, g, 400, 25);
		modelHome2.paintIcon(this, g, 0, 0);
		starKeme.paintIcon(this, g, PanelWidth - 500, PanelHeight - 100);
		

		super.paintComponent(g);
	}

	Color c4ab9c = new Color(196, 171, 156);
	Color e1c292 = new Color(225, 194, 146);
	Color cf9f82 = new Color(207, 159, 130);
	Color C2D8EB = new Color(194, 216, 235);

	Font font = new Font("Arial", Font.PLAIN, 25);
	Color fontColor = Color.black;
}
