package com.kinaiya.component2;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

import com.kinaiya.swing.lightBrownButton;

public class homeContentPanel3 extends JPanel {

	int PanelWidth = 1100;
	int PanelHeight = 500;

	public static lightBrownButton shopNow;
	
	public homeContentPanel3() {

		setBackground(new Color(0, 0, 0, 0));
		setBounds(50, 150, PanelWidth, PanelHeight);
		setLayout(null);
		setOpaque(false);
		setVisible(false);

		shopNow = new lightBrownButton(C2D8EB, "SHOP NOW",  font, fontColor);
		shopNow.setBounds(PanelWidth / 2 - 300, PanelHeight - 150, 250, 40);
		add(shopNow);

	}
	public void paintComponent(Graphics g) {

		ImageIcon modelHome3 = new ImageIcon("C:\\Users\\David\\eclipse-workspace\\kkkk\\ELearning\\img\\modelHome3.png");
		
		
		
		
		
		Graphics2D g2 = (Graphics2D) g;
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

		modelHome3.paintIcon(this, g, 0, 0);
		

		super.paintComponent(g);
	}

	Color C2D8EB = new Color(194, 216, 235);
	Font font = new Font("Arial", Font.PLAIN, 25);
	Color fontColor = Color.black;
}
