package com.kinaiya.component2;


import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionAdapter;
import java.awt.geom.Ellipse2D;
import java.awt.Font;
import java.awt.GradientPaint;

import javax.swing.ImageIcon;
import javax.swing.JPanel;


public class HomePanel extends JPanel{

	Color mainColor = new Color(117, 89, 70);
	Color effectColor = new Color(117, 89, 70, 180);
	Color e4dfd5 = new Color(228, 223, 213);
	Color cf9f82 = new Color(207, 159, 130);
	Color bdb8ad = new Color(189, 184, 173);
	Color c4ab9c = new Color(196, 171, 156);
	Color e1c292 = new Color(225, 194, 146);
	Color c3ddda = new Color(195, 221, 218);
	Color ffebcc = new Color(255, 235, 204);
	Color _755946_ = new Color(117, 89, 70);
	Color _887E9D = new Color(136, 126, 157);
	Color transparent = new Color(0, 0, 0, 0);
	
	
	
	Color fontColor = Color.black;
	
	Font font = new Font("Arial", Font.PLAIN, 25);
	
	homeContentPanel homeContentPanel;
	homeContentPanel2 homeContentPanel2;
	homeContentPanel3 homeContentPanel3;
	
	boolean change1 = true, change2, change3;
	
	int width = 1200;
	int height = 700;
	
	int circleTabX = width / 2;
	int circleTabY = height - 40;

	public HomePanel() {
		
		setBounds(0, 0, width, height);
		setLayout(null);
		setOpaque(false);
		
		homeContentPanel = new homeContentPanel();
		homeContentPanel2 = new homeContentPanel2();
		homeContentPanel3 = new homeContentPanel3();
		
		add(homeContentPanel);
		add(homeContentPanel2);
		add(homeContentPanel3);
		
		
		addMouseMotionListener(new MouseMotionAdapter() {
			public void mouseMoved(MouseEvent e) {
				Ellipse2D circle1 = new Ellipse2D.Double(circleTabX - 20, circleTabY, 10, 10);
				Ellipse2D circle2 = new Ellipse2D.Double(circleTabX, circleTabY, 10, 10);
				Ellipse2D circle3 = new Ellipse2D.Double(circleTabX + 20, circleTabY, 10, 10);
				
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
			Ellipse2D circle1 = new Ellipse2D.Double(circleTabX - 20, circleTabY, 10, 10);
			Ellipse2D circle2 = new Ellipse2D.Double(circleTabX, circleTabY, 10, 10);
			Ellipse2D circle3 = new Ellipse2D.Double(circleTabX + 20, circleTabY, 10, 10);
			
			public void mouseClicked(MouseEvent e) {
				
				if(circle1.contains(e.getPoint())) {
					change1 = true;
					change2 = false;
					change3 = false;
					repaint();
					changeHome(homeContentPanel);
					
				}
				else if(circle2.contains(e.getPoint())) {
					change2 = true;
					change1 = false;
					change3 = false;
					repaint();
					changeHome(homeContentPanel2);
				}
				else if(circle3.contains(e.getPoint())) {
					change3 = true;
					change2 = false;
					change1 = false;
					repaint();
					changeHome(homeContentPanel3);
				}
			}
		});
		
		
		
	}
	public void paintComponent(Graphics g) {
		
		Graphics2D g2 = (Graphics2D) g;
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		
		super.paintComponent(g);
		GradientPaint gra = new GradientPaint(0, 0, e4dfd5, width, 0, _887E9D);
		
		g2.setPaint(gra);
		g2.fillRect(0, 0, width, height);
		g2.setColor(change1 ? Color.black : Color.gray);
		g2.fillOval(circleTabX - 20, circleTabY, 10, 10);
		g2.setColor(change2 ? Color.black : Color.gray);
		g2.fillOval(circleTabX, circleTabY, 10, 10);
		g2.setColor(change3 ? Color.black : Color.gray);
		g2.fillOval(circleTabX + 20, circleTabY, 10, 10);
		
	}
	public void changeHome(JPanel panel) {
		homeContentPanel.setVisible(false);
		homeContentPanel2.setVisible(false);
		homeContentPanel3.setVisible(false);
		panel.setVisible(true);
	}
}
