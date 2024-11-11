package com.kinaiya.component2;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.geom.Ellipse2D;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

import com.kinaiya.swing.lightBrownButton;

public class homeContentPanel extends JPanel {

	int PanelWidth = 1100;
	int PanelHeight = 500;
	
	boolean change1 = true, change2, change3;
	
	public static lightBrownButton shopNow;

	public homeContentPanel() {

		setBackground(new Color(0, 0, 0, 0));
		setBounds(50, 150, PanelWidth, PanelHeight);
		setLayout(null);
		setOpaque(false);
		addMouseMotionListener(new MouseMotionAdapter() {
			public void mouseMoved(MouseEvent e) {
				
				Ellipse2D circle1 = new Ellipse2D.Double(PanelWidth / 2 - 50, PanelHeight - 10, 10, 10);
				Ellipse2D circle2 = new Ellipse2D.Double(PanelWidth / 2, PanelHeight - 10, 10, 10);
				Ellipse2D circle3 = new Ellipse2D.Double(PanelWidth / 2 - 25, PanelHeight - 10, 10, 10);
				
				if(circle1.contains(e.getPoint())) {
					setCursor(new Cursor(Cursor.HAND_CURSOR));
				}
				else if(circle2.contains(e.getPoint())) {
					setCursor(new Cursor(Cursor.HAND_CURSOR));
				}
				else if(circle3.contains(e.getPoint())) {
					setCursor(new Cursor(Cursor.HAND_CURSOR));
				}
				else {
					setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
				}
			}
		});
		addMouseListener(new MouseAdapter() {
			Ellipse2D circle1 = new Ellipse2D.Double(PanelWidth / 2 - 50, PanelHeight - 10, 10, 10);
			Ellipse2D circle2 = new Ellipse2D.Double(PanelWidth / 2 - 25, PanelHeight - 10, 10, 10);
			Ellipse2D circle3 = new Ellipse2D.Double(PanelWidth / 2, PanelHeight - 10, 10, 10);
			
			public void mouseClicked(MouseEvent e) {
				
				
				
				if(circle1.contains(e.getPoint())) {
					change1 = true;
					change2 = false;
					change3 = false;
					repaint();
				}
				else if(circle2.contains(e.getPoint())) {
					change2 = true;
					change1 = false;
					change3 = false;
					repaint();
				}
				else if(circle3.contains(e.getPoint())) {
					change3 = true;
					change2 = false;
					change1 = false;
					repaint();
				}
			}
		});

		shopNow = new lightBrownButton(C2D8EB, "SHOP NOW", font, fontColor);
		shopNow.setBounds( 200, PanelHeight - 100, 250, 40);
		add(shopNow);

	}

	public void paintComponent(Graphics g) {

		ImageIcon elevateFont = new ImageIcon(
				"C:\\Users\\David\\eclipse-workspace\\kkkk\\ELearning\\src\\fonts\\elevate.png");
		ImageIcon secondFont = new ImageIcon("C:\\Users\\David\\eclipse-workspace\\kkkk\\ELearning\\src\\fonts\\2.png");
		ImageIcon cursiveFont = new ImageIcon(
				"C:\\Users\\David\\eclipse-workspace\\kkkk\\ELearning\\src\\fonts\\cursiveFont.png");
		ImageIcon modelHome1 = new ImageIcon("C:\\Users\\David\\eclipse-workspace\\kkkk\\ELearning\\img\\modelHome1.png");

		Graphics2D g2 = (Graphics2D) g;
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

		g2.setColor(c4ab9c);
		g2.fillRoundRect(50, 70, 550, 90, 40, 40);
		g2.setColor(e1c292);
		g2.fillRoundRect(75, 200, 550, 90, 40, 40);
		g2.setColor(cf9f82);
		g2.fillRoundRect(250, 135, 500, 70, 30, 30);
		

		modelHome1.paintIcon(this, g, PanelWidth - 650, 0);
		elevateFont.paintIcon(this, g, 50, 40);
		secondFont.paintIcon(this, g, 180, 125);
		cursiveFont.paintIcon(this, g, -60, 0);

		super.paintComponent(g);
	}
	

	Color c4ab9c = new Color(196, 171, 156);
	Color e1c292 = new Color(225, 194, 146);
	Color cf9f82 = new Color(207, 159, 130);
	Color C2D8EB = new Color(194, 216, 235);

	Font font = new Font("Arial", Font.PLAIN, 25);
	Color fontColor = Color.black;

}
